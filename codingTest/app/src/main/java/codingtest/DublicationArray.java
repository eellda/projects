package codingtest;

import org.checkerframework.checker.units.qual.A;

public class DublicationArray {
  public int solution(int[] Array, int n) {
    int answer = 0;

//    for (int i = 0; i < Array.length; i++) {
//      if (Array[i] == n) {
//        answer++;
//      }
//    }

    for (int num : Array) {
      if (num == n) {
        answer++;
      }
    }
    return answer;
  }
}
