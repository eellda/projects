package codingtest;

// 머쓱이는 얼죽아다
// 한잔의 5500원
// 머쓱이가 가지고 있는 돈을 money 라고 할때
// 머쓱이가 최대로 마실 수 있는 잔 수와 남는 돈을 배열에 담자

// money <= 1,000,000

import java.util.ArrayList;

public class 아이스아메리카노 {
  public ArrayList solution(int money) {
    ArrayList answer = new ArrayList<>();

      answer.add(money / 5500);
    System.out.println(money);
      answer.add(money % 5500);
      answer.toString();

    return answer;

//    return new int[] { money / 5500, money % 5500 };
  }
}
