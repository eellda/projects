package bitcamp.myapp;

import bitcamp.myapp.vo.Board;

public class BoardDao {

  private final int SIZE = 100;
  private int count;
  private Board[] boards = new Board[SIZE];

  public void insert(Board board) {
    this.boards[count++] = board;
  }

  public void update(Board board) {
    this.boards[this.indexOf(board)] = board;
  }

  public void delete(Board board) {
    for (int i = this.indexOf(board) + 1; i < this.count; i++) {
      this.boards[i - 1] = this.boards[i];
    }
    this.boards[--this.count] = null;
  }

  public Board[] findAll() {
    Board[] arr = new Board[this.count];

    for (int i = 0; i < count; i++) {
      arr[i] = this.boards[i];
    }
    return arr;
  }

  public Board findByNo(int no) {
    for (int i = 0; i < count; i++) {
      if (boards[i].getNo() == no) {
        return boards[i];
      }
    }
    return null;
  }

  private int indexOf(Board m) {
    for (int i = 0; i < count; i++) {
      if (boards[i].getNo() == m.getNo()) {
        return i;
      }
    }
    return -1;
  }
}
