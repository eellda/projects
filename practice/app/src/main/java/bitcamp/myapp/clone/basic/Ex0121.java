package bitcamp.myapp.clone.basic;

public class Ex0121 {

  static class My {
    String name;
    int age;

    @Override
    public String toString() {
      return "MY [name=" + name + ", age=" + age + "]";
    }
  }

  public static void main(String[] args) {
    My obj = new My();

    obj.name = "IU";
    obj.age = 25;

    System.out.println(obj.toString());
    System.out.println(obj);
  }

}
