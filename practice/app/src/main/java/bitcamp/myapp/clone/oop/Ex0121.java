package bitcamp.myapp.clone.oop;

public class Ex0121 {

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  static void printScore(Score s) {
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  public static void main(String[] args) {
    Score s = new Score();

    s.name = "IU";
    s.kor = 90;
    s.eng = 85;
    s.math = 90;
    printScore(s);
    s.name = "IU2";
    s.kor = 90;
    s.eng = 85;
    s.math = 90;
    printScore(s);
    s.name = "IU3";
    s.kor = 90;
    s.eng = 85;
    s.math = 90;
    printScore(s);
  }

}
