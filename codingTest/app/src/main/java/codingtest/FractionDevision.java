package codingtest;

public class FractionDevision {
  public int[] solution(int num1, int denom1, int num2, int denom2) {
    int[] answer = {0, 0};
    int top = denom1 * num2 + num1 * denom2;
    int bottom =  denom1 * denom2;
    int lcm = 1;

    for(int i = 1; i <= bottom && i <= top; i++) {
      if(bottom % i == 0 && top % i == 0) {
        lcm = i;
      }
    }

    answer[0] = top / lcm;
    answer[1] = bottom / lcm;

    return answer;
  }
}
