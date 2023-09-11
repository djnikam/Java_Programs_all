package Exp_10_2010070;

import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.*;

public class Db {

    Connection con =null;

    public static Connection dbconnect()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/sonoo","root","Pass@1234");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println(e);
            return null;
        }
    }
}


//b1.addActionListener(new ActionListener() {
//@Override
//public void actionPerformed(ActionEvent e) {
//        try {
//        String usr= user.getText();
//        String pwd=String.valueOf(password.getText());
//        PreparedStatement pst= (PreparedStatement)con.prepareStatement("select * from student_login where stu_username =? and stu_password=?");
//        pst.setString(1,usr);
//        pst.setString(2,pwd);
//        ResultSet r = pst.executeQuery();
//        if(r.next())
//        {
//        stuid = r.getInt("stu_id");
//        roll_no = r.getInt("stu_rollno");
//        name = r.getString("stu_name");
//        JOptionPane.showMessageDialog(null,"Login Successfull ");
//        dispose();
//        student_instruction_page1 i1 = new student_instruction_page1(stuid,roll_no,name);
//        i1.setSize(1000, 600);
//        }
//        else
//        {
//        JOptionPane.showMessageDialog(null,"Invalid Username or Password");
//        }
//        }catch (Exception e1)
//        {
//        e1.printStackTrace();
//        }
//        }
//        });
