package codingtest;

// 머쓱이네 피자가게는 피자를 두조각 ~ 열조긱까지 원하는 조각수로 잘라준다
// 피자 조각수를 slice
// 피자를 먹는 사람수 n
// n명의 사람이 최소 한 조각 이상 피자를 먹으려면
// 최소 몇 판의 피자가 필요할까

// slice = 2 ~ 10
// 1 <= n <= 100

public class 피자나눠먹기3 {

  public int solution(int slice, int n) {

    return slice % n == 0? slice / n : slice + 1 / n;
  }

}
