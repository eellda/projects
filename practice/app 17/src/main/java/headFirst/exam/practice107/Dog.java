package headFirst.exam.practice107;

public class Dog {
	int size;
	String name;

	void vark() {
		if (size > 60) {
			System.out.println("Wooof! Wooof!");
		} else if (size > 14) {
			System.out.println("Ruff! Ruff!");
		} else {
			System.out.println("Yip! Yip!");
		}
	}
}
