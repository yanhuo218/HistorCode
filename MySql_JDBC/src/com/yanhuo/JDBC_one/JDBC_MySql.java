package com.yanhuo.JDBC_one;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;
import static java.lang.System.*;

/**
 * @author 付秋垚
 */
public class JDBC_MySql {
    static Scanner sc = new Scanner(in);
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://127.0.0.1:3306/yanhuo_1.0.0?useUnicode=true&characterEncoding=utf-8&useSSL=false&use";
        String name = "root";
        String password = "1234";
        Connection conn = DriverManager.getConnection(url,name,password);
        Statement stat = conn.createStatement();
        //获取当前有多少用户
        String sql2 = "SELECT COUNT(id) FROM td_user";
        ResultSet x = stat.executeQuery(sql2);
        int users = 0;
        if (x.next()){
            users = x.getInt(1);
        }
        String newAccount;
        String accountPass;
        out.println("请输入新账号:");
        newAccount = sc.next();
        out.println("请输入新密码:");
        accountPass = sc.next();

        String sql = "INSERT INTO td_user(account,password,detailed_information) values('"+ newAccount +"',"+ accountPass +","+ ++users +")";
        int count = stat.executeUpdate(sql);
        out.printf(String.valueOf(count));
        stat.close();
        conn.close();
    }
}
