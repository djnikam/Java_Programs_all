package Exp_10_2010070;

import java.sql.*;

public class Select {


    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","Pass@1234");

//        Statement stmt = con.createStatement();
//        String s="create table academic_info (roll int, stu_name varchar(20),marks int)";
//        stmt.executeUpdate(s);

        Statement stmt1 = con.createStatement();
//        stmt1.executeUpdate("insert into academic_info values(2,'Dhanraj',100)");
//        stmt1.executeUpdate("insert into academic_info values(1,'Dhanraj',100)");

        Statement stmt2 = con.createStatement();
//        stmt2.executeUpdate("delete from academic_info where roll=2");

//        Update Query
//        stmt2.executeUpdate("update academic_info set stu_name='Shubham' where roll=2");

        ResultSet rs = stmt2.executeQuery("select * from academic_info ");
        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
        }

    }
}
