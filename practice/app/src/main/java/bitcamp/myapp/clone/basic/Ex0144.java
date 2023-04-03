package bitcamp.myapp.clone.basic;

public class Ex0144 {

  public static void main(String[] args) {
    Score s = new Score("iu", 100, 100, 100);
    Score s2 = new Score("iu", 100, 100, 100);

    System.out.println(s == s2);

    System.out.println(s.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s);
    System.out.println(s2);
  }

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    public Score(String name, int kor, int eng, int math) {
      this.name = name;
      this.kor = kor;
      this.eng = eng;
      this.math = math;
      this.sum = kor + eng + math;
      this.aver = this.sum / 3f;
    }

    @Override
    public int hashCode() {
      return 1000;
    }
  }

}
