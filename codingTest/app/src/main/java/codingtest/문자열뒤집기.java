package codingtest;

// 문자열 my_string
// my_string 을 거꾸로 뒤집은 문자열을 return
// 1 <= my_string.length <= 1000



public class 문자열뒤집기 {
  public String solution(String my_string) {

    return new StringBuilder(my_string).reverse().toString();
  }
}
