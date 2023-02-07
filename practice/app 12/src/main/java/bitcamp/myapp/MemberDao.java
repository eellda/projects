package bitcamp.myapp;

public class MemberDao {

  private final int SIZE = 100;
  private int count;
  private Member[] members = new Member[SIZE];

  void insert(Member member) {
    this.members[count++] = member;
  }

  void update(Member member) {
    this.members[this.indexOf(member)] = member;
  }

  void delete(Member member) {
    for (int i = this.indexOf(member) + 1; i < this.count; i++) {
      this.members[i - 1] = this.members[i];
    }
    this.members[--this.count] = null;
  }

  public Member[] findAll() {
    Member[] arr = new Member[this.count];

    for (int i = 0; i < count; i++) {
      arr[i] = this.members[i];
    }
    return arr;
  }

  public String getLevelText(int level) {
    switch (level) {
      case 0: return "비전공자";
      case 1: return "준전공자";
      default: return "전공자";
    }
  }

  public Member findByNo(int no) {
    for (int i = 0; i < count; i++) {
      if (members[i].getNo() == no) {
        return members[i];
      }
    }
    return null;
  }

  public int indexOf(Member m) {
    for (int i = 0; i < count; i++) {
      if (members[i].getNo() == m.getNo()) {
        return i;
      }
    }
    return -1;
  }
}
