package bitcamp.myapp.dao;

import java.sql.Date;

import bitcamp.myapp.vo.Student;

public class StudentDao extends ObjectDao {
	int lastNo;

	@Override
	public void insert(Object object) {
		Student t = (Student) object;
		t.setNo(++lastNo);
		t.setCreatedDate(new Date(System.currentTimeMillis()).toString());
		super.insert(object);
	}

	public String getLevelText(int level) {
		switch (level) {
		case 0: return "비전공자";
		case 1: return "준전공자";
		default: return "전공자";
		}
	}

	public Student findByNo(int no) {
		Student s = new Student();
		s.setNo(no);
		return (Student) this.get(this.indexOf(s));
	}

	@Override
	public int indexOf(Object obj) {
		for (int i = 0; i < this.size(); i++) {
			if (((Student)get(i)).getNo() == ((Student)obj).getNo()) {
				return i;
			}
		}
		return -1;
	}
}
