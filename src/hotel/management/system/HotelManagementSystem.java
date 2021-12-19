package hotel.management.system;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class HotelManagementSystem extends JFrame implements ActionListener{
    HotelManagementSystem(){
        setBounds(50,0,1280,768);
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/first.jpg"));
        JLabel L1 =new JLabel(i1);
        L1.setBounds(0,0, 1280,768);
        add(L1);
        
        JLabel L2 =new JLabel  ("Hotel Management System");
        L2.setBounds (20,600,1000,90);
        L2.setForeground(Color.WHITE);      
        L2.setFont(new Font ("serif",Font.PLAIN,70));
        L1.add(L2);
        
        JButton b1 = new JButton("next");
        b1.setBackground(Color.WHITE);
        b1.setForeground(Color.BLACK);
        b1.setBounds(1100,630,170,40);
        L1.add(b1);
        b1.addActionListener(this);
        setLayout(null);
        setVisible(true);
        
         
        while(true){
            L2.setVisible(false);
            try{
                 Thread.sleep(500);
            }catch(Exception e){
               
            }
            L2.setVisible(true);
            try{
                 
                 Thread.sleep(500);
            }catch(Exception e){}
                 
        }
         
    }                                                          
    public void actionPerformed(ActionEvent Ae){
        
        new Login().setVisible(true);
        this.setVisible(false);
    }

    public static void main (String[] args){
        HotelManagementSystem window = new HotelManagementSystem();
         window.setVisible(true);
        
    }
    
}
