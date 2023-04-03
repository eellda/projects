package codingtest;

// 옷가게는 10만원 이상 사면 5%
// 30만원 이상 사면 10%
// 50만원 이상 사면 20%
// 할인 해준다.
// 구매한 옷의 가격을 price
// 지불해야 할 금액을 retrun

// 10 <= price <= 1,000,000
// 소수점 이하 버린 정수를 return

public class 옷가게할인받기 {
  public int solution(int price) {

    if (price >= 500000) return (int) Math.floor(price * 0.8);
    else if (price >= 300000) return (int) Math.floor(price * 0.9);
    else if (price >= 100000) return (int) Math.floor(price * 0.95);
    else return price;

  }
}
