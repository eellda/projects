package codingtest;
// 10인분 먹으면 음료수 1 서비스
// 양꼬치 1인분 12000원
// 음료수 1개 2000원
// 매개변수 n, k
// 양꼬치 n인분, 음료수 k개 주문시 가격

public class Yanggochi {
  public int solution(int n, int k) {

    int yang = n * 12000;
    int drink = k * 2000;

    for (int i = 0; i <= n; i++) {
      if (i != 0 && i % 10 == 0) drink -= 2000;
    }

    return yang + drink;
  }
}
