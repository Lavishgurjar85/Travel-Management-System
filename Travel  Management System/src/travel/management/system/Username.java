/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package travel.management.system;

/**
 *
 * @author lenovo
 */
import java.util.*;
import javax.swing.*;
import java.awt.event.*;
public class Username extends JFrame implements ActionListener {
    static String playerName1,playerName2;
    JLabel name1,name2;
    JTextField t1,t2;
    
    Username()
    {
       setBounds(10,10,500,500);
       setLayout(null);
       setVisible(true);
       name1=new JLabel("Name of  Players");
       name1.setBounds(10,10,150,30);
       add(name1);
       t1=new JTextField();
       t1.setBounds(200,10,100,30);
       add(t1);
    
       t2=new JTextField();
       t2.setBounds(200,50,100,30);
       add(t2);
       JButton j=new JButton("Play");
       j.setBounds(10,130,60,30);
       add(j);
       j.addActionListener(this);

    }
    public void actionPerformed(ActionEvent e){
        playerName1=t1.getText();
        playerName2=t2.getText();
    new TicTacToeGUI(playerName1,playerName2).setVisible(true);
    setVisible(false);
    }

    public static void main(String[] args) {
         new Username();
}
    }
