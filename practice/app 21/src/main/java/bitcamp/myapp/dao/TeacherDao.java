package bitcamp.myapp.dao;

import java.sql.Date;

import bitcamp.myapp.util.ArrayList;
import bitcamp.myapp.vo.Teacher;

public class TeacherDao {
	ArrayList list = new ArrayList();
	int lastNo;

	public void insert(Teacher t) {
		t.setNo(++lastNo);
		t.setCreatedDate(new Date(System.currentTimeMillis()).toString());
		list.add(t);
	}

	public String getLevelText(int level) {
		switch (level) {
		case 0: return "비전공자";
		case 1: return "준전공자";
		default: return "전공자";
		}
	}

	public Teacher findByNo(int no) {
		Teacher t = new Teacher();
		t.setNo(no);
		int index = list.indexOf(t);

		if (index == -1) {
			return null;
		}
		return (Teacher) list.get(index);
	}

	public Teacher[] findAll() {
		Teacher[] teachers = new Teacher[list.size()];
		Object[] arr = list.toArray();

		for (int i = 0; i < teachers.length; i++) {
			teachers[i] = (Teacher) arr[i];
		}
		return teachers;
	}

	public void update(Teacher t) {
		int index = list.indexOf(t);
		list.set(index, t);
	}

	public boolean delete(Teacher t) {
		return list.remove(t);
	}
}
