package bitcamp.myapp.clone.basic;

public class Ex0134 {

  public static void main(String[] args) {

    String s = new String("hello");
    String s2 = new String("hello");

    System.out.println(s == s2);
    System.out.println(s.equals(s2));

    StringBuffer sb = new StringBuffer("hello");
    StringBuffer sb2 = new StringBuffer("hello");

    System.out.println(sb == sb2);
    System.out.println(sb.equals(sb2));
  }

}
