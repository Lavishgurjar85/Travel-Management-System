/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

/**
 *
 * @author lenovo
 */
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class User extends JFrame implements ActionListener{
    JLabel shape,dimension,location,color;
    ButtonGroup g1;
    JRadioButton Square,Rectangle,Circle,Oval;
    JTextField t1,t2,t3,t4,t5,t6;
    JButton start;
    int a,b,c,d;
    String st1,st2;
    User()
    {super("Object mover");
       setBounds(100,100,500,500);
       setVisible(true);
       setLayout(null);
       shape =new JLabel("shape");
       shape.setBounds(10,10 ,60,30);
       add(shape);
       t6=new JTextField();
       t6.setBounds(80,10,40,30);
       add(t6);

       color =new JLabel("color");
       color.setBounds(10,60 ,60,30);
       add(color);
       t1=new JTextField();
       t1.setBounds(80,60,40,30);
       add(t1);
       dimension =new JLabel("DIMENSION");
       dimension.setBounds(10,110 ,80,30);
       add(dimension);
       t2=new JTextField();
       t2.setBounds(120,110,40,30);
       add(t2);
       t3=new JTextField();
       t3.setBounds(170,110,40,30);
       add(t3);
       location =new JLabel("location");
       location.setBounds(10,160 ,60,30);
       add(location);
       t4=new JTextField();
       t4.setBounds(80,160,40,30);
       add(t4);
       t5=new JTextField();
       t5.setBounds(130,160,40,30);
       add(t5);
       start=new JButton("start");
       start.setBounds(10,200,80,30);
       add(start);
       start.addActionListener(this);
       getContentPane().setBackground(Color.WHITE);
               
    }
    
    public void actionPerformed(ActionEvent e) {
     st2  =t6.getText(); 
    a=Integer.parseInt(t2.getText());
    b=Integer.parseInt(t3.getText());
    c=Integer.parseInt(t4.getText());
    d=Integer.parseInt(t5.getText());
    st1=t1.getText();
    new ObjectMover(a,b,c,d,st1,st2).setVisible(true);
    setVisible(false);
            }
    public static void main(String s[])
    {
        new User();
    }
}
