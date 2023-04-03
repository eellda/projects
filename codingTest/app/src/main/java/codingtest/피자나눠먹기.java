package codingtest;
// 도미노 피자는 피자를 일곱 조각으로 잘라준다
// 피자를 나눠먹을 사람의 수 n
// 모든 사람이 피자를 한조각 이상 먹기 위해 필요한 피자의 수를 return 해보자

public class 피자나눠먹기 {
  public int solution(int n) {


    int cnt = n / 7;

    if (n % 7 != 0) {
      cnt++;
    }

    return cnt;

//    return (n + 6) / 7;
  }
}
