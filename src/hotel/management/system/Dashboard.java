
package hotel.management.system;
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java .awt.event.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dashboard extends JFrame implements ActionListener{
    JMenuBar mb;
    JMenu m1,m2;
    JMenuItem i1,i2,i3,i4,i5;
    Dashboard(){ 
        mb = new JMenuBar();
        add(mb);
        
        m1=new JMenu("HOTEL MANAGEMENT");
        m1.setForeground(Color.BLUE);
        mb.add(m1);
        
        m2=new JMenu("ADMIN");
        m2.setForeground(Color.RED);
        mb.add(m2);
        
        i1=new JMenuItem("RECEPTION");
        i1.addActionListener(this);
        m1.add(i1);
        
        i2=new JMenuItem("ADD EMPLOYEE");
        i2.addActionListener(this);
        m2.add(i2);
        
        i3=new JMenuItem("ADD ROOM");
        i3.addActionListener(this);
        m2.add(i3);
        
        i4=new JMenuItem ("ADD DRIVER");
        i4.addActionListener(this);
        m2.add(i4);
        
        i5=new JMenuItem ("REPORT");
        i5.addActionListener(this);
        m2.add(i5);
        
        mb.setBounds(0,0,1370,20);
        
        ImageIcon i1 =new ImageIcon(ClassLoader.getSystemResource("hotel/management/system/icons/third.jpg"));
        
        JLabel l1 = new JLabel (i1);
        l1.setBounds(0,0,1370,800);
        add(l1);
        
        JLabel l2= new JLabel("THE TAJ HOTEL WELCOMES YOU");
        l2.setBounds(700,60,600,60);
        l2.setForeground(Color.white);
        l2.setFont(new Font("Serif",Font.PLAIN,35));
        l1.add(l2);
                
                
        setLayout(null);
        setBounds(0,0,1370,800);
        setVisible(true);
    }
 
    public void actionPerformed(ActionEvent ae){
        if(ae.getActionCommand().equals("RECEPTION")){
            new Reception().setVisible(true);
            
        }else if(ae.getActionCommand().equals("ADD EMPLOYEE")){
            new AddEmployee().setVisible(true); 
        }else if(ae.getActionCommand().equals("ADD ROOM")){
            new AddRooms().setVisible(true);   
        }else if(ae.getActionCommand().equals("ADD DRIVER")){
            new AddDriver().setVisible(true);
         }else if(ae.getSource() == i5){
             try {
                new Report().setVisible(true);
                this.setVisible(false);
            } catch (SQLException ex) {
                Logger.getLogger(Reception.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        
                
        }       

    }
    public static void main (String[]  args){
        new Dashboard().setVisible(true);
    }

   
}
