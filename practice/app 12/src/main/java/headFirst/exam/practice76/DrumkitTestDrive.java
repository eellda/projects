package headFirst.exam.practice76;

public class DrumkitTestDrive {
	public static void main(String[] args) {
		DrumKit d = new DrumKit();

		if (d.snare == true) {
			d.playSnare();
		}
		d.snare = false;
		d.playTopHat();

	}
}
