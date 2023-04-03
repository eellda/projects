package ost.handler;

import java.sql.Date;
import java.util.LinkedList;
import ost.dao.BoardDao;
import ost.util.Prompt;
import ost.vo.Board;

public class BoardHandler {

  private BoardDao boardDao = new BoardDao(new LinkedList<Board>());
  private String title;

  public BoardHandler(String title) {
    this.title = title;
  }

  private void inputBoard() {

    Board b = new Board();
    b.setName(Prompt.inputString("이름? "));
    b.setContent(Prompt.inputString("내용? "));
    b.setCreatedDate(new Date(System.currentTimeMillis()).toString());

    this.boardDao.insert(b);
    System.out.println("등록 완료!");
  }

  private void printBoards() {

    System.out.println("번호\t이름\t내용\t생성일");

    Object[] boards = this.boardDao.findAll();

    for (Object obj : boards) {
      Board b = (Board) obj;
      System.out.printf("%d\t%s\t%s\t%s\n",
          b.getNo(), b.getName(), b.getContent(), b.getCreatedDate());
    }
  }


  private void printBoard() {

    int boardNo = Prompt.inputInt("OST 번호? ");
    Board b = this.boardDao.findByNo(boardNo);

    if (b == null) {
      System.out.println("해당 번호의 OST 는 없습니다.");
      return;
    }

    System.out.printf("   이름: %s\n", b.getName());
    System.out.printf("   내용: %s\n", b.getContent());
    System.out.printf(" 조회수: %s\n", b.getViewCount());
    System.out.printf(" 생성일: %s\n", b.getCreatedDate());
    b.setViewCount(b.getViewCount() + 1);
  }

  private void deleteBoard() {

    int boardNo = Prompt.inputInt("삭제 번호 >> ");

    Board b = this.boardDao.findByNo(boardNo);

    if (b == null) {
      System.out.println("해당 번호의 OST 가 없습니다.");
      return;
    }

    String str = Prompt.inputString("정말 삭제 하시겠습니까? (y/N) ");

    if (!str.equalsIgnoreCase("Y")) {
      System.out.println("삭제 취소 했습니다.");
      return;
    }

    this.boardDao.delete(b);
    System.out.println("OST 삭제 완료");
  }

  public void service() {
    boardDao.load("board.data");

    while (true) {
      System.out.printf("[%s] LIST\n", this.title);
      System.out.println("1. 등록");
      System.out.println("2. 목록");
      System.out.println("3. 조회");
      System.out.println("4. 삭제");
      System.out.println("0. 이전");
      int menuNo = Prompt.inputInt(String.format("[%s] meun >> \n", this.title));

      switch (menuNo) {
        case 0: boardDao.save("board.data"); return;
        case 1: inputBoard(); break;
        case 2: printBoards(); break;
        case 3: printBoard(); break;
        case 4: deleteBoard(); break;
        default:
          System.out.println("잘못된 menu");
      }
    }
  }
}
