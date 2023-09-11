package Exp_10_2010070;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Quiz {
    Connection con =null;
    public Quiz() {

        JFrame frame=new JFrame("quize");
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

        JButton results=new JButton("Clear");
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
                if (b1.isSelected()) {
                    count = count + 1;
                }
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
                    x1.clearSelection();
                    x2.clearSelection();
                    x3.clearSelection();
                }
            });
    }
    public static void main(String[] args)  {
        new Quiz();
    }
}