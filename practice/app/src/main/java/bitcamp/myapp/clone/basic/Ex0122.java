package bitcamp.myapp.clone.basic;

public class Ex0122 extends Object {

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
      this.aver = sum / 3;
    }
  }

  public static void main(String[] args) {
    Score s1 = new Score("IU", 90, 80, 85);

    String str = s1.toString();
    System.out.println(str);
  }
}
