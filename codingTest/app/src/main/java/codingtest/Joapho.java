package codingtest;

//  사분면은 한 평면을 x축과 y축을 기준으로 나눈 네 부분
//  시계 방향으로 1~4 번호를 매김
//  x 좌표와 y 좌표가 모두 양수이면 제1사분면에 속합니다.
//  x 좌표가 음수, y 좌표가 양수이면 제2사분면에 속합니다.
//  x 좌표와 y 좌표가 모두 음수이면 제3사분면에 속합니다.
//  x 좌표가 양수, y 좌표가 음수이면 제4사분면에 속합니다.
//  x 좌표 (x, y)를 차례대로 담은 정수 배열 dot이 매개변수로 주어짐
//  이때 dot이 어느 사분면에 속하는지 return

public class Joapho {
  public int solution(int[] dot) {
    int answer = 0;

    int x = dot[0];
    int y = dot[1];

    if (x  > 0 && y > 0) {
      answer = 1;
    } else if (x < 0 && y > 0) {
      answer = 2;
    } else if (x < 0 && y < 0) {
      answer = 3;
    } else {
      answer = 4;
    }



    return answer;

//    int answer = 0;
//    if(dot[0] > 0)
//      if(dot[1] > 0) answer = 1;
//      else answer = 4;
//    else
//    if(dot[1] > 0) answer = 2;
//    else answer = 3;
//
//
//    return answer;

  }
}
