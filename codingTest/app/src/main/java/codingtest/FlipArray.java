package codingtest;
// 정수가 들어있는 배열인 num_list
// 이 num_list의 순서를 뒤집혀보자


public class FlipArray {
  public int[] solution(int[] num_list) {
    int[] answer = new int[num_list.length];
    int idx = num_list.length - 1;

    for (int i = 0; i < num_list.length; i++) {
      answer[i] = num_list[idx];
      idx--;
    }

    return answer;
  }

//  List<Integer> list = Arrays.stream(numList).boxed().collect(Collectors.toList());
//  Collections.reverse(list);
//  return list.stream().mapToInt(Integer::intValue).toArray();

}
