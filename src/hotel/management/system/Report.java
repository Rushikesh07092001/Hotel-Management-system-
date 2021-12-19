
package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import net.proteanit.sql.DbUtils;
import java.sql.*;	
import javax.swing.*;
import javax.swing.JTable;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class Report extends JFrame{
    
    Connection conn = null;
    private JPanel contentPane;
   
	private JLabel lblId;
	private JLabel lblNewLabel;
	private JLabel lblGender;
	private JTable table;
	private JLabel lblCountry;
	private JLabel lblRoom;
	private JLabel lblStatus;
	private JLabel lblNewLabel_1;
        private JLabel lblNewLabel_2;
        private JLabel lblNewLabel_3;
        private JLabel lblNewLabel_4;
        private JLabel lblNewLabel_5;
        private JLabel lblNewLabel_6;
    
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Report frame = new Report();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	public void close()
	{
		this.dispose();
	}
        
        
        public Report() throws SQLException {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1360, 900);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Reception().setVisible(true);
                                setVisible(false);
			}
		});
		btnExit.setBounds(680, 510, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
		
		JButton btnLoadData = new JButton("Load Data");
		btnLoadData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try{
                                    conn c  = new conn();
                                    
				String displayCustomersql = "select * from Customer_info";
				ResultSet rs = c.s.executeQuery(displayCustomersql);
				table.setModel(DbUtils.resultSetToTableModel(rs));
			}
				catch(Exception e)
				{
					e.printStackTrace();
				}
			}
				
			
		});
		btnLoadData.setBounds(500, 510, 120, 30);
                btnLoadData.setBackground(Color.BLACK);
                btnLoadData.setForeground(Color.WHITE);
		contentPane.add(btnLoadData);
		
		lblId = new JLabel("ID");
		lblId.setBounds(31, 11, 46, 14);
		contentPane.add(lblId);
                
                JLabel l1 = new JLabel("Number");
		l1.setBounds(120, 11, 46, 14);
		contentPane.add(l1);
		
		lblNewLabel = new JLabel("Name");
		lblNewLabel.setBounds(240, 11, 65, 14);
		contentPane.add(lblNewLabel);
		
		lblGender = new JLabel("Gender");
		lblGender.setBounds(320, 11, 46, 14);
		contentPane.add(lblGender);
		
		table = new JTable();
		table.setBounds(0, 40, 1300, 450);
		contentPane.add(table);
		
		lblCountry = new JLabel("Country");
		lblCountry.setBounds(420, 11, 46, 14);
		contentPane.add(lblCountry);
		
		lblRoom = new JLabel("Room");
		lblRoom.setBounds(520, 11, 46, 14);
		contentPane.add(lblRoom);
		
		lblStatus = new JLabel("Check-in Status");
		lblStatus.setBounds(600, 11, 100, 14);
		contentPane.add(lblStatus);
		
		lblNewLabel_1 = new JLabel("Deposit");
		lblNewLabel_1.setBounds(710, 11, 46, 14);
		contentPane.add(lblNewLabel_1);
                
                
                lblNewLabel_2 = new JLabel("Check-in date");
		lblNewLabel_2.setBounds(790, 11, 100, 14);
		contentPane.add(lblNewLabel_2);
                
                lblNewLabel_3 = new JLabel("Check-out date");
		lblNewLabel_3.setBounds(900, 11, 100, 14);
		contentPane.add(lblNewLabel_3);
                
                lblNewLabel_4 = new JLabel("Bed-Type");
		lblNewLabel_4.setBounds(1000, 11, 100, 14);
		contentPane.add(lblNewLabel_4);
                
                lblNewLabel_5 = new JLabel("Type-of booking");
		lblNewLabel_5.setBounds(1100, 11, 100, 14);
		contentPane.add(lblNewLabel_5);
                
                lblNewLabel_6 = new JLabel("Bed-price");
		lblNewLabel_6.setBounds(1200, 11, 100, 14);
		contentPane.add(lblNewLabel_6);
                getContentPane().setBackground(Color.WHITE);
	}
}

		
	
    

