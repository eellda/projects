package bitcamp.myapp.clone.oop;

public class Ex0111 {
  public static void main(String[] args) {
    String name;
    int kor;
    int eng;
    int math;

    name = "IU";
    kor = 100;
    eng = 90;
    math = 85;

    printScore(name, kor, eng, math);

    name = "IU2";
    kor = 10;
    eng = 20;
    math = 55;

    printScore(name, kor, eng, math);

    name = "IU3";
    kor = 100;
    eng = 90;
    math = 85;

    printScore(name, kor, eng, math);
  }

  static void printScore(String name, int kor, int eng, int math) {
    int sum = kor + eng + math;
    float aver = (float) sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", name, kor, eng, math, sum, aver);
  }
}
