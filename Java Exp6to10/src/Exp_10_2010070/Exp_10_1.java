package Exp_10_2010070;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class E1 extends JFrame {

    JLabel j1,j2;
    JTextField usr;
    JPasswordField pwd;
    JButton lgn,cancel;
    JCheckBox h1;
    Connection con=null;
    public E1() throws SQLException {
        con=(Connection) Db.dbconnect();
        setLocation(380,120);
        setResizable(false);
        setLayout(null);
        setSize(800,600);
        getContentPane().setBackground(Color.cyan);

        j1 = new JLabel("User Name:");
        j1.setBounds(300,200,100,40);
        add(j1);

        j2 = new JLabel("Password :");
        j2.setBounds(300,300,100,40);
        add(j2);

        usr = new JTextField();
        usr.setBounds(400,200,120,40);
        add(usr);

        pwd = new JPasswordField();
        pwd.setBounds(400,300,120,40);
        add(pwd);



        h1 = new JCheckBox();
        h1.setBounds(595, 300, 20, 40);
        add(h1);

        lgn = new JButton("Login");
        lgn.setBounds(300,400,100,40);
        add(lgn);

        cancel = new JButton("Cancel");
        cancel.setBounds(420,400,100,40);
        add(cancel);

            lgn.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                    if(h1.isSelected())
                    {
                        try {
                            String user = usr.getText();
                            String passwd = String.valueOf(pwd.getPassword());
                            PreparedStatement pst = (PreparedStatement) con.prepareStatement("SELECT * FROM employee WHERE usrname=?and password=?");
                            pst.setString(1, user);
                            pst.setString(2, passwd);
                            ResultSet r = (ResultSet) pst.executeQuery();
                            if (r.next()) {
                                JOptionPane.showMessageDialog(null, "Login Successfull");
                                usr.setText("");
                                pwd.setText("");
                            } else {
                                JOptionPane.showMessageDialog(null, "Invalid Credentials");
                            }

                        } catch (Exception e1) {
                            System.out.println(e1);
                        }
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"Select checkbox");
                    }
                }
            });
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class Login {
    public static void main(String[] args) throws SQLException {

        E1 e10 = new E1();
    }

}
