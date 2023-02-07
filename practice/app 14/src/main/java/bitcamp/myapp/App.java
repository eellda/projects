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

		while (true) {
			System.out.println("1. 일반학생관리");
			System.out.println("2. 선생관리");
			System.out.println("3. 게시판");
			System.out.println("9. 종료");
			int menuNo = Prompt.inputInt("메뉴> ");

			if (menuNo == 1) {
				studentHandler.service();
			} else if (menuNo == 2) {
				teacherHandler.service();
			} else if (menuNo == 3) {
				boardHandler.service();
			} else if (menuNo == 9) {
				break;
			} else {
				System.out.println("잘못된 메뉴 번호 입니다.");
			}
		}
	}
}









