package ost;

import ost.handler.BoardHandler;
import ost.util.Prompt;

public class App {

  public static void main(String[] args) {

    goMainMenu();
    System.out.println("Have a Nice day~!");
    Prompt.close();

  }

  private static void goMainMenu() {

    BoardHandler boardHandler = new BoardHandler("OST");

    loop: while (true) {

      System.out.println("1. 노래");
      System.out.println("9. 종료");
      int menuNo;

      try {
        menuNo = Prompt.inputInt("menu >> ");

      } catch (Exception e) {
        System.out.println("menu 번호가 옳지 않습니다..");
        continue;
      }

      try {
        switch (menuNo) {
          case 1: boardHandler.service(); break;
          case 9: break loop;
          default:
            System.out.println("잘못된 menu");
        }
      } catch (Exception e) {
        System.out.printf("명령 실행중 오류 발생 - %s // %s\n",
            e.getMessage(), e.getClass().getSimpleName());
      }
    }
  }
}
