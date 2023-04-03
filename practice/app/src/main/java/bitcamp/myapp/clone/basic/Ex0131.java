package bitcamp.myapp.clone.basic;

import java.util.Objects;

public class Ex0131 {

  public static void main(String[] args) {
    My obj1 = new My();
    obj1.name = "홍길동";
    obj1.age = 20;
    obj1.tel = "1111-1111";
    obj1.email = "hong@test.com";
    obj1.gender = 1;
    obj1.working = false;

    My obj2 = new My();
    obj2.name = "홍길동";
    obj2.age = 20;
    obj2.tel = "1111-1111";
    obj2.email = "hong@test.com";
    obj2.gender = 1;
    obj2.working = false;

    System.out.println(obj1 == obj2);
    System.out.println(obj1.equals(obj2));
  }

  static class My {
    String name;
    int age;
    String tel;
    String email;
    int gender;
    boolean working;

    @Override
    public boolean equals(Object obj) {
      if (this == obj) return true;
      if (obj == null) return false;
      if (getClass() != obj.getClass()) return false;
      My other = (My) obj;
      return age == other.age && Objects.equals(email, other.email) && gender == other.gender
          && Objects.equals(name, other.name) && Objects.equals(tel, other.tel)
          && working == other.working;
    }
  }
}

