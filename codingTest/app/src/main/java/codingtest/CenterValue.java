package codingtest;
// 중앙값은 어떤 주어진 값들을 크기의 순서대로 정렬했을 때 가장 중앙에 위치하는 값을 의미함
// 1, 2, 7, 19, 11 의 중앙값은 7
// 정수 배열 Array가 매개변수로 주어질 때, 중앙값을 return 해라

import java.util.Arrays;

public class CenterValue {
  public int solution(int[] Array) {
    int answer = 0;

    int[] arr = new int[Array.length];

    for (int i = 0; i < Array.length; i++) {
      arr[i] = Array[i];
    }
    Arrays.sort(arr, 0, arr.length);
    answer = arr[arr.length / 2];

    return answer;
  }

//  Arrays.sort(array);
//        return array[array.length >> 1];
}
