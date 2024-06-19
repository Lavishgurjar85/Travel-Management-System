/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

/**
 *
 * @author lenovo
 */
import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
class Program1 extends JFrame implements ActionListener
{
 JTextField t1,t2,t3,t4,t5;
 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9; 
 JButton b1,b2;
 JTextArea a;
 JRadioButton c1,c2;
 JCheckBox k1,k2,k3,k4,k5;
 JPanel contentPane;
 ButtonGroup gender;
 Program1()
{
    contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
 setBounds(100,100,800,700);
 setVisible(true);
 l1=new JLabel("Name");
 l1.setBounds(10,10,50,60);
 contentPane.add(l1);
 
 t1=new JTextField();
  t1.setBounds(120,10,200,40);
 contentPane.add(t1);
 
l2=new JLabel("Reg. no");
l2.setBounds(10,70,50,60);
add(l2);

t2=new JTextField();
  t2.setBounds(120,70,200,40);
 contentPane.add(t2);

l3=new JLabel("Date of Birth");
l3.setBounds(10,130,100,60);
add(l3);

t3=new JTextField();
  t3.setBounds(120,130,200,40);
 contentPane.add(t3);

l4=new JLabel("Address");
l4.setBounds(10,190,50,60);
add(l4);
a=new JTextArea();
a.setBounds(120,190,200,40);
contentPane.add(a);
 Border border = BorderFactory.createLineBorder(Color.BLUE, 5);   
 a.setBorder(border);

l6=new JLabel("Email id");
l6.setBounds(10,250,50,60);
contentPane.add(l6);
t4=new JTextField();
  t4.setBounds(120,250,200,40);
 contentPane.add(t4);

l7=new JLabel("phone number");
l7.setBounds(10,310,90,60);
add(l7);
t5=new JTextField();
  t5.setBounds(120,310,200,40);
 contentPane.add(t5);
l8=new JLabel("Gender");
l8.setBounds(10,370,50,60);
add(l8);
gender=new ButtonGroup();

c1=new JRadioButton("Male");
c1.setBounds(120,370,80,40);
add(c1);
c2=new JRadioButton("Female");
c2.setBounds(210,370,80,40);
add(c2);
gender.add(c2);
gender.add(c1);

l9=new JLabel("Qualification");
l9.setBounds(10,430,90,40);
add(l9);
k1=new JCheckBox("10th");
k1.setBounds(120,430,50,40);
add(k1);
k2=new JCheckBox("12th");
k2.setBounds(180,430,50,40);
add(k2);
k3=new JCheckBox("M.TECH");
k3.setBounds(240,430,80,40);
add(k3);
k4=new JCheckBox("B.TECH");
k4.setBounds(330,430,80,40);
add(k4);
k5=new JCheckBox("Phd");
k5.setBounds(410,430,50,40);
add(k5);


b1=new JButton("Submit");
b1.setBounds(10,600,100,40);
add(b1);
b1.addActionListener(this);

b2=new JButton("Clear");
b2.setBounds(200,600,100,40);
add(b2);
b2.addActionListener(this);


                getContentPane().setBackground(Color.WHITE);
}
 public void actionPerformed(ActionEvent e)
 {
  if(e.getSource()==b1)
  {
      JOptionPane.showMessageDialog(null, "Submitted Successfully");
  }
  if(e.getSource()==b2)
  {
      t1.setText("");
      t2.setText("");
      t3.setText("");
      t4.setText("");
      t5.setText("");
      a.setText("");
      gender.clearSelection();
      k1.setSelected(false);
      k2.setSelected(false);
      k3.setSelected(false);
      k4.setSelected(false);
      k5.setSelected(false);
      JOptionPane.showMessageDialog(null, "Cleared ");
  }
 }
 public static void main(String s[])
 {
     new Program1();
 }
}