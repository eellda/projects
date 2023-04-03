package codingtest;
// 최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미함
// 정수 배열 array가 매개변수로 주어짐
// 이때의 최빈값을 return 하도록 solution 작성
// 단 최빈값이 여러개면 -1 return

import java.util.Arrays;

public class ModeValue {
  public int solution(int[] array) {

    int answer = 0;
    int max = 0;

    Arrays.sort(array);
    max = array[array.length - 1];

    int[] count = new int[max + 1];

    for (int i = 0; i < array.length; i++) {
      count[array[i]]++;
    }
    max = count[0];

    for (int i = 1; i < count.length; i++) {
      if (max < count[i]) {
        max = count[i];
        answer = i;
      } else if (max == count[i]) {
        answer = -1;
      }
    }
    return answer;
  }

//  int maxCount = 0;
//  int answer = 0;
//  Map<Integer, Integer> map = new HashMap<>();
//        for(int number : array){
//    int count = map.getOrDefault(number, 0) + 1;
//    if(count > maxCount){
//      maxCount = count;
//      answer = number;
//    }
//    else  if(count == maxCount){
//      answer = -1;
//    }
//    map.put(number, count);
//  }
//        return answer;
}
