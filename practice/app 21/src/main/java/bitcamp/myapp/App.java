package bitcamp.myapp;

import bitcamp.myapp.handler.BoardHandler;
import bitcamp.myapp.handler.StudentHandler;
import bitcamp.myapp.handler.TeacherHandler;
import bitcamp.myapp.util.Prompt;

public class App {

	public static void main(String[] args) {
		goMainMenu();
		System.out.println("안녕히 가세요!");
		Prompt.close();
	}

	private static void goMainMenu() {
		StudentHandler studentHandler = new StudentHandler("학생");
		TeacherHandler teacherHandler = new TeacherHandler("선생");
		BoardHandler boardHandler = new BoardHandler("게시판");

		loop: while (true) {
			System.out.println("1. 일반학생관리");
			System.out.println("2. 선생관리");
			System.out.println("3. 게시판");
			System.out.println("9. 종료");
			int menuNo;
			try {
				menuNo = Prompt.inputInt("메뉴> ");
			} catch (Exception e) {
				System.out.println("menu namba is wrong!");
				continue;
			}

			try {
				switch (menuNo) {
				case 1: studentHandler.service(); break;
				case 2: teacherHandler.service(); break;
				case 3: boardHandler.service(); break;
				case 9: break loop;
				default:
					System.out.println("잘못된 메뉴 번호 입니다.");
				}
			} catch (Exception e) {
				System.out.printf("instruction 실행중 error 발생! = %s : %s\n",
						e.getMessage(), e.getClass().getSimpleName());
			}
		}
	}
}









