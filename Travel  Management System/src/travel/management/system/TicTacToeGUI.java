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
import java.awt.*;
import java.awt.event.*;

public class TicTacToeGUI extends JFrame implements ActionListener {
            
        static String s = null;
        static String a = null;
        static int i=0;
        static int j=0;
   
    private JButton[][] buttons;
    private JLabel message;
    private boolean xTurn;

    public TicTacToeGUI(String s,String a) {
        super("Tic Tac Toe");
this.a=a;
this.s=s;
        buttons = new JButton[3][3];
        message = new JLabel(" turn of "+s);
        xTurn = true;

        JPanel panel = new JPanel(new GridLayout(3, 3));
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                buttons[row][col] = new JButton("");
                buttons[row][col].addActionListener(this);
                panel.add(buttons[row][col]);
            }
        }
       addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                JOptionPane.showMessageDialog(null, "no of times game played "+j+" no of times game won"+i);
            }
        });
        getContentPane().add(panel, BorderLayout.CENTER);
        getContentPane().add(message, BorderLayout.SOUTH);

        setSize(300, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JButton button = (JButton) e.getSource();
        if (button.getText().equals("")) {
            if (xTurn) {
                button.setText("X");
                message.setText( "turn of"+a);
            } else {
                button.setText("O");
                message.setText("turn of"+s);
            }
            xTurn = !xTurn;
            checkForWin();
        }
    }

    private void checkForWin() {
        // Check rows
        for (int row = 0; row < 3; row++) {
            if (!buttons[row][0].getText().equals("") && 
                buttons[row][0].getText().equals(buttons[row][1].getText()) && 
                buttons[row][1].getText().equals(buttons[row][2].getText())) {
                if(buttons[row][0].getText().equals("X"))
                gameOver( "the winner is"+s);
                else
                    gameOver( "the winner is"+a);
                i++;
                return;
            }
        }
        
        // Check columns
        for (int col = 0; col < 3; col++) {
            if (!buttons[0][col].getText().equals("") && 
                buttons[0][col].getText().equals(buttons[1][col].getText()) && 
                buttons[1][col].getText().equals(buttons[2][col].getText())) {
                if(buttons[0][col].getText().equals("X"))
                gameOver( "the winner is"+s);
                else
                    gameOver( "the winner is"+a);
                i++;
                return;
            }
        }
        
        // Check diagonals
        if (!buttons[0][0].getText().equals("") && 
            buttons[0][0].getText().equals(buttons[1][1].getText()) && 
            buttons[1][1].getText().equals(buttons[2][2].getText())) {
            if(buttons[0][0].getText().equals("X"))
                gameOver( "the winner is"+s);
                else
                    gameOver( "the winner is"+a);
            i++;
            return;
        }
        if (!buttons[0][2].getText().equals("") && 
            buttons[0][2].getText().equals(buttons[1][1].getText()) && 
            buttons[1][1].getText().equals(buttons[2][0].getText())) {
            if(buttons[0][2].getText().equals("X"))
                gameOver( "the winner is"+s);
                else
                    gameOver( "the winner is"+a);
            i++;
            return;
        }
        
        // Check for tie
        boolean tie = true;
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (buttons[row][col].getText().equals("")) {
                    tie = false;
                }
            }
        }
        if (tie) {
            gameOver("Tie game");
        }
}

private void gameOver(String message) {
    JOptionPane.showMessageDialog(this, message, "Game Over", JOptionPane.INFORMATION_MESSAGE);
    resetGame();
    j++;
}

private void resetGame() {
    for (int row = 0; row < 3; row++) {
        for (int col = 0; col < 3; col++) {
            buttons[row][col].setText("");
        }
    }
    message.setText("X's turn");
    xTurn = true;
}

public static void main(String[] args) {
         
        
    new TicTacToeGUI("","");
}}
 class Username extends JFrame implements ActionListener {
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

           
