package bitcamp.myapp.clone.basic;

public class Ex0120 {
  static class My {}

  public static void main(String[] args) {
    My obj = new My();

    System.out.println(obj.toString());
    System.out.println(obj);

    My obj2 = new My();
    My obj3 = new My();

    System.out.println(obj2 == obj3);
    System.out.println(obj2.toString());
    System.out.println(obj3.toString());
  }
}
