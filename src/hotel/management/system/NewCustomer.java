package hotel.management.system;

import java.awt.BorderLayout;
import java.awt.*;
import java.awt.EventQueue;

import javax.swing.border.EmptyBorder;

import java.awt.Font;
import java.awt.Image;
import java.sql.*;	
import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class NewCustomer extends JFrame {
	Connection conn = null;
	PreparedStatement pst = null;
	private JPanel contentPane;
	private JTextField number,name,check_in_date,check_out_date,Bed_Type,deposit,Bed_price,Checked_In,country;
       
        JComboBox comboBox ,comboBox_2;
        JRadioButton r1,r2;
        Choice c1;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewCustomer frame = new NewCustomer();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public NewCustomer() throws SQLException {
		
                setBounds(250, 50, 900, 700);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
                
                ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fifth.png"));
                Image i3 = i1.getImage().getScaledInstance(300, 400,Image.SCALE_DEFAULT);
                ImageIcon i2 = new ImageIcon(i3);
                JLabel l1 = new JLabel(i2);
                l1.setBounds(480,10,300,500);
                add(l1);
		
		JLabel lblName = new JLabel("NEW CUSTOMER FORM");
		lblName.setFont(new Font("Yu Mincho", Font.PLAIN, 20));
		lblName.setBounds(118, 11, 260, 53);
		contentPane.add(lblName);
                
                JLabel lblId = new JLabel("ID :");
		lblId.setBounds(35, 76, 200, 14);
		contentPane.add(lblId);
                
                comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving license"});
		comboBox.setBounds(271, 73, 150, 20);
		contentPane.add(comboBox );
                
                JLabel l2 = new JLabel("Number :");
		l2.setBounds(35, 111, 200, 14);
		contentPane.add(l2);
                
                number = new JTextField();
		number.setBounds(271, 111, 150, 20);
		contentPane.add(number);
		number.setColumns(10);
		
		JLabel lblName_1 = new JLabel("Name :");
		lblName_1.setBounds(35, 151, 200, 14);
		contentPane.add(lblName_1);
		
		name = new JTextField();
		name.setBounds(271, 151, 150, 20);
		contentPane.add(name);
		name.setColumns(10);
                
                JLabel lblName_7= new JLabel("Check In Date :");
		lblName_7.setBounds(35,390, 200, 14);
		contentPane.add(lblName_7);
                
                
                JLabel lblName_8 = new JLabel("Check Out Date :");
		lblName_8.setBounds(35, 430, 200, 14);
		contentPane.add(lblName_8);
                
                JLabel lblbedtype = new JLabel("Bed Type :");
		lblbedtype.setBounds(35, 470, 200, 14);
		contentPane.add(lblbedtype);
                
                
                Bed_Type= new JTextField();
		Bed_Type.setBounds(271, 470, 150, 20);
		contentPane.add(Bed_Type);
		Bed_Type.setColumns(10);
                
            
		
                
             
                
                JLabel lblBooking= new JLabel("Booking Type :");
		lblBooking.setBounds(35, 510, 200, 14);
		contentPane.add(lblBooking);
                
                comboBox_2 = new JComboBox(new String[] {"ON THE SPOT", "RESERVATION", "PRE_BOOKING",});
		comboBox_2.setBounds(271, 510, 150, 20);
		contentPane.add(comboBox_2 );
                
                JLabel lblGender = new JLabel("Gender :");
		lblGender.setBounds(35, 191, 200, 14);
		contentPane.add(lblGender);
                
                r1 = new JRadioButton("Male");
                r1.setFont(new Font("Raleway", Font.BOLD, 14));
                r1.setBackground(Color.WHITE);
                r1.setBounds(271, 191, 80, 12);
                add(r1);
                
                r2 = new JRadioButton("Female");
                r2.setFont(new Font("Raleway", Font.BOLD, 14));
                r2.setBackground(Color.WHITE);
                r2.setBounds(350, 191, 100, 12);
		add(r2);
                
		JLabel lblCountry = new JLabel("Country :");
		lblCountry.setBounds(35, 231, 200, 14);
		contentPane.add(lblCountry);
		
		JLabel lblReserveRoomNumber = new JLabel("Allocated Room Number :");
		lblReserveRoomNumber.setBounds(35, 274, 200, 14);
		contentPane.add(lblReserveRoomNumber);
                
            
                    c1 = new Choice();
                try{
                    conn c = new conn();
                    ResultSet rs = c.s.executeQuery("select * from room where availability= 'Available'");
                    while(rs.next()){
                        c1.add(rs.getString("room_number"));    
                    }
                }catch(Exception e){ }
                c1.setBounds(271, 274, 150, 20);
		contentPane.add(c1);
		
		JLabel lblCheckInStatus = new JLabel("Checked-In :");
		lblCheckInStatus.setBounds(35, 316, 200, 14);
		contentPane.add(lblCheckInStatus);
		
		JLabel lblDeposite = new JLabel("Deposit :");
		lblDeposite.setBounds(35, 359, 200, 14);
		contentPane.add(lblDeposite);
		
		
		
		
		
		country = new JTextField();
		country.setBounds(271, 231, 150, 20);
		contentPane.add(country);
		country.setColumns(10);
		
		
		Checked_In= new JTextField();
		Checked_In.setBounds(271, 316, 150, 20);
		contentPane.add(Checked_In);
		Checked_In.setColumns(10);
		
		deposit = new JTextField();
		deposit.setBounds(271, 359, 150, 20);
		contentPane.add(deposit);
		deposit.setColumns(10);
                
                check_in_date= new JTextField();
		check_in_date.setBounds(271, 390, 150, 20);
		contentPane.add(check_in_date);
		check_in_date.setColumns(10);
                
                check_out_date= new JTextField();
		check_out_date.setBounds(271, 430, 150, 20);
		contentPane.add(  check_out_date);
		check_out_date.setColumns(10);
                
                JLabel lblbedprice = new JLabel("Bed price :");
		lblbedprice.setBounds(35, 550, 200, 14);
		contentPane.add(lblbedprice);
                
               
                Bed_price= new JTextField();
		Bed_price.setBounds( 271,550, 150, 20);
		contentPane.add(Bed_price);
		Bed_price.setColumns(10);
                
               	JButton btnNewButton = new JButton("Add");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            conn c = new conn();
                            String radio = null;
                            
                            if(r1.isSelected()){ 
                                radio = "Male";
                            }
                            else if(r2.isSelected()){ 
                                radio = "Female";
                            }
                            
                            String s6 = c1.getSelectedItem();
                         
                          
                            try{
	    			
                                String s1 = (String)comboBox.getSelectedItem(); 
	    			String s2 =  number.getText();
	    			String s3 =  name.getText();
                                String s4 =  radio;
	    			String s5 =  country.getText();
	    			String s7 =  Checked_In.getText();
                                String s8 =  deposit.getText();
                                String s9 =  check_in_date.getText();
                                String s10 =  check_out_date.getText();
                                String s12 =  Bed_Type.getText();
                                String s13 =  Bed_price.getText();
                               
                                
                              
                              
                                
                                String s11 = (String)comboBox_2.getSelectedItem(); 
                                
                                
                                
                                String q1 = "insert into customer values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')";
                                String q3 = "insert into customer_info values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"','"+s9+"','"+s10+"','"+s11+"','"+s12+"','"+s13+"')";
                                String q2 = "update room set availability = 'Occupied' where room_number = "+s6;
                                c.s.executeUpdate(q1);
                                c.s.executeUpdate(q2);
                                c.s.executeUpdate(q3);
	    			
	    			
	    			JOptionPane.showMessageDialog(null, "Data Inserted Successfully");
                                new Reception().setVisible(true);
                                setVisible(false);
	    		}catch(SQLException e1){
	    			System.out.println(e1.getMessage());
	    		}
		    		catch(NumberFormatException s){
		    			JOptionPane.showMessageDialog(null, "Please enter a valid Number");
			}
			}
		});
		btnNewButton.setBounds(400, 600, 120, 30);
                btnNewButton.setBackground(Color.BLACK);
                btnNewButton.setForeground(Color.WHITE);
		contentPane.add(btnNewButton);
                
                JButton b1 = new JButton("Check");
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            try{
                                String s6 = c1.getSelectedItem();
				conn c = new conn();
                                ResultSet rs1 = c.s.executeQuery("select * from room where room_number = "+s6);
                                
                                while(rs1.next()){
                                Bed_Type .setText(rs1.getString("bed_type"));   
                                Bed_price.setText(rs1.getString("price"));   
                                }
                            }catch(Exception ee){}
                          
                        }
		});
		b1.setBounds(120, 600,120,30);
                b1.setBackground(Color.BLACK);
                b1.setForeground(Color.WHITE);
                contentPane.add(b1);
            
                
                
                
		
		JButton btnExit = new JButton("Back");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
                            new Reception().setVisible(true);
                            setVisible(false);
			}
		}); 
		btnExit.setBounds(260, 600, 120, 30);
                btnExit.setBackground(Color.BLACK);
                btnExit.setForeground(Color.WHITE);
		contentPane.add(btnExit);
                
                getContentPane().setBackground(Color.WHITE);
	}
}