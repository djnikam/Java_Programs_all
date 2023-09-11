package Quiza;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Quizapp3 {
    Connection con =null;
    public Quizapp3() {

        JFrame frame=new JFrame("quize");
        frame.setSize(500,700);
        final JRadioButton a3,b1,c3;



        JLabel l3= new JLabel("q3).where is tajmahal");
        l3.setBounds(50,300,600,50);
        frame.add(l3);
        JRadioButton c1=new JRadioButton("kerla");
        JRadioButton c2=new JRadioButton("goa");
        c3=new JRadioButton("agra");
        final ButtonGroup x3=new ButtonGroup();
        x3.add(c1);
        x3.add(c2);
        x3.add(c3);
        c1.setBounds(80,340,300,30);
        c2.setBounds(80,360,300,30);
        c3.setBounds(80,380,300,30);
        frame.add(c1);
        frame.add(c2);
        frame.add(c3);

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
                if (c3.isSelected()) {
                    count = count + 1;
                }
                int finalcount = count;
                String str = new String("your score is:" + finalcount);
                //System.out.println("your marks are:"+finalcount);
                JOptionPane.showMessageDialog(null, str);
            }
        });


        results.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                x3.clearSelection();
            }
        });
    }
    public static void main(String[] args)  {
        new Quizapp3();
    }
}