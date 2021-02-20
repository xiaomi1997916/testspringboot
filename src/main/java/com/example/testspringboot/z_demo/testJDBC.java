package com.example.testspringboot.z_demo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class testJDBC {
    public static void main(String[] args) {
        try {
            Class<?> name = Class.forName("oracle.jdbc.driver.OracleDriver");
            //oracle.jdbc.driver.OracleDriver
            System.out.println(name);
            Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@127.0.0.1:1521:orcl","system", "orcl");
            System.out.println(connection);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from student");
            while (resultSet.next()){
                System.out.println("学号:"+resultSet.getString("sid")+" 姓名："+resultSet.getString("sname"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
