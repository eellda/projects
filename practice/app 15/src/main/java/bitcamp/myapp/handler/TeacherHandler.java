package bitcamp.myapp.handler;

import java.sql.Date;

import bitcamp.myapp.dao.TeacherDao;
import bitcamp.myapp.util.Prompt;
import bitcamp.myapp.vo.Teacher;

public class TeacherHandler {
	private TeacherDao teacherDao = new TeacherDao();
	private String title;

	public TeacherHandler (String title) {
		this.title = title;
	}

	private void inputTeacher() {
		Teacher t = new Teacher();
		t.setNo(Prompt.inputInt("번호? "));
		t.setName(Prompt.inputString("이름? "));
		t.setTel(Prompt.inputString("전화? "));
		t.setEmail(Prompt.inputString("이메일? "));
		t.setDegree(Prompt.inputInt("1. 고졸\n2. 전문학사\n3. 학사\n4. 석사\n5. 박사\n0. 기타\n학위? "));
		t.setSchool(Prompt.inputString("school? "));
		t.setMajor(Prompt.inputString("Major? "));
		t.setWage(Prompt.inputInt("강의료? "));
		t.setCreatedDate(new Date(System.currentTimeMillis()).toString());
		teacherDao.insert(t);
	}

	private void printTeachers() {
		System.out.println("번호\t이름\t전화\t학위\t전공\t시강료");
		Object[] Teachers = this.teacherDao.findAll();

		for (Object obj : Teachers) {
			Teacher t = (Teacher) obj;
			System.out.printf("%d\t%s\t%s\t%s\t%s\t%d\n",
					t.getNo(), 
					t.getName(),
					t.getSchool(),
					t.getTel(), 
					getDegreeText(t.getDegree()),
					t.getWage());
		}
	}

	private void printTeacher() {
		int TeacherNo = Prompt.inputInt("찾을선생? ");
		Teacher t = this.teacherDao.findByNo(TeacherNo);

		if (t == null) {
			System.out.println("해당 번호의 회원이 없습니다.");
			return;
		}

		System.out.printf("    name: %s\n", t.getName());
		System.out.printf("       tel: %s\n", t.getTel());
		System.out.printf("   email: %s\n", t.getEmail());
		System.out.printf("  degree: %s\n", getDegreeText(t.getDegree()));
		System.out.printf("  school: %s\n", t.getSchool());
		System.out.printf("  Major: %s\n", t.getMajor());
		System.out.printf("    wage: %s\n", t.getWage());
		System.out.printf("  등록일: %s\n", t.getCreatedDate());
	}

	private String getDegreeText(int degree) {
		switch (degree) {
		case 1: return "고졸";
		case 2: return "전문학사";
		case 3: return "학사";
		case 4: return "석사";
		case 5: return "박사";
		default: return "기타";
		}
	}

	private void modifyTeacher() {
		int TeacherNo = Prompt.inputInt("회원번호? ");
		Teacher old = this.teacherDao.findByNo(TeacherNo);

		if (old == null) {
			System.out.println("해당 번호의 회원이 없습니다.");
			return;
		}

		Teacher t = new Teacher();
		t.setNo(old.getNo());
		t.setCreatedDate(old.getCreatedDate());
		t.setName(Prompt.inputString(String.format("이름(%s)? ", old.getName())));
		t.setTel(Prompt.inputString(String.format("전화(%s)? ", old.getTel())));
		t.setEmail(Prompt.inputString(String.format("email(%s)? ", old.getEmail())));
		t.setDegree(Prompt.inputInt(String.format(
				"1. 고졸\n2. 전문학사\n3. 학사\n4. 석사\n5. 박사\n0. 기타\n학위(%s)? ", 
				old.getDegree())));
		t.setSchool(Prompt.inputString(String.format("school(%s)? ", old.getSchool())));
		t.setMajor(Prompt.inputString(String.format("major(%s)? ",old.getMajor())));
		t.setWage(Prompt.inputInt(String.format("wage(%s)? ", old.getWage())));

		String str = Prompt.inputString("정말 변경하시겠습니까?(y/N) ");
		if (str.equalsIgnoreCase("Y")) {
			this.teacherDao.update(t);
			System.out.println("변경했습니다.");
		} else {
			System.out.println("변경 취소했습니다.");
		}
	}

	private void deleteTeacher() {
		int TeacherNo = Prompt.inputInt("회원번호? ");
		Teacher t = this.teacherDao.findByNo(TeacherNo);

		if (t == null) {
			System.out.println("해당 번호의 회원이 없습니다.");
			return;
		}

		String str = Prompt.inputString("정말 삭제하시겠습니까?(y/N) ");
		if (!str.equalsIgnoreCase("Y")) {
			System.out.println("삭제 취소했습니다.");
			return;
		}
		this.teacherDao.delete(t);
		System.out.println("삭제했습니다.");

	}

	private void searchTeacher() {
		String name = Prompt.inputString("이름? ");
		Object[] Teachers = this.teacherDao.findAll();
		System.out.println("번호\t이름\t전화\t학위\t전공\t시강료");

		for (Object obj : Teachers) {
			Teacher t = (Teacher) obj;
			if (t.getName().equalsIgnoreCase(name)) {
				System.out.printf("%d\t%s\t%s\t%s\t%s\t%s\n",
						t.getNo(), 
						t.getName(),
						t.getTel(), 
						getDegreeText(t.getDegree()),
						t.getWage());
			}
		}
	}

	public void service() {
		while (true) {
			System.out.printf("[%s]\n", this.title);
			System.out.println("1. 등록");
			System.out.println("2. 목록");
			System.out.println("3. 조회");
			System.out.println("4. 변경");
			System.out.println("5. 삭제");
			System.out.println("6. 검색");
			System.out.println("0. 이전");
			int menuNo = Prompt.inputInt(String.format("%s> ", this.title));

			switch (menuNo) {
			case 0: return;
			case 1: inputTeacher(); break;
			case 2: printTeachers(); break;
			case 3: printTeacher(); break;
			case 4: modifyTeacher(); break;
			case 5: deleteTeacher(); break;
			case 6: searchTeacher(); break;
			default:
				System.out.println("잘못된 메뉴 번호 입니다.");
			}
		}
	}
}
