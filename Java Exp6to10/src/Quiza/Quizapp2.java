package Quiza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Quizapp2{
    Connection con =null;
    int cta;
    public Quizapp2(final int ct) {
        cta=ct;

        JFrame frame=new JFrame("quize");
        frame.setSize(500,700);
        final JRadioButton a3,b1,c3;




        JLabel l2= new JLabel("q2).where is pune?");
        l2.setBounds(50,180,600,50);
        frame.add(l2);
        b1=new JRadioButton("maharashtra");
        final JRadioButton b2=new JRadioButton("Goa");
        JRadioButton b3=new JRadioButton("bihar");
        final ButtonGroup x2=new ButtonGroup();
        x2.add(b1);
        x2.add(b2);
        x2.add(b3);
        b1.setBounds(80,240,300,30);
        b2.setBounds(80,260,300,30);
        b3.setBounds(80,280,300,30);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);



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

                int count = cta;

                if (b1.isSelected()) {
                    count = count + 1;
                }
                int finalcount = count;
                cta =count;
                String str = new String("your score is:" + finalcount);
                //System.out.println("your marks are:"+finalcount);
                JOptionPane.showMessageDialog(null, str);
            }
        });


        results.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Quizapp3 q3=new Quizapp3();
            }
        });
    }

}