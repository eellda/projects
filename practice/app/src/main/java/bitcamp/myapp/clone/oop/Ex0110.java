package bitcamp.myapp.clone.oop;

public class Ex0110 {
  public static void main(String[] args) {
    String name;
    int kor;
    int eng;
    int math;
    int sum;
    float aver;

    name = "아이유";
    kor = 90;
    eng = 90;
    math = 85;
    sum = kor + eng + math;
    aver = (float) sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", name, kor, eng, math, sum, aver);

    name = "아이유2";
    kor = 100;
    eng = 70;
    math = 65;
    sum = kor + eng + math;
    aver = (float) sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", name, kor, eng, math, sum, aver);

    name = "아이유3";
    kor = 85;
    eng = 100;
    math = 95;
    sum = kor + eng + math;
    aver = (float) sum / 3;

    System.out.printf("%s: %d, %d, %d, %d, %.1f\n", name, kor, eng, math, sum, aver);
  }
}
