package headFirst.exam.practice122;

public class XCopy {
	private int orig = 42;

	public int getOrig() {
		return orig;
	}

	public void setOrig(int orig) {
		this.orig = orig;
	}

	public static void main(String[] args) {
		XCopy x = new XCopy();
		int y = x.go(x.getOrig());

		System.out.println(x.getOrig() + " " + y);
	}

	int go (int arg) {
		return arg = arg * 2;
	}
}
