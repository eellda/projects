package bitcamp.myapp;

public class App {

  public static void main(String[] args) {
    goMainMenu();
    System.out.println("안녕히 가세요!");

    // 프로그램이 사용한 자원 해제하기
    Prompt.close();
  } // main()

  private static void goMainMenu() {
    MemberHandler generalMemberHandler = new MemberHandler("일반학생");
    MemberHandler specialMemberHandler = new MemberHandler("유학생");
    MemberHandler highMemberHandler = new MemberHandler("고급학생");
    BoardHandler boardHandler = new BoardHandler("게시판");

    while (true) {
      System.out.println("1. 일반학생관리");
      System.out.println("2. 국비지원학생관리");
      System.out.println("3. 위탁교육생관리");
      System.out.println("4. 게시판");
      System.out.println("9. 종료");
      int menuNo = Prompt.inputInt("메뉴> ");

      if (menuNo == 1) {
        generalMemberHandler.service();
      } else if (menuNo == 2) {
        specialMemberHandler.service();
      } else if (menuNo == 3) {
        highMemberHandler.service();
      } else if (menuNo == 4) {
        boardHandler.service();
      } else if (menuNo == 9) {
        break;
      } else {
        System.out.println("잘못된 메뉴 번호 입니다.");
      }
    }
  }

} // class App









