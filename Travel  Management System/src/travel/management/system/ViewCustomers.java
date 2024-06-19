package travel.management.system;


import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JTable;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class ViewCustomers extends JFrame {
	Connection conn = null;
	private JPanel contentPane;
	private JTable table;
	private JLabel lblAvailability;
	private JLabel lblCleanStatus;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblRoomNumber;
	private JLabel lblId,u,id,na,nu,ph,co,e,g,ad;

	/**
	 * Launch the application.
	 */
	

        
	public ViewCustomers(String username) throws SQLException 
	{
		//conn = Javaconnect.getDBConnection();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(580, 220, 900, 680);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i3 = i1.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(0,450,626,201);
                add(l1);
                
                ImageIcon i4  = new ImageIcon(ClassLoader.getSystemResource("icons/viewall.jpg"));
                Image i5 = i4.getImage().getScaledInstance(626, 201,Image.SCALE_DEFAULT);
                ImageIcon i6 = new ImageIcon(i5);
                JLabel l2 = new JLabel(i6);
                l2.setBounds(615,450,626,201);
                add(l2);
                
		
		
		JButton btnNewButton = new JButton("Back");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		
		btnNewButton.setBounds(390, 400, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
		
		lblAvailability = new JLabel("Username");
		lblAvailability.setBounds(30, 50, 150, 25);
		contentPane.add(lblAvailability);
		 u=new JLabel();
		u.setBounds(220, 50, 150, 25);
		contentPane.add(u);
		
		
		lblCleanStatus = new JLabel("Id Type");
		lblCleanStatus.setBounds(30, 110, 150, 25);
		contentPane.add(lblCleanStatus);
		 id=new JLabel();
		id.setBounds(220, 110, 150, 25);
		contentPane.add(id);
		
		lblNewLabel = new JLabel("Number");
		lblNewLabel.setBounds(30, 170, 150, 25);
		contentPane.add(lblNewLabel);
			 nu=new JLabel();
		nu.setBounds(220, 170, 150, 25);
		contentPane.add(nu);
		
		lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setBounds(30, 230, 150, 25);
		contentPane.add(lblNewLabel_1);
				 na=new JLabel();
		na.setBounds(220, 230, 150, 25);
		contentPane.add(na);

		
		lblId = new JLabel("Gender");
		lblId.setBounds(30, 290, 150, 25);
		contentPane.add(lblId);
		 g=new JLabel();
		g.setBounds(220, 290, 150, 25);
		contentPane.add(g);
                
                JLabel l3 = new JLabel("Country");
		l3.setBounds(500, 50, 150, 25);
		contentPane.add(l3);
				 co=new JLabel();
		co.setBounds(690, 50, 150, 25);
		contentPane.add(co);
                
                JLabel l4 = new JLabel("Address");
		l4.setBounds(500, 110, 150, 25);
		contentPane.add(l4);
			 ad=new JLabel();
		ad.setBounds(690, 110, 150, 25);
		contentPane.add(ad);
                
                JLabel l5 = new JLabel("Phone");
		l5.setBounds(500, 170, 150, 25);
		contentPane.add(l5);
				 ph=new JLabel();
		ph.setBounds(690, 170, 150, 25);
		contentPane.add(ph);
                
                JLabel l6 = new JLabel("Email");
		l6.setBounds(500, 230, 150, 25);
		contentPane.add(l6);
			 e=new JLabel();
		e.setBounds(690, 230, 150, 25);
		contentPane.add(e);
                
                getContentPane().setBackground(Color.WHITE);
                try{
                    Conn c = new Conn();
                        String displayCustomersql = "select * from customer where username='"+username+"'";
                        ResultSet rs = c.s.executeQuery(displayCustomersql);
                        while(rs.next())
                        {
                            u.setText(rs.getString("username"));
                            id.setText(rs.getString("id_type"));
                            nu.setText(rs.getString("number"));
                            na.setText(rs.getString("name"));
                            g.setText(rs.getString("gender"));
                            co.setText(rs.getString("country"));
                            ad.setText(rs.getString("address"));
                            ph.setText(rs.getString("phone"));
                            e.setText(rs.getString("email"));
                            
                           
                        }
                }
                catch(Exception e1){
                        e1.printStackTrace();
                }
	}
public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ViewCustomers frame = new ViewCustomers("");
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}