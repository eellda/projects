package bitcamp.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {
  String jdbcUrl;
  String username;
  String password;
  ThreadLocal<Connection> conLocal = new ThreadLocal<>();

  public ConnectionFactory(String jdbcUrl, String username, String password) {
    this.jdbcUrl = jdbcUrl;
    this.username = username;
    this.password = password;
  }

  public Connection getConnection() throws Exception {
    Connection con = conLocal.get();

    if (con == null) {
      con = DriverManager.getConnection(jdbcUrl, username, password);
      conLocal.set(con);
      System.out.printf("[%s] Connection 객체 생성됨!\n", Thread.currentThread().getName());
    }

    System.out.printf("[%s] Connection 객체 리턴!\n", Thread.currentThread().getName());
    return con;
  }

}
