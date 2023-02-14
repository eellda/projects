package bitcamp.util;

import java.sql.Connection;

public class ConnectionFactory {
  ConnectionPool connectionPool;
  ThreadLocal<Connection> conLocal = new ThreadLocal<>();

  public ConnectionFactory(ConnectionPool connectionPool) {
    this.connectionPool = connectionPool;
  }

  public Connection getConnection() throws Exception {
    Connection con = conLocal.get();

    if (con == null) {
      con = connectionPool.getConnection();
      conLocal.set(con);
    }

    System.out.printf("[%s] Connection 객체 리턴!\n", Thread.currentThread().getName());
    return con;
  }

  public void closeConnectino() {
    Connection con = conLocal.get();

    if (con != null) {
      connectionPool.returnConnection(con);
      System.out.printf("[%s] 커넥셤 객체 반납완료.\n", Thread.currentThread().getName());
    }
  }
}
