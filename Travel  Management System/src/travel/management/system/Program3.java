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
import java.awt.*;
public class Program3 extends Frame implements ActionListener{
    MenuItem Open,Save,Print,New,Cut,Copy,Paste;
    Menu m1,m2;
    Button Close;
    Program3(){
        Frame f=new Frame();
        setBounds(100,100,400,500);
        MenuBar mb=new MenuBar();
        Open=new MenuItem("Open");
        Save=new MenuItem("Save");
        Print=new MenuItem("Print");
        New=new MenuItem("New");
        Cut=new MenuItem("Cut"); 
        Copy=new MenuItem("Copy");
        Paste=new MenuItem("Paste");
        setLayout(null);
         New.addActionListener(this);
        Open.addActionListener(this);
        Save.addActionListener(this);
        Print.addActionListener(this);
        Close=new Button("Close");
        Close.setBounds(20,70,50,20);
        add(Close);
        Close.addActionListener(new ActionListener()
        {
            public void actionPerformed(ActionEvent e){
                dispose();
            }
        });
        Cut.addActionListener(this);
        Copy.addActionListener(this); 
        Paste.addActionListener(this);

            m1=new Menu("file");    
             m2=new Menu("Edit"); 
              m1.add(Open);
              m1.add(Save);
              m1.add(Print);
              m1.add(New);
              m2.add(Cut);
              m2.add(Copy);
              m2.add(Paste);
              
              mb.add(m1);
              mb.add(m2);
              setMenuBar(mb);
             
       setVisible(true);           
    }
    public void actionPerformed(ActionEvent e){     
    }
    public static void  main(String s[])
    {
        new Program3();
    }
}
