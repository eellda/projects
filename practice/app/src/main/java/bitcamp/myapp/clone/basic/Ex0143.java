package bitcamp.myapp.clone.basic;

public class Ex0143 {

  public static void main(String[] args) {
    Score s = new Score("IU", 100, 100, 100);
    Score s2 = new Score("IU", 100, 100, 100);

    System.out.println(s == s2);
    System.out.printf("%d, %d\n", s.hashCode(), s2.hashCode());
  }

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
    }
  }
}
