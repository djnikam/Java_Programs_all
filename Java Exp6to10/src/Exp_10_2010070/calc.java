package Exp_10_2010070;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

class E extends JFrame {

    JLabel j1,j2;
    JTextField n1,n2;
    int num1,num2;
    JButton add,cancel;
    Connection con=null;

    public E() throws SQLException {

        setLocation(380,120);
        setResizable(false);
        setLayout(null);
        setSize(800,600);
        getContentPane().setBackground(Color.cyan);

        j1 = new JLabel("num1 :");
        j1.setBounds(300,200,100,40);
        add(j1);

        j2 = new JLabel("num2 :");
        j2.setBounds(300,300,100,40);
        add(j2);

        n1 = new JTextField();
        n1.setBounds(400,200,120,40);
        add(n1);

        n2 = new JTextField();
        n2.setBounds(400,300,120,40);
        add(n2);


        add = new JButton("Add");
        add.setBounds(300,400,100,40);
        add(add);

        add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                num1 =Integer.parseInt(n1.getText());
                num2 =Integer.parseInt(n2.getText());
                JOptionPane.showMessageDialog(null,"Addition of "+num1+" + "+num2+" is :"+(num1+num2));
            }
        });


        cancel = new JButton("Cancel");
        cancel.setBounds(420,400,100,40);
        add(cancel);




        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}

class calc {
    public static void main(String[] args) throws SQLException {

        E e11 = new E();
    }

}
