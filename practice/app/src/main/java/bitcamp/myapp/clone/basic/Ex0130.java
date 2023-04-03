package bitcamp.myapp.clone.basic;

public class Ex0130 {

  static class My {
    String name;
    int age;
  }

  public static void main(String[] args) {
    My obj = new My();
    obj.name = "IU";
    obj.age = 25;

    My obj2 = new My();
    obj2.name = "IU2";
    obj2.age = 225;

    System.out.println(obj == obj2);
    System.out.println(obj.equals(obj2));
  }
}
