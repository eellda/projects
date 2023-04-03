package codingtest;

// 피자헛은 피자를 여섯 조각으로 잘라줌
// 피자를 나눠먹을 사람의 수 n
// n 명이 주문한 피자를 남기지 않고 모두 같은 수의 피자 조각을 먹어야 한다면
// 최소 몇판을 시켜야 될까


public class 피자나눠먹기2 {

  public int solution(int n) {
    int answer = 0;

    while (true) {
      if (6 * answer % n == 0) {
        break;
      }
    answer++;
    }
    return answer;
  }
}
