package bitcamp.myapp.clone.basic;

public class Ex0145 {

  public static void main(String[] args) {
    Score s = new Score("Iu", 100, 100, 100);
    Score s2 = new Score("Iu", 100, 100, 100);
    Score s3 = new Score("Iu", 100, 100, 90);
    Score s4 = new Score("Iu", 90, 100, 100);

    System.out.println(s == s2);
    System.out.println(s == s3);
    System.out.println(s == s4);
    System.out.println(s2 == s3);
    System.out.println(s2 == s4);
    System.out.println(s3 == s4);

    System.out.println(s.hashCode());
    System.out.println(s2.hashCode());
    System.out.println(s3.hashCode());
    System.out.println(s4.hashCode());
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
      String value = String.format("%s,%d,%d,%d,%d,%.1f", 
          this.name, this.kor, this.eng, this.math,
          this.sum, this.aver);

      return value.hashCode();
    }
  }
}
