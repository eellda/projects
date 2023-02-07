package bitcamp.myapp.dao;

import java.sql.Date;

import bitcamp.myapp.vo.Teacher;

public class TeacherDao extends ObjectDao {
	int lastNo;

	@Override
	public void insert(Object object) {
		Teacher t = (Teacher) object;
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

	public Teacher findByNo(int no) {
		Teacher t = new Teacher();
		t.setNo(no);
		return (Teacher) this.get(this.indexOf(t));
	}

	@Override
	public int indexOf(Object obj) {
		for (int i = 0; i < this.size(); i++) {
			if (((Teacher)objects[i]).getNo() == ((Teacher)obj).getNo()) {
				return i;
			}
		}
		return -1;
	}
}
