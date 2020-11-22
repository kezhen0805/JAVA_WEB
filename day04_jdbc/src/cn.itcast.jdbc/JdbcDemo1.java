package cn.itcast.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

//https://github.com/kezhen0805/JAVA_WEB.git
public class JdbcDemo1 {
    public static void main(String[] args) throws Exception {
        //1.导入驱动jar包
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db3","root","root");
        String sql = "update emp set salary = 500 where id = 1001 ";
//        Statement stmt = conn.CteateStatement();
        Statement stmt = conn.createStatement();
        int count = stmt.executeUpdate(sql);
        System.out.println(count);
        System.out.println("admin");
        System.out.println("admin");

        stmt.close();
        conn.close();


    }
}
