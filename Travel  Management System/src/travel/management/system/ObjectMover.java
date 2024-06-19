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

public class ObjectMover extends JFrame implements KeyListener, ActionListener {

    private JPanel canvas;
    private JButton upButton, downButton, leftButton, rightButton;
    private int x, y, width, height;
    Color color;
    String m;
    
    public ObjectMover(int a,int b,int c,int d,String s1,String s2) {
        super("Object Mover");
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setLayout(null);
        canvas = new JPanel();
        canvas.setBackground(Color.WHITE);
        canvas.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        add(canvas);
        this.m=s2;
        upButton = new JButton("Up");
        downButton = new JButton("Down");
        leftButton = new JButton("Left");
        rightButton = new JButton("Right");
        upButton.addActionListener(this);
        downButton.addActionListener(this);
        leftButton.addActionListener(this);
        rightButton.addActionListener(this);
        add(upButton);
        add(downButton);
        add(leftButton);
        add(rightButton);
        upButton.setBounds(0,0,60,20);
        downButton.setBounds(70,0,60,20);
        leftButton.setBounds(0,70,60,20);
        rightButton.setBounds(70,70,60,20);
        upButton.addKeyListener(this);
        downButton.addKeyListener(this);
        leftButton.addKeyListener(this);
        rightButton.addKeyListener(this);
        
        x = c;
        y = d;
        width = a;
        height = b;
        
    if (s1.equalsIgnoreCase("red")) {
            color = Color.RED;
        } else if (s1.equalsIgnoreCase("green")) {
            color = Color.GREEN;
        } else if (s1.equalsIgnoreCase("blue")) {
            color = Color.BLUE;
        }else if (s1.equalsIgnoreCase("pink")) {
            color = Color.PINK;
        } else if (s1.equalsIgnoreCase("black")) {
            color = Color.BLACK;
        }                
        getContentPane().setBackground(Color.WHITE);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(color);
      if(m.equalsIgnoreCase("oval"))
          g.fillOval(x, y, width, height);
    else if(m.equalsIgnoreCase("square"))
        g.fillRect(x, y, width, height);
           else if(m.equalsIgnoreCase("circle"))
        g.fillOval(x, y, width, height);
      else if(m.equalsIgnoreCase("rectangle"))
        g.fillRect(x, y, width, height);
      else if(m.equalsIgnoreCase("line")){
          width=x+width;
          height=y+height;
        g.drawLine(x, y, width, height);
      }}
    
    public void moveObject(int dx, int dy) {
        x += dx;
        y += dy;
        repaint();
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == upButton) {
            moveObject(0, -10);
        } else if (e.getSource() == downButton) {
            moveObject(0, 10);
        } else if (e.getSource() == leftButton) {
            moveObject(-10, 0);
        } else if (e.getSource() == rightButton) {
            moveObject(10, 0);
        }
    }
    
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_UP) {
            moveObject(0, -10);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            moveObject(0, 10);
        } else if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            moveObject(-10, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            moveObject(10, 0);
        }
    }
    
    public void keyReleased(KeyEvent e) {}
    
    public void keyTyped(KeyEvent e) {}
    
    public static void main(String[] args) {
        ObjectMover om = new ObjectMover(1,2,3,4,"","");
        om.setVisible(true);
    }
}

 class User extends JFrame implements ActionListener{
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
