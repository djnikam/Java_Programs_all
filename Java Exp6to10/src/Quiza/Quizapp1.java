package Quiza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Quizapp1 {
    Connection con =null;
    int ct=0;
    JFrame frame;
    public Quizapp1() {

        frame=new JFrame("quize");
        frame.setSize(500,700);
        final JRadioButton a3,b1,c3;

        //frame .setLayout(null);
        //frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JLabel name=new JLabel("enter your name:");
        name.setBounds(50,25,600,50);
        frame.add(name);

        final JTextField tf=new JTextField();
        tf.setBounds(170,35,150,27);
        frame.add(tf);

        JLabel l1=new JLabel("q1) what is capital of india?");
        l1.setBounds(50,50,600,50);
        frame.add(l1);
        JRadioButton a1=new JRadioButton("bombay");
        JRadioButton a2 =new JRadioButton("pune");
        a3 =new JRadioButton("delhi");
        final ButtonGroup x1=new ButtonGroup();
        x1.add(a1);
        x1.add(a2);
        x1.add(a3);
        a1.setBounds(80,100,300,30);
        a2.setBounds(80,130,300,30);
        a3.setBounds(80,160,300,30);
        frame.add(a1);
        frame.add(a2);
        frame.add(a3);

        JButton submit=new JButton("submit");
        submit.setBounds(80,420,100,30);
        frame.add(submit);

        JButton results=new JButton("Next");
        results.setBounds(180,420,100,30);
        frame.add(results);


        frame .setLayout(null);
        frame.setDefaultCloseOperation(frame.EXIT_ON_CLOSE);
        frame.setVisible(true);

        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int count = 0;
                if (a3.isSelected()) {
                    count = count + 1;
                }
                int finalcount = count;
                ct = count;
                String str = new String("your score is:" + finalcount);
                //System.out.println("your marks are:"+finalcount);
                JOptionPane.showMessageDialog(null, str);
                Quizapp2 q1 = new Quizapp2(ct);
                frame.dispose();
            }
        });


        results.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               Quizapp2 q1 = new Quizapp2(ct);
            }
        });
    }
    public static void main(String[] args)  {
        new Quizapp1();
    }
}