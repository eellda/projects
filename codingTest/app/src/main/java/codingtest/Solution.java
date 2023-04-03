package codingtest;

public class Solution {
  public int solution(int angle) {
    int answer = 0;

    if (angle == 180) {
      answer = 4;
    } else if (180 > angle && angle > 90) {
      answer = 3;
    } else if (angle == 90) {
      answer = 2;
    } else {
      answer = 1;
    }

    return answer;
  }

  public int solution2(int angle) {
    return angle == 180 ? 4 : angle < 90 ? 1 : angle == 90 ? 2 : 3;
  }
}


