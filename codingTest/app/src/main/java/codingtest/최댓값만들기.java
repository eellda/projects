package codingtest;

// 정수 배열 numbers
// numbers 의 원소중 두 개를 곱해 만들 수 있는 최댓값을 return 해보자
// 0 <= numbers.length <= 100
// numbers <= 10000




public class 최댓값만들기 {

  public int solution(int[] numbers) {
    int max = 0;
    int mideum = 0;
    int maxIdx = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] >= max) {
        max = numbers[i];
        maxIdx = i;
      }
    }

    for (int i = 0; i < numbers.length; i++) {
       if (i != maxIdx && numbers[i] > mideum) {
        mideum = numbers[i];
      }
    }


    return max * mideum;
  }

//  int answer = 0;
//  Arrays.sort(numbers);
//  return numbers[numbers.length-1]*numbers[numbers.length-2];
}
