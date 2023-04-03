package bitcamp.myapp.clone.basic;

public class Ex0110 {

  static class My {}

  public static void main(String[] args) {
    Object obj = new My();

    System.out.println(obj instanceof My);
    System.out.println(obj instanceof String);
    System.out.println(obj instanceof Object);

    System.out.println(obj.toString()); // 메서드 이름과 해시코드
    System.out.printf("%08x, %1$d\n", obj.hashCode()); // 인스턴스 식별값
    System.out.println(obj.equals("hello")); // 같은 인스턴스인지
  }
}
