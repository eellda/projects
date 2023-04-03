package codingtest;
// 정수 배열 numbers 가 매개변수로 주어짐
// numbers 의 각 원소에 두배한 원소를 가진 배열을 return

public class DoubleArray {
  public int[] solution(int[] numbers) {

    int[] answer = new int[numbers.length];

    for (int i = 0; i < numbers.length; i++) {
      answer[i] = numbers[i] * 2;
    }
    return answer;

//    return Arrays.stream(numbers).map(i -> i * 2).toArray();
    // 다른사람
  }
}
