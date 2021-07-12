/*
package com.bosch.sbs.java.exception;

import java.sql.*;

class MysqlCon {

    public static void main(String[] args) {

        try (Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/sonoo", "root", "root")){
            Class.forName("com.mysql.jdbc.Driver");

*/
/*            con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/sonoo", "root", "root");*//*

//here sonoo is database name, root is username and password
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("select * from emp");
            while (rs.next())
                System.out.println(rs.getInt(1) + "  " + rs.getString(2) + "  " + rs.getString(3));
            //con.close();
        }catch (SQLException | ClassNotFoundException sqle){

        }finally {
            try {
                con.close();
            } catch (SQLException throwables) {

            }
        }
    }
}*/
