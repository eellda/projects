package bitcamp.myapp.clone.basic;

import java.util.Objects;

public class Ex0133 {

  public static void main(String[] args) {
    Member  m = new Member("iu", 25);
    Member  m2 = new Member("iu", 25);
    Member  m3 = new Member("iu", 25);

    System.out.println(m == m2);
    System.out.println(m == m3);
    System.out.println(m2 == m3);

    System.out.println(m.equals(m2));
    System.out.println(m.equals(m3));
    System.out.println(m2.equals(m3));
  }

  static class Member {
    String name;
    int age;

    public Member(String name, int age) {
      this.name = name;
      this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;
      if (obj == null)
        return false;
      if (getClass() != obj.getClass())
        return false;
      Member other = (Member) obj;
      return age == other.age && Objects.equals(name, other.name);
    }
  }

}
