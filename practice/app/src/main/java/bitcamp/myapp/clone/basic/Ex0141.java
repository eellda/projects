package bitcamp.myapp.clone.basic;

public class Ex0141 {

  public static void main(String[] args) {
    My obj = new My("iu", 25);
    My obj2 = new My("iu", 25);

    System.out.println(obj == obj2);
    System.out.println(obj.equals(obj2));

    System.out.println(Integer.toHexString(obj.hashCode()));
    System.out.println(Integer.toHexString(obj2.hashCode()));

    System.out.println(obj);
    System.out.println(obj2);
  }


  static class My {
    String name;
    int age;

    public My(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public int hashCode() {
      String str = String.format("%s, %d", this.name, this.age);
      return str.hashCode();
    }
  }
}
