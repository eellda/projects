package bitcamp.myapp.dao;

import java.util.Arrays;

import bitcamp.myapp.vo.Student;

public class StudentDao {

	private final int SIZE = 100;
	private int count;
	private Student[] students = new Student[SIZE];

	public void insert(Student student) {
		this.students[count++] = student;
	}

	public void update(Student student) {
		this.students[this.indexOf(student)] = student;
	}

	public void delete(Student Student) {
		for (int i = this.indexOf(Student) + 1; i < this.count; i++) {
			this.students[i - 1] = this.students[i];
		}
		this.students[--this.count] = null;
	}

	public Student[] findAll() {
		return Arrays.copyOf(students, count);
	}

	public String getLevelText(int level) {
		switch (level) {
		case 0: return "비전공자";
		case 1: return "준전공자";
		default: return "전공자";
		}
	}

	public Student findByNo(int no) {
		for (int i = 0; i < count; i++) {
			if (students[i].getNo() == no) {
				return students[i];
			}
		}
		return null;
	}

	public int indexOf(Student m) {
		for (int i = 0; i < count; i++) {
			if (students[i].getNo() == m.getNo()) {
				return i;
			}
		}
		return -1;
	}
}
