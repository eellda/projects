package bitcamp.myapp.clone.oop;

public class Ex0120 {

  public static void main(String[] args) {
    class Score {
      String name;
      int kor;
      int eng;
      int math;
      int sum;
      float aver;
    }

    Score s = new Score();

    s.name = "IU";
    s.kor = 90;
    s.eng = 85;
    s.math = 90;
    s.sum = s.kor + s.eng + s.math;
    s.aver = (float) s.sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);

  }

}
