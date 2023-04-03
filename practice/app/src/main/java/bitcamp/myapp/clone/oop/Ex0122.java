package bitcamp.myapp.clone.oop;

public class Ex0122 {

  public static void main(String[] args) {
    Score s1 = createScore("IU", 100, 90, 75);
    printScore(s1);
  }

  static class Score {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;
  }

  static void printScore(Score s) {
    System.out.printf("%s: %d, %d, %d, %d, %.1f\n",
        s.name, s.kor, s.eng, s.math, s.sum, s.aver);
  }

  static Score createScore(String name, int kor, int eng, int math) {
    Score s = new Score();

    s.name = name;
    s.kor = kor;
    s.eng = eng;
    s.math = math;
    s.sum = s.kor + s.eng + s.math;
    s.aver = s.sum / 3;

    return s;
  }

}
