package bitcamp.myapp.clone.basic;

public class Ex0132 {

  static class Member {
    String name;
    int age;

    Member(String name, int age) {
      this.name = name;
      this.age = age;
    }
  }

  public static void main(String[] args) {
    Member m = new Member("Iu", 25);
    Member m2 = new Member("Iu", 25);    

    System.out.println(m == m2);
    System.out.println("<----------->");

    String s = new String("hello");
    String s2 = new String("hello");
    System.out.println(s == s2);
    System.out.println(s.equals(s2));
  }
}
