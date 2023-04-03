package bitcamp.myapp.clone.basic;

import java.util.Objects;

public class Ex0142 {

  public static void main(String[] args) {
    My obj = new My("IU", 25);
    My obj2 = new My("IU", 25);

    System.out.println(obj == obj2); // false
    System.out.println(obj.equals(obj2)); // true

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
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      My other = (My) obj;
      return age == other.age && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
      return Objects.hash(age, name);
    }
  }
}
