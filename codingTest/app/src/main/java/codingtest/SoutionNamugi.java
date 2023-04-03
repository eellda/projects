package codingtest;

import java.util.Arrays;

public class SoutionNamugi {
  public double solution(int[] n) {
    double answer  = 0;

    for (int j : n) {
      System.out.println(j);
      answer += j;
    }

    return answer / n.length;
    //return Arrays.stream(numbers).average().orElse(0);

  }
}
