package codingtest;
// 정수 n 이 매개변수로 주어진다
// n 이하의 홀수가 오름차순으로 담긴 배열을 return



import java.util.stream.IntStream;

public class OddArray {
//  public ArrayList solution(int n) {
//
//
//    ArrayList<Integer> list = new ArrayList<>();
//
//    for (int i = 1; i <= n; i += 2) {
//      list.add(i);
//    }
//
//    return list;
//  }

  public int[] solution(int n) {
    return IntStream.rangeClosed(1, n).filter(i -> i % 2 == 1).toArray();
  }
}
