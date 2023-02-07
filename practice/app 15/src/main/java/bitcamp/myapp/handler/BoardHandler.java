package bitcamp.myapp.handler;

import bitcamp.myapp.dao.BoardDao;
import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Board;

public class BoardHandler {
	private BoardDao boardDao = new BoardDao();
	private String title;

	public BoardHandler(String title) {
		this.title = title;
	}

	private void inputBoard() {
		Board b = new Board();
		b.setTitle(Prompt.inputString("title? "));;
		b.setContent(Prompt.inputString("content? "));;
		b.setPassword(Prompt.inputString("password? "));;
		boardDao.insert(b);
	}

	private void printBoards() {
		System.out.println("번호\ttitle\tcount\tviewcount");
		Object[] boards = this.boardDao.findAll();

		for (Object obj : boards) {
			Board b = (Board) obj;
			System.out.printf("%d\t%s\t%s\t%s\n",
					b.getNo(), b.getTitle(), b.getContent(), b.getViewCount());
		}
	}

	private void printBoard() {
		int boardNo = Prompt.inputInt("게시글 번호? ");
		Board b = this.boardDao.findByNo(boardNo);

		if (b == null) {
			System.out.println("해당 번호의 글이 없습니다.");
			return;
		}

		System.out.printf("    이름: %s\n", b.getTitle());
		System.out.printf("    전화: %s\n", b.getContent());
		System.out.printf("  조회수: %s\n", b.getViewCount());
		System.out.printf("  등록일: %s\n", b.getCreatedDate());
		b.setViewCount(b.getViewCount() + 1);
	}

	private void modifyBoard() {
		int boardNo = Prompt.inputInt("게시글 번호? ");
		Board old = this.boardDao.findByNo(boardNo);

		if (old == null) {
			System.out.println("해당 번호의 남바가 없습니다.");
			return;
		}

		Board b = new Board();
		b.setNo(old.getNo());
		b.setCreatedDate(old.getCreatedDate());
		b.setTitle(Prompt.inputString(String.format("제목(%s)? ", old.getTitle())));
		b.setContent(Prompt.inputString(String.format("내용(%s)? ", old.getContent())));
		b.setPassword(Prompt.inputString("비밀바노? "));

		if (!old.getPassword().equals(b.getPassword())) {
			System.out.println("암호가 이게 아닌데?");
			return;
		}

		String str = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
		if (str.equalsIgnoreCase("Y")) {
			this.boardDao.update(b);
			System.out.println("변경했습니다.");
		} else {
			System.out.println("변경 취소했습니다.");
		}

	}

	private void deleteBoard() {
		int boardNo = Prompt.inputInt("게시글 번호? ");

		Board b = this.boardDao.findByNo(boardNo);

		if (b == null) {
			System.out.println("해당 번호의 글이 없습니다.");
			return;
		}

		String password = Prompt.inputString("암호? ");
		if (!b.getPassword().equals(password)) {
			System.out.println("암호가 이게 아닌데?");
			return;
		}

		String str = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
		if (!str.equalsIgnoreCase("Y")) {
			System.out.println("삭제 취소했습니다.");
			return;
		}

		this.boardDao.delete(b);
		System.out.println("삭제했습니다.");
	}

	private void searchBoard() {
		Object[] boards = this.boardDao.findAll();
		String keyword = Prompt.inputString("이름? ");
		System.out.println("번호\t제목\t내용\t작성일\t조회수");

		for (Object obj : boards) {
			Board b = (Board) obj;

			if (b.getTitle().indexOf(keyword) != -1 || b.getContent().indexOf(keyword) != -1) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\n",
						b.getNo(), b.getTitle(), b.getContent(), b.getCreatedDate(), b.getViewCount());
			}
		}
	}

	public void service() {
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
