package bitcamp.myapp.dao;

import java.util.Arrays;

import bitcamp.myapp.vo.Teacher;

public class TeacherDao {

	private final int SIZE = 100;
	private int count;
	private Teacher[] teachers = new Teacher[SIZE];

	public void insert(Teacher teacher) {
		this.teachers[count++] = teacher;
	}

	public void update(Teacher teacher) {
		this.teachers[this.indexOf(teacher)] = teacher;
	}

	public void delete(Teacher teacher) {
		for (int i = this.indexOf(teacher) + 1; i < this.count; i++) {
			this.teachers[i - 1] = this.teachers[i];
		}
		this.teachers[--this.count] = null;
	}

	public Teacher[] findAll() {
		return Arrays.copyOf(teachers, count);
	}

	public String getLevelText(int level) {
		switch (level) {
		case 0: return "비전공자";
		case 1: return "준전공자";
		default: return "전공자";
		}
	}

	public Teacher findByNo(int no) {
		for (int i = 0; i < count; i++) {
			if (teachers[i].getNo() == no) {
				return teachers[i];
			}
		}
		return null;
	}

	public int indexOf(Teacher m) {
		for (int i = 0; i < count; i++) {
			if (teachers[i].getNo() == m.getNo()) {
				return i;
			}
		}
		return -1;
	}
}
