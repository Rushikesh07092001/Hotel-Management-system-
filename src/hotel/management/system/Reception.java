package hotel.management.system;
import java.awt.Color;
import javax.swing.*;
import java.awt.image.*;
import javax.swing.ImageIcon.*;
import java.awt.color.*;
import java .awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Reception extends JFrame implements ActionListener{
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    Reception(){
    
        b1 = new JButton("new Customer form");
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setBounds(10,30,200,30);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Room");
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setBounds(10,70,200,30);
        b2.addActionListener(this);
        add(b2);
        
        b3 = new JButton("Department");
        b3.setBackground(Color.BLACK);
        b3.setForeground(Color.WHITE);
        b3.addActionListener(this);
        b3.setBounds(10,110,200,30);
        add(b3);
        
        b4 = new JButton("All Employee info");
        b4.setBackground(Color.BLACK);
        b4.setForeground(Color.WHITE);
        b4.setBounds(10,150,200,30);
        b4.addActionListener(this);
        add(b4);
        
        b5 = new JButton(" Customer Info");
        b5.setBackground(Color.BLACK);
        b5.setForeground(Color.WHITE);
        b5.setBounds(10,190,200,30);
        b5.addActionListener(this);
        add(b5);
        
        b6 = new JButton("Manger Info");
        b6.setBackground(Color.BLACK);
        b6.setForeground(Color.WHITE);
        b6.setBounds(10,230,200,30);
        b6.addActionListener(this);
        add(b6);
        
        b7 = new JButton("Check Out");
        b7.setBackground(Color.BLACK);
        b7.setForeground(Color.WHITE);
        b7.setBounds(10,270,200,30);
        b7.addActionListener(this);
        add(b7);
        
        b8 = new JButton("Update Check Status");
        b8.setBackground(Color.BLACK);
        b8.setForeground(Color.WHITE);
        b8.setBounds(10,310,200,30);
        b8.addActionListener(this);
        add(b8);
        
        b9 = new JButton("Update Room Status");
        b9.setBackground(Color.BLACK);
        b9.setForeground(Color.WHITE);
        b9.setBounds(10,350,200,30);
        b9.addActionListener(this);
        add(b9);
        
        b10 = new JButton("drop off");
        b10.setBackground(Color.BLACK);
        b10.setForeground(Color.WHITE);
        b10.setBounds(10,390,200,30);
        b10.addActionListener(this);
        add(b10);
        
        b11 = new JButton("Search Room");
        b11.setBackground(Color.BLACK);
        b11.setForeground(Color.WHITE);
        b11.setBounds(10,430,200,30);
        b11.addActionListener(this);
        add(b11);
        
        b12 = new JButton("Logout");
        b12.setBackground(Color.BLACK);
        b12.setForeground(Color.WHITE);
        b12.setBounds(10,470,200,30);
        b12.addActionListener(this);
        add(b12);
        
        ImageIcon i1  = new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/fourth.jpg"));
        JLabel l1 =new JLabel(i1);
        l1.setBounds(250,30,500,470);
        add(l1);
        
        getContentPane().setBackground(Color.white);
        
        setLayout(null);
        setBounds(300,150,800,570);
        setVisible(true);
    
        
        
      
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            try {
                new NewCustomer().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }else if(ae.getSource() == b2){
             try {
                new Room().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
     
        }else if(ae.getSource() == b3){
              try {
                new Department().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
      
     
        }else if(ae.getSource() == b4){
             try {
                new EmployeeInfo().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
           
     
        }else if(ae.getSource() == b5){
             try {
                new CustomerInfo().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
            
     
        }else if(ae.getSource() == b6){
            try {
                new ManagerInfo().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
     
        }else if(ae.getSource() == b7){
             try {
                new CheckOut().setVisible(true);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.setVisible(false);
     
        }else if(ae.getSource() == b8){
            try {
                new UpdateCheck().setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }else if(ae.getSource() == b9){
            try {
                new UpdateRoom().setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }else if(ae.getSource() == b10){
             try {
                new PickUp().setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }else if(ae.getSource() == b11){
             try {
                new SearchRoom().setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
     
        }else if(ae.getSource() == b12){
            setVisible(false);
     
        }
        
    }
    public static void main (String[] args){
        new Reception().setVisible(true);
        
    }
}
