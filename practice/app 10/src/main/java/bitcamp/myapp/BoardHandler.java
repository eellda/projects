package bitcamp.myapp;

import java.sql.Date;

public class BoardHandler {

  final int SIZE = 100;
  int count;
  Board[] boards = new Board[SIZE];
  String title;

  BoardHandler(String title) {
    this.title = title;
  }

  void inputBoard() {
    Board b = new Board();
    b.no = Prompt.inputInt("번호? ");
    b.title = Prompt.inputString("title? ");
    b.content = Prompt.inputString("content? ");
    b.password = Prompt.inputString("password? ");
    b.createdDate = new Date(System.currentTimeMillis()).toString();

    boards[count++] = b;
  }

  void printBoards() {
    System.out.println("번호\ttitle\tcount\tviewcount");

    for (int i = 0; i < count; i++) {
      Board b = boards[i];
      System.out.printf("%d\t%s\t%s\t%s\n",
          b.no, b.title, b.content, b.viewCount);
    }
  }

  void printBoard() {
    int boardNo = Prompt.inputInt("게시글 번호? ");

    Board b = findByNo(boardNo);

    if (b == null) {
      System.out.println("해당 번호의 글이 없습니다.");
      return;
    }

    System.out.printf("    이름: %s\n", b.title);
    System.out.printf("    전화: %s\n", b.content);
    System.out.printf("우편번호: %s\n", b.viewCount);
    System.out.printf("  등록일: %s\n", b.createdDate);
  }

  void modifyBoard() {
    int boardNo = Prompt.inputInt("게시글 번호? ");

    Board old = findByNo(boardNo);

    if (old == null) {
      System.out.println("해당 번호의 글이 없습니다.");
      return;
    }

    // 변경할 데이터를 저장할 인스턴스 준비
    Board b = new Board();
    b.no = old.no;
    b.createdDate = old.createdDate;
    b.title = Prompt.inputString(String.format("제목(%s)? ", old.title));
    b.content = Prompt.inputString(String.format("내용(%s)? ", old.content));
    b.password = Prompt.inputString(String.format("암호(%s)? ", old.password));

    if (!old.password.equals(b.password)) {
      System.out.println("암호가 이게 아닌데?");
      return;
    }

    String str = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
    if (str.equalsIgnoreCase("Y")) {
      boards[indexOf(old)] = b;
      System.out.println("변경했습니다.");
    } else {
      System.out.println("변경 취소했습니다.");
    }

  }

  void deleteBoard() {
    int boardNo = Prompt.inputInt("게시글 번호? ");

    Board b = findByNo(boardNo);

    if (b == null) {
      System.out.println("해당 번호의 글이 없습니다.");
      return;
    }

    String str = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
    if (!str.equalsIgnoreCase("Y")) {
      System.out.println("삭제 취소했습니다.");
      return;
    }

    for (int i = indexOf(b) + 1; i < count; i++) {
      boards[i - 1] = boards[i];
    }
    boards[--count] = null; // 레퍼런스 카운트를 줄인다.

    System.out.println("삭제했습니다.");

  }

  Board findByNo(int no) {
    for (int i = 0; i < count; i++) {
      if (boards[i].no == no) {
        return boards[i];
      }
    }
    return null;
  }

  int indexOf(Board m) {
    for (int i = 0; i < count; i++) {
      if (boards[i].no == m.no) {
        return i;
      }
    }
    return -1;
  }

  void searchBoard() {
    String keyword = Prompt.inputString("이름? ");

    System.out.println("번호\t제목\t내용\t작성일\t조회수");

    for (int i = 0; i < count; i++) {
      Board b = boards[i];
      if (b.title.indexOf(keyword) != -1 || b.content.indexOf(keyword) != -1) {
        System.out.printf("%d\t%s\t%s\t%s\t%s\n",
            b.no, b.title, b.content, b.createdDate, b.viewCount);
      }
    }
  }

  void service() {
    while (true) {
      System.out.println(title);
      System.out.println("1. 등록");
      System.out.println("2. 목록");
      System.out.println("3. 조회");
      System.out.println("4. 변경");
      System.out.println("5. 삭제");
      System.out.println("6. 검색");
      System.out.println("0. 이전");
      int menuNo = Prompt.inputInt(String.format("%s> ", title));

      switch (menuNo) {
        case 0: return;
        case 1: inputBoard(); break;
        case 2: printBoards(); break;
        case 3: printBoard(); break;
        case 4: modifyBoard(); break;
        case 5: deleteBoard(); break;
        case 6: searchBoard(); break;
        default:
          System.out.println("잘못된 메뉴 번호 입니다.");
      }
    }
  }
}
