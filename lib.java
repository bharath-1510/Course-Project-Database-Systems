//images file location : C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Images\\
//Access file location : C:\\Users\\ADMIN\\Desktop\\setup\\bin\\
package lib;
import java.util.Date;
import java.text.*;
import javax.swing.*;
import java.awt.*;
import java.sql.*;
import java.awt.event.*;
public class lib extends JFrame
{
    String s1,s2;
    JFrame f,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24,b25,b26,b27,b28,b29,b30,b31,b32,b33,b34,b35;
    JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17,l18,l19,l20,l21,l22,l23,l24,l25,l26;
    JTextField t1,t3,t4,t5,t6,t7,t8,t9,t10,t11,t12,t13,t14,t15,t16,t17,t18,t19,fw[]= new JTextField[3],fw1[];    
    JPasswordField t2;
    float fine=0;
    Image icon = Toolkit.getDefaultToolkit().getImage("C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Images\\con2.png");
    ImageIcon icon1 = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Images\\con1.png");
    ImageIcon icon2 = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Images\\con3.jpg");
    ImageIcon icon3 = new ImageIcon("C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Images\\con4.png");
    Color c = new Color(102, 217, 255);
    Color c1= new Color(57, 19, 19);    
    Color c2= new Color(92, 0, 153);    
    Color c3 = new Color(255, 140, 102);                
    Color c4 = new Color(148, 148, 184);        
    static boolean check1(String w)
    {
        SimpleDateFormat fw = new SimpleDateFormat("dd-MM-yyyy");
        fw.setLenient(false);
        try 
        {
            fw.parse(w);
        } 
        catch (ParseException pe)
        {
            return false;
        }
        return true;   
    }
    lib()
    {
        f = new JFrame();
        f2 = new JFrame();
        f3 = new JFrame();
        f4 = new JFrame();
        f5 = new JFrame();
        f6 = new JFrame();
        f7 = new JFrame();
        f8 = new JFrame();
        f9 = new JFrame();
        f10 = new JFrame();
        f11 = new JFrame();
        f12 = new JFrame();
        f.addWindowListener(new window());
        f.setTitle("LIBRARY MANAGEMENT");
        f.setBounds(0,0,300,300);
        f.setVisible(true);
        f.setLayout(null);
        f.setResizable(false);
        f.getContentPane().setBackground(c);
        f2.setTitle("ADMIN LOGIN");
        f2.setSize(450,350);
        f2.setLayout(null);
        f2.addWindowListener(new window());
        f2.setResizable(false);
        f2.getContentPane().setBackground(c3);
        f3.setTitle("ADMIN PROCESS");
        f3.setSize(450,350);
        f3.setLayout(null);
        f3.addWindowListener(new window());
        f3.setResizable(false);
        f3.getContentPane().setBackground(c3);
        f4.setTitle("ADD SECTION");
        f4.setSize(450,350);
        f4.setLayout(null);
        f4.addWindowListener(new window());
        f4.getContentPane().setBackground(c3);
        f4.setResizable(false);
        f5.setTitle("VIEW SECTION");
        f5.setSize(450,350);
        f5.setLayout(null);
        f5.addWindowListener(new window());
        f5.getContentPane().setBackground(c3);
        f5.setResizable(false);
        f6.setTitle("DELETE SECTION");
        f6.setSize(450,350);
        f6.setLayout(null);
        f6.addWindowListener(new window());
        f6.setResizable(false);
        f6.getContentPane().setBackground(c3);
        f7.setBounds(0,0,400,500);
        f7.setLayout(null);
        f7.addWindowListener(new window());
        f7.setTitle("USER SECTION");
        f7.addWindowListener(new window());
        f7.setResizable(false);
        f7.getContentPane().setBackground(c4);
        f8.setBounds(0,0,450,300);
        f8.setLayout(null);        
        f8.addWindowListener(new window());
        f8.setTitle("BOOK BORROW");
        f8.setResizable(false);
        f8.getContentPane().setBackground(c4);
        f9.setBounds(0,0,450,300);
        f9.setLayout(null);
        f9.addWindowListener(new window());
        f9.setTitle("BOOK RENEWAL");
        f9.setResizable(false);
        f9.getContentPane().setBackground(c4);
        f10.setBounds(0,0,450,300);
        f10.setLayout(null);
        f10.addWindowListener(new window());
        f10.setTitle("BOOK RETURN");
        f10.setResizable(false);
        f10.getContentPane().setBackground(c4);
        f12.setBounds(0,0,400,600);
        f12.setLayout(null);
        f12.addWindowListener(new window());
        f12.setTitle("DUE SECTION");       
        f12.setResizable(false);
        f12.getContentPane().setBackground(c4);
        b1 = new JButton("ADMIN");
        b1.setBounds(85,50,100,50);
        b2 = new JButton("USER");
        b2.setBounds(85,125,100,50);
        l1 = new JLabel("ADMIN NAME ");
        l1.setBounds(100,30,100,20);
        t1 =new JTextField();
        t1.setBounds(200,30,150,20);
        l2 = new JLabel("PASSWORD ");
        l2.setBounds(100,60,100,20);
        t2 =new JPasswordField();
        t2.setBounds(200,60,150,20);
        b3 = new JButton("OK");
        b3.setBounds(100,90,60,30);
        b4 = new JButton("CLEAR");
        b4.setBounds(170,90,80,30);
        b5 = new JButton("GO BACK");
        b5.setBounds(260,90,100,30);
        l3 = new JLabel("");
        l3.setBounds(60,10,100,30);
        b6 = new JButton("ADD");
        b6.setBounds(140,50,100,30);
        b7 = new JButton("VIEW");
        b7.setBounds(140,100,100,30);
        b8 = new JButton("DELETE");
        b8.setBounds(140,150,100,30);
        b9 = new JButton("GO BACK");
        b9.setBounds(140,200,100,30);
        l4 = new JLabel("BOOK NO");
        l4.setBounds(60,10,100,30);
        t3 = new JTextField();
        t3.setBounds(175,15,170,20);
        l5 = new JLabel("BOOK NAME");
        l5.setBounds(60,40,100,30);
        t4 = new JTextField();
        t4.setBounds(175,45,170,20);
        l6 = new JLabel("AUTHOR NAME");
        l6.setBounds(60,70,100,30);
        t5 = new JTextField();
        t5.setBounds(175,75,170,20);
        l7 = new JLabel("PUBLISHER NAME ");
        l7.setBounds(60,100,150,30);
        t6 = new JTextField();
        t6.setBounds(175,105,170,20);
        l8 = new JLabel("NO OF BOOKS");
        l8.setBounds(60,130,100,30);
        t7 = new JTextField();
        t7.setBounds(175,135,170,20);
        b10 = new JButton("OK");
        b10.setBounds(60,160,60,30);
        b11 = new JButton("CLEAR");
        b11.setBounds(130,160,80,30);
        b12 = new JButton("GO BACK");
        b12.setBounds(220,160,100,30);
        l9 = new JLabel("SEARCH BY NUMBER");
        l9.setBounds(60,10,200,30);
        t8 = new JTextField();
        t8.setBounds(200,15,100,20);
        b13 = new JButton("OK");
        b13.setBounds(60,45,60,30);
        b14 = new JButton("CLEAR");
        b14.setBounds(130,45,80,30);
        b15 = new JButton("GO BACK");
        b15.setBounds(220,45,100,30);
        l10 = new JLabel();
        l10.setBounds(60,90,400,30);
        l11 = new JLabel();
        l11.setBounds(60,110,400,30);
        l12 = new JLabel();
        l12.setBounds(60,130,400,30);
        l13 = new JLabel();
        l13.setBounds(60,150,400,30);
        l14 = new JLabel();
        l14.setBounds(60,170,400,30);
        l15 = new JLabel("DELETE BY NUMBER");
        l15.setBounds(60,10,200,30);
        t9 = new JTextField();
        t9.setBounds(200,15,100,20);
        b16 = new JButton("OK");
        b16.setBounds(60,45,60,30);
        b17 = new JButton("CLEAR");
        b17.setBounds(130,45,80,30);
        b18 = new JButton("GO BACK");
        b18.setBounds(220,45,100,30);
        l16 = new JLabel("SELECTED BOOK DETAILS ARE DELETED!!!");
        l16.setBounds(60,90,300,30);
        b19 = new JButton("BOOK BORROW");
        b19.setBounds(100,50,200,50);
        b20 = new JButton("BOOK RENEWAL");
        b20.setBounds(100,125,200,50);
        b21 = new JButton("BOOK RETURN");
        b21.setBounds(100,200,200,50);
        b32 = new JButton("BOOK DUE");
        b32.setBounds(100,275,200,50);        
        b31 = new JButton("GO BACK");
        b31.setBounds(100,350,200,50);
        l23 = new JLabel("ROLL NUMBER");
        l23.setBounds(50,40,200,20);
        t16 = new JTextField();
        t16.setBounds(220,40,100,20);
        l17 = new JLabel("TYPE BOOK  NUMBER");
        l17.setBounds(50,65,200,20);
        t10 = new JTextField();
        t10.setBounds(220,65,100,20);
        l18 = new JLabel("DATE ");
        l18.setBounds(50,90,200,20);
        t11 = new JTextField();
        t11.setBounds(220,90,100,20);
        b22 = new JButton("SEARCH");
        b22.setBounds(50,120,100,30);
        b23 = new JButton("CLEAR");
        b23.setBounds(170,120,80,30);
        b24 = new JButton("GO BACK");
        b24.setBounds(270,120,100,30);
        l24 = new JLabel("ROLL NUMBER");
        l24.setBounds(50,40,200,20);
        t17 = new JTextField();
        t17.setBounds(220,40,100,20);
        l19 = new JLabel("TYPE BOOK  NUMBER");
        l19.setBounds(50,65,200,20);
        t12 = new JTextField();
        t12.setBounds(220,65,100,20);
        l20 = new JLabel("DATE ");
        l20.setBounds(50,90,200,20);
        t13 = new JTextField();
        t13.setBounds(220,90,100,20);
        b25 = new JButton("RENEW");
        b25.setBounds(50,120,100,30);
        b26= new JButton("CLEAR");
        b26.setBounds(170,120,80,30);
        b27 = new JButton("GO BACK");
        b27.setBounds(270,120,100,30);
        l25 = new JLabel("ROLL NUMBER");
        l25.setBounds(50,40,200,20);
        t18 = new JTextField();
        t18.setBounds(220,40,100,20);
        l21 = new JLabel("TYPE BOOK  NUMBER");
        l21.setBounds(50,65,200,20);
        t14 = new JTextField();
        t14.setBounds(220,65,100,20);
        l22 = new JLabel("DATE ");
        l22.setBounds(50,90,200,20);
        t15 = new JTextField();
        t15.setBounds(220,90,100,20);
        b28 = new JButton("RETURN");
        b28.setBounds(50,120,100,30);
        b29 = new JButton("CLEAR");
        b29.setBounds(170,120,80,30);
        b30 = new JButton("GO BACK");
        b30.setBounds(270,120,100,30);
        l26 = new JLabel("ROLL NUMBER");
        l26.setBounds(50,40,200,20);
        t19 = new JTextField();
        t19.setBounds(150,40,100,20);
        b33 = new JButton("OK");
        b33.setBounds(50,70,100,30);
        b34 = new JButton("CLEAR");
        b34.setBounds(170,70,80,30);
        b35 = new JButton("GO BACK");
        b35.setBounds(270,70,100,30);
	f.setIconImage(icon);
        f2.setIconImage(icon);
        f3.setIconImage(icon);
        f4.setIconImage(icon);
        f5.setIconImage(icon);
        f6.setIconImage(icon);
        f7.setIconImage(icon);
        f8.setIconImage(icon);
        f9.setIconImage(icon);
        f10.setIconImage(icon);
        f12.setIconImage(icon);
        f.add(b1);
        b1.setBackground(c1);
        b1.setForeground(Color.white);
        f.add(b2);
        b2.setBackground(c1);
        b2.setForeground(Color.white);
        f2.add(l2);
        f2.add(l1);
        f2.add(t1);
        t1.setBackground(c);
        t1.setForeground(Color.black);        
        f2.add(t2);
        t2.setBackground(c);
        t2.setForeground(Color.black);        
        f2.add(b3);
        b3.setBackground(Color.blue);
        b3.setForeground(Color.white);        
        f2.add(b4);
        b4.setBackground(Color.blue);
        b4.setForeground(Color.white);
        f2.add(b5);
        b5.setBackground(Color.blue);
        b5.setForeground(Color.white);
        f3.add(l3);
        f3.add(b6);
        b6.setBackground(Color.blue);
        b6.setForeground(Color.white);
        f3.add(b7);
        b7.setBackground(Color.blue);
        b7.setForeground(Color.white);
        f3.add(b8);
        b8.setBackground(Color.blue);
        b8.setForeground(Color.white);
        f3.add(b9);
        b9.setBackground(Color.blue);
        b9.setForeground(Color.white);
        f4.add(t3);
        t3.setBackground(c);
        t3.setForeground(Color.black);        
        f4.add(l4);
        f4.add(t4);
        t4.setBackground(c);
        t4.setForeground(Color.black);        
        f4.add(l5);
        f4.add(t5);
        t5.setBackground(c);
        t5.setForeground(Color.black);                
        f4.add(l6);
        f4.add(t6);
        t6.setBackground(c);
        t6.setForeground(Color.black);                
        f4.add(l7);
        f4.add(t7);
        t7.setBackground(c);
        t7.setForeground(Color.black);                
        f4.add(l8);
        b10.setBackground(Color.blue);
        b10.setForeground(Color.white);
        f4.add(b10);
        b11.setBackground(Color.blue);
        b11.setForeground(Color.white);
        f4.add(b11);
        b12.setBackground(Color.blue);
        b12.setForeground(Color.white);
        f4.add(b12);
        f5.add(l9);
        f5.add(t8);
        t8.setBackground(c);
        t8.setForeground(Color.black);
        f5.add(b13);
        b13.setBackground(Color.blue);
        b13.setForeground(Color.white);
        f5.add(b14);
        b14.setBackground(Color.blue);
        b14.setForeground(Color.white);
        f5.add(b15);
        b15.setBackground(Color.blue);
        b15.setForeground(Color.white);
        f6.add(b16);
        b16.setBackground(Color.blue);
        b16.setForeground(Color.white);
        f6.add(b17);
        b17.setBackground(Color.blue);
        b17.setForeground(Color.white);
        f6.add(b18);
        b18.setBackground(Color.blue);
        b18.setForeground(Color.white);
        f6.add(l15);
        f6.add(t9);
        t9.setBackground(c);
        t9.setForeground(Color.black);
        f7.add(b19);
        b19.setBackground(c2);
        b19.setForeground(Color.white);
        f7.add(b20);
        b20.setBackground(c2);
        b20.setForeground(Color.white);
        f8.add(l23);
        f8.add(t16);
        t16.setForeground(Color.blue);
        f8.add(l17);
        f8.add(t10);    
        t10.setForeground(Color.blue);
        f8.add(l18);
        f8.add(t11);       
        t11.setForeground(Color.blue);
        f7.add(b21);
        b21.setBackground(c2);
        b21.setForeground(Color.white);
        f7.add(b32);
        b32.setBackground(c2);
        b32.setForeground(Color.white);
        f7.add(b31);
        b31.setBackground(c2);
        b31.setForeground(Color.white);
        f8.add(b22);
        b22.setBackground(c2);
        b22.setForeground(Color.white);
        f8.add(b23);
        b23.setBackground(c2);
        b23.setForeground(Color.white);
        f8.add(b24);
        b24.setBackground(c2);
        b24.setForeground(Color.white);
        f9.add(l24);
        f9.add(t17);        
        t17.setForeground(Color.blue);        
        f9.add(l19);
        f9.add(t12);        
        t12.setForeground(Color.blue);
        f9.add(l20);
        f9.add(t13);
        t13.setForeground(Color.blue);
        f9.add(b25);
        b25.setBackground(c2);
        b25.setForeground(Color.white);
        f9.add(b26);
        b26.setBackground(c2);
        b26.setForeground(Color.white);
        f9.add(b27);
        b27.setBackground(c2);
        b27.setForeground(Color.white);
        f10.add(l25);
        f10.add(t18);        
        t18.setForeground(Color.blue);
        f10.add(l21);
        f10.add(t14);
        t14.setForeground(Color.blue);
        f10.add(l22);
        f10.add(t15);
        t15.setForeground(Color.blue);
        f10.add(b28);
        b28.setBackground(c2);
        b28.setForeground(Color.white);
        f10.add(b29);
        b29.setBackground(c2);
        b29.setForeground(Color.white);
        f10.add(b30);
        b30.setBackground(c2);
        b30.setForeground(Color.white);
        f12.add(l26);
        f12.add(t19);
        t19.setForeground(Color.blue);
        f12.add(b33);
        b33.setBackground(c2);
        b33.setForeground(Color.white);
        f12.add(b34);
        b34.setBackground(c2);
        b34.setForeground(Color.white);
        f12.add(b35);
        b35.setBackground(c2);
        b35.setForeground(Color.white);
        b1.addActionListener(new A1());
        b2.addActionListener(new A1());
        b3.addActionListener(new A2());
        b4.addActionListener(new A2());
        b5.addActionListener(new A2());
        b6.addActionListener(new A3());
        b7.addActionListener(new A3());
        b8.addActionListener(new A3());
        b9.addActionListener(new A3());
        b10.addActionListener(new A4());
        b11.addActionListener(new A4());
        b12.addActionListener(new A4());
        b13.addActionListener(new A5());
        b14.addActionListener(new A5());
        b15.addActionListener(new A5());
        b16.addActionListener(new A6());
        b17.addActionListener(new A6());
        b18.addActionListener(new A6());
        b19.addActionListener(new A7());
        b20.addActionListener(new A7());
        b21.addActionListener(new A7());
        b31.addActionListener(new A7());
        b32.addActionListener(new A7());
        b22.addActionListener(new A8());
        b23.addActionListener(new A8());
        b24.addActionListener(new A8());
        b25.addActionListener(new A9());
        b26.addActionListener(new A9());
        b27.addActionListener(new A9());
        b28.addActionListener(new A10());
        b29.addActionListener(new A10());
        b30.addActionListener(new A10());
        b33.addActionListener(new A11());
        b34.addActionListener(new A11());
        b35.addActionListener(new A11());
    }
    public class window extends WindowAdapter
    {
        public void windowClosing(WindowEvent we)
        {
            System.exit(0);
        }
    }
    public class A1 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("ADMIN"))
            {
                f.setVisible(false);
                f2.setVisible(true);
            }
            else if(s.equals("USER"))
            {
                f7.setVisible(true);
                f.setVisible(false);
            }
        }
    }
    public class A2 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            s1 = t1.getText();
            s2 = new String(t2.getPassword());
            boolean c=false;
            String k1,k2;
            if(s.equals("OK"))
            {
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("Select * from admin ");
                    while(rs.next())
                    {
                        k1=rs.getString("Aname");
                        k2=rs.getString("Apassword");
                        if(k1.equals(s1) && k2.equals(s2))
                            c=true;
                    }
                    if(c)
                    {
                        JOptionPane.showMessageDialog(f11,"Welcome  "+s1+" Sir","Success",JOptionPane.PLAIN_MESSAGE,icon1);
                        f2.setVisible(false);
                        f3.setVisible(true);
                    }
                    else
                        JOptionPane.showMessageDialog(f11,"Wrong Password or Admin Name Re Enter ","Warning", JOptionPane.PLAIN_MESSAGE,icon2);
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error",JOptionPane.PLAIN_MESSAGE,icon3);
                }
                l3.setText("NAME :   "+s1);
            }
            else if(s.equals("CLEAR"))
            {
                t1.setText("");
                t2.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                t1.setText("");
                t2.setText("");
                f.setVisible(true);
                f2.setVisible(false);
            }
        }
    }
    public class A3 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("ADD"))
            {
                f3.setVisible(false);
                f4.setVisible(true);
            }
            else if(s.equals("VIEW"))
            {
                f3.setVisible(false);
                f5.setVisible(true);
            }
            else if(s.equals("DELETE"))
            {
                f3.setVisible(false);
                f6.setVisible(true);
            }
            else if(s.equals("GO BACK"))
            {
                t1.setText("");
                t2.setText("");
                f2.setVisible(true);
                f3.setVisible(false);
            }
        }
    }
    public class A4 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("OK"))
            {
                String k1,k2,k3;
                int n1,n2;
                n1 = Integer.parseInt(t3.getText());
                k1=t4.getText();
                k2=t5.getText();
                k3=t6.getText();
                n2=Integer.parseInt(t7.getText());
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    PreparedStatement ps = cc.prepareStatement("insert into bookdetails(Bnumber,Bname,Auname,Puname,Nbooks) values("+n1+",'"+k1+"','"+k2+"','"+k3+"',"+n2+")");
                    ps.executeUpdate();
                    ps.close();
                    cc.close();
                    JOptionPane.showMessageDialog(f11,"BOOK DETAILS ARE INSERTED","Success", JOptionPane.PLAIN_MESSAGE,icon1);
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error",JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                t3.setText("");
                t4.setText("");
                t5.setText("");
                t6.setText("");
                t7.setText("");
                f3.setVisible(true);
                f4.setVisible(false);
            }
        }
    }
    public class A5 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            int n1,n2=0,t;
            String k1="",k2="",k3="";
            if(s.equals("OK"))
            {
                n1=Integer.parseInt(t8.getText());
                boolean c = false;
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("Select * from bookdetails ");
                    while(rs.next())
                    {
                        t=rs.getInt("Bnumber");
                        if(t==n1)
                        {
                            k1=rs.getString("Bname");
                            k2=rs.getString("Auname");
                            k3=rs.getString("Puname");
                            n2=rs.getInt("NBooks");
                            c=true;
                        }
                    }
                    if(c)
                    {
                        JOptionPane.showMessageDialog(f11,"DATA AVAILABLE ","Success",JOptionPane.PLAIN_MESSAGE,icon1);
                        l10.setText("BOOK NO                  : "+Integer.toString(n1));
                        l11.setText("BOOK NAME             : "+k1);
                        l12.setText("AUTHOR NAME        : "+k2);
                        l13.setText("PUBLISHER NAME   :  "+k3);
                        l14.setText("NO OF BOOKS          : "+Integer.toString(n2));
                        f5.add(l10);
                        f5.add(l11);
                        f5.add(l12);
                        f5.add(l13);
                        f5.add(l14);
                    }
                    else
                        JOptionPane.showMessageDialog(f11,"DATA UNAVAILABLE ","Warning", JOptionPane.PLAIN_MESSAGE,icon2);
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t8.setText("");
                l10.setText("");
                l11.setText("");
                l12.setText("");
                l13.setText("");
                l14.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                t8.setText("");
                l10.setText("");
                l11.setText("");
                l12.setText("");
                l13.setText("");
                l14.setText("");
                f3.setVisible(true);
                f5.setVisible(false);
            }
        }
    }
    public class A6 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("OK"))
            {
                boolean c = false;
                int n1=Integer.parseInt(t9.getText());
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("select *  from bookdetails where [Bnumber]= "+n1);
                    while(rs.next())
                    {
                        c=true;
                    }
                    if(c)
                    {
                        JOptionPane.showMessageDialog(f11,l16.getText(),"Success",JOptionPane.PLAIN_MESSAGE,icon1);
                        st.executeUpdate("delete from bookdetails where [Bnumber] = "+n1);
                    }
                    else
                        JOptionPane.showMessageDialog(f11,"SELECTED DATA NOT AVAILABLE","Warning", JOptionPane.PLAIN_MESSAGE,icon2);
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t9.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                f3.setVisible(true);
                t9.setText("");
                f6.setVisible(false);
            }
        }
    }
    public class A7 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("BOOK BORROW"))
            {
                f7.setVisible(false);
                f8.setVisible(true);
            }
            else
            if (s.equals("BOOK RENEWAL"))
            {
                f7.setVisible(false);
                f9.setVisible(true);
            }
            else
            if(s.equals("BOOK RETURN"))
            {
                f7.setVisible(false);
                f10.setVisible(true);
            }
            else
                if(s.equals("BOOK DUE"))
                {
                    f7.setVisible(false);
                    f12.setVisible(true);                
                }
            else if(s.equals("GO BACK"))
            {
                f7.setVisible(false);
                f.setVisible(true);
            }
        }
    }
    public class A8 implements ActionListener
    {
        boolean check(int n1,int n3) 
        {
            boolean g=true;
            try
            {                     
            Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
            Statement st = cc.createStatement();
            ResultSet rs = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n3);
            while(rs.next())
            {
                g=false;
            }
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(g);            
        }
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("SEARCH"))
            {
                int n1 = Integer.parseInt(t10.getText()),n2,n3=Integer.parseInt(t16.getText());
                String k1 = t11.getText(),k2="";
                boolean c =false,c1=false;
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("select *  from bookdetails where [Bnumber]= "+n1);
                    while(rs.next())
                    {
                        n2 = rs.getInt("NBooks");
                        k2= rs.getString("Bname");
                        if(n2>1)
                        {
                            c=check1(k1);
                            c1=check(n1,n3);
                            if(c == true && c1 == true)
                            {
                                PreparedStatement ps = cc.prepareStatement("insert into book_user(Rollno,Bnumber,Bname,BoDte,ReDte,RtDte,Fine) values("+n3+","+n1+",'"+k2+"','"+k1+"','','',"+0+")");
                                ps.executeUpdate();
                                ps.close();
                                PreparedStatement ps1 = cc.prepareStatement("update bookdetails set [NBooks] = [NBooks] -1 where Bnumber = "+n1);
                                ps1.executeUpdate();
                                ps1.close();
                            }
                        }
                    }
                    if(c == true && c1 == true)
                        JOptionPane.showMessageDialog(f11,"BOOK AVAILABLE","Success",JOptionPane.PLAIN_MESSAGE,icon1);
                    else if(c== false && c1== false)
                        JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT BOOK NO OR BOOK NOT AVAILABLE","Warning", JOptionPane.PLAIN_MESSAGE,icon2); 
                    else if(c== false)
                        JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT DATE FOEMAT","Warning", JOptionPane.PLAIN_MESSAGE,icon2); 
                    else if(c1== false)
                        JOptionPane.showMessageDialog(f11,"BOOK ALREADY BORROWED BY THE STUDENT OR BOOK NOT AVAILABLE","Warning", JOptionPane.PLAIN_MESSAGE,icon2);                    
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error",JOptionPane.WARNING_MESSAGE);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t10.setText("");
                t16.setText("");                
                t11.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                f8.setVisible(false);
                t10.setText("");
                t16.setText("");
                t11.setText("");
                f7.setVisible(true);
            }
        }
    }
    public class A9 implements ActionListener
    {
        String check(int n1,int n3)
        {
            String k="";           
            try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n3);
                while(rs1.next())
                {
                    k=rs1.getString("BoDte");
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(k);
        }
        String rene(int n1,int n2)
        {
           String h="";
           try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {
                    if(!rs1.getString("ReDte").equals(""))
                        h=rs1.getString("ReDte");
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(h); 
        }        
        int check2(int n1,int n2,String k1) throws ParseException
        {
            String h=null;
            int n3;
            try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {
                    h=rs1.getString("BoDte");
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            if(h==null)
                return 0;
            else
            {
                try
                {
		SimpleDateFormat fw = new SimpleDateFormat("dd-MM-yyyy");
		Date dt = fw.parse(h);		
		Date dt1 =fw.parse(k1);	
                long dtw =dt.getTime();
		long dtw1 =dt1.getTime();
		long dte = dtw<dtw1 ? dtw1-dtw:0;
                int ld =(int)(dte/(1000*60*60*24))%365;
                if(ld>0)
                    return ld;
                else
                    return 0;
                }
                catch(ParseException ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }           
            return 0;
        }
        float fi(int n1,int n2)
        {
          float h=0;
           try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {                    
                    h=rs1.getFloat("Fine");
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(h); 
        }
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("RENEW"))
            {
                int n1 = Integer.parseInt(t12.getText()),n2=Integer.parseInt(t17.getText()),n3=0;
                String k1 = t13.getText(),k2="",k3="";
                fine=0;
                float n4 =0;
                int dy=0;
                boolean c=false;
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("select *  from bookdetails where [Bnumber]= "+n1);                    
                    while(rs.next())
                    {
                        k2=check(n1,n2);
                        k3=rene(n1,n2);
                        n4=fi(n1,n2);
                        if(!k2.equals("") && k3.equals(""))
                        {
                            c=check1(k1);
                            n3=check2(n1,n2,k1);
                            if(c==true && n3 > 0)
                            {   
                                dy = n3;
                                PreparedStatement ps = cc.prepareStatement("update book_user set [ReDte] = '"+k1+"'  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                ps.executeUpdate();
                                ps.close();
                            }
                        }
                        else
                        {
                            c=check1(k1);                              
                            if(c==true)
                            {   
                                PreparedStatement ps1 = cc.prepareStatement("update book_user set [BoDte] = '"+k3+"'  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                ps1.executeUpdate();
                                ps1.close();
                                PreparedStatement ps2 = cc.prepareStatement("update book_user set [ReDte] = ''  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                ps2.executeUpdate();
                                ps2.close();
                                n3=check2(n1,n2,k1);
                                if(n3>0)
                                {
                                    dy = n3;                                
                                    PreparedStatement ps = cc.prepareStatement("update book_user set [ReDte] = '"+k1+"'  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                    ps.executeUpdate();
                                    ps.close();
                                }
                                else
                                {
                                    PreparedStatement ps = cc.prepareStatement("update book_user set [BoDte] = '"+k2+"'  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                    ps.executeUpdate();
                                    ps.close();
                                    PreparedStatement ps3 = cc.prepareStatement("update book_user set [ReDte] = '"+k3+"'  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                                    ps3.executeUpdate();
                                    ps3.close();
                                }
                            }
                        }   
                        if(dy<14)
                            fine=0;
                        else if(dy<30)
                            fine=(dy-14)*1.5f;
                        else
                            fine=(dy-30)*2.5f+16*1.5f;
                        n4=n4+fine;
                        PreparedStatement ps = cc.prepareStatement("update book_user set [Fine] = "+n4+"  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                        ps.executeUpdate();
                        ps.close();                        
                    }
                    if(c == true && n3 >0)
                    {
                        JOptionPane.showMessageDialog(f11,"BOOK RENEWED","Success",JOptionPane.PLAIN_MESSAGE,icon1);                         
                    }
                    else if(c== false)
                        JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT DATE FORMAT","Warning", JOptionPane.PLAIN_MESSAGE,icon2); 
                    else 
                        JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT DATE OR CORRECT BOOK NUMBER OR CORRECT ROLLNO","Warning", JOptionPane.PLAIN_MESSAGE,icon2); 
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t12.setText("");
                t13.setText("");
                t17.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                f9.setVisible(false);
                t12.setText("");
                t13.setText("");
                t17.setText("");
                f7.setVisible(true);
            }
        }
    }
    public class A10 implements ActionListener
    {
        float fi(int n1,int n2,String k1)
        {
            float fin=0,fine=0,ld=0;            
            String re="",bo="";
            try
            {   
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {                    
                    bo=rs1.getString("BoDte");
                    re=rs1.getString("ReDte");
                    fine=rs1.getFloat("Fine");
                }
                if(re.equals(""))
                    try
                    {
                        SimpleDateFormat fw = new SimpleDateFormat("dd-MM-yyyy");
                        Date dt = fw.parse(bo);		
                        Date dt1 =fw.parse(k1);	
                        long dtw =dt.getTime();
                        long dtw1 =dt1.getTime();
                        long dte = dtw<dtw1 ? dtw1-dtw:0;
                        ld =(int)(dte/(1000*60*60*24))%365;                
                    }
                    catch(ParseException ee)
                    {
                        JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                    }
                else
                    try
                    {
                        SimpleDateFormat fw = new SimpleDateFormat("dd-MM-yyyy");
                        Date dt = fw.parse(re);		
                        Date dt1 =fw.parse(k1);	
                        long dtw =dt.getTime();
                        long dtw1 =dt1.getTime();
                        long dte = dtw<dtw1 ? dtw1-dtw:0;
                        ld =(int)(dte/(1000*60*60*24))%365;
                    }
                    catch(ParseException ee)
                    {
                        JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                    }
                if(ld<14)
                    fin=0;
                else if(ld<30)
                    fin=(ld-14)*1.5f;
                else
                    fin=(ld-30)*2.5f+16*1.5f;
                fine=fine+fin;            
                PreparedStatement ps = cc.prepareStatement("update book_user set [Fine] = "+fine+"  where [Bnumber] ="+n1+" And [Rollno] = "+n2);
                ps.executeUpdate();
                ps.close();
                st.close();
                cc.close();                
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(fine);
        }
        boolean check(int n1,int n2)
        {            
            boolean se=false;
            try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {
                    if(rs1.getString("RtDte").equals(""))                        
                        se=true;
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            return(se);
        }
        int check2(int n1,int n2,String k1) throws ParseException
        {
            String s[] = new String[2];
            int n3,k=0;
            try
            {
                Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                Statement st = cc.createStatement();
                ResultSet rs1 = st.executeQuery("select *  from book_user where [Bnumber]= "+n1+" And [Rollno] = "+n2);
                while(rs1.next())
                {
                    s[0]=rs1.getString("BoDte");
                    s[1]=rs1.getString("ReDte");
                }
                st.close();
                cc.close();
            }
            catch(Exception ee)
            {
                JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
            }
            if(s[0]==null)
                k++;
            else
            {
                try
                {
                    SimpleDateFormat fw = new SimpleDateFormat("dd-MM-yyyy");
                    Date dt = fw.parse(s[0]);		
                    Date dt1 =fw.parse(k1);	
                    long dtw =dt.getTime();
                    long dtw1 =dt1.getTime();
                    long dte = dtw<dtw1 ? dtw1-dtw:0;
                    int ld =(int)(dte/(1000*60*60*24))%365;
                    if(ld>0)
                        k=0;
                    else
                        k++;
                    if(s[1]!=null)
                    {
                        Date dt2 = fw.parse(s[1]);
                        Date dt3 =fw.parse(k1);	
                        long dtwe =dt2.getTime();
                        long dtwr =dt3.getTime();                    
                        long dt1e = dtwe<dtwr ? dtwr-dtwe:0;
                        int ld1 =(int)(dt1e/(1000*60*60*24))%365;
                        if(ld1>0)
                            k=0;
                        else
                            k++;  
                    }
                    else
                        k=0;
                }
                catch(ParseException ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }           
            return k;
        }
        public void actionPerformed(ActionEvent ae)
        {
            String s = ae.getActionCommand();
            if(s.equals("RETURN"))
            {
                int n1 = Integer.parseInt(t14.getText()),n2=Integer.parseInt(t18.getText()),n3=0;
                String k1 = t15.getText(),k2="";
                boolean c =false,h=false,fw=false;
                try
                {
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("select *  from bookdetails where [Bnumber]= "+n1);                    
                    while(rs.next())
                    {
                        fw=true;
                        h=check(n1,n2);
                        if(h)
                        {
                            c=check1(k1);
                            n3=check2(n1,n2,k1);
                            if(c == true && n3 == 0)
                            {
                                PreparedStatement ps = cc.prepareStatement("update book_user set [RtDte] = '"+k1+"' where [Bnumber] = "+n1+" And [Rollno] = "+n2);
                                ps.executeUpdate();
                                ps.close();
                                PreparedStatement ps1 = cc.prepareStatement("update bookdetails set [NBooks] = [NBooks] +1 where Bnumber = "+n1);   
                                ps1.executeUpdate();
                                ps1.close();
                            }
                        }
                    }
                    if(c == true && n3 == 0)
                    {
                        JOptionPane.showMessageDialog(f11,"BOOK RETURNED","Success", JOptionPane.PLAIN_MESSAGE,icon1);
                        float n = fi(n1,n2,k1),fig=0;
                        boolean c3=true;
                        ResultSet rs1 = st.executeQuery("select *  from book_returned where [Bnumber] = "+n1+" And [Rollno] = "+n2);
                        while(rs1.next())
                        {         
                            fig=rs1.getFloat("Fine");                            
                            c3=false;
                            n=n+fig;   
                            PreparedStatement ps = cc.prepareStatement("update book_returned set [Fine] = "+n+" where [Bnumber] = "+n1+" And [Rollno] = "+n2);
                            ps.executeUpdate();
                            ps.close();
                            st.executeUpdate("delete from book_user where [Bnumber] = "+n1+" And [Rollno] = "+n2);                                                                                                                    
                        }                        
                        if(c3)
                        {
                            PreparedStatement ps = cc.prepareStatement("insert into book_returned(Rollno,Bnumber,Fine) values("+n2+","+n1+","+n+")");
                            ps.executeUpdate();
                            ps.close();
                            st.executeUpdate("delete from book_user where [Bnumber] = "+n1+" And [Rollno] = "+n2);
                        }
                    }
                    else     
                        if(fw==false)
                            JOptionPane.showMessageDialog(f11,"BOOK IS NOT AVAILABLE IN BOOKDETAILS SECTION TELL THE ADMIN TO CHECK","Warning", JOptionPane.PLAIN_MESSAGE,icon2);
                        else if(h==false)
                            JOptionPane.showMessageDialog(f11,"BOOK ALREADY RETURNED","Warning", JOptionPane.PLAIN_MESSAGE,icon2);                        
                        else if(c==false)
                                JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT DATE FORMAT ","Warning", JOptionPane.PLAIN_MESSAGE,icon2);                    
                            else
                                JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT DATE OR ROLLNO","Warning", JOptionPane.PLAIN_MESSAGE,icon2);
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t14.setText("");
                t15.setText("");
                t18.setText("");
            }
            else if(s.equals("GO BACK"))
            {
                f10.setVisible(false);
                t14.setText("");
                t18.setText("");
                t15.setText("");
                f7.setVisible(true);
            }
        }
    }
    public  class A11 implements ActionListener
    {
        public void actionPerformed(ActionEvent ae)
        {
            int j=0,i;
            float tf=0;
            String s = ae.getActionCommand();   
            boolean c=false;
            if(s.equals("OK"))
            {
                int n1 =Integer.parseInt(t19.getText());
                String data[] = new String[300];                
                j=0;
                try
                {                                  
                    Connection cc = DriverManager.getConnection("jdbc:ucanaccess://C:\\Users\\ADMIN\\Desktop\\setup\\bin\\Lib.accdb");
                    Statement st = cc.createStatement();
                    ResultSet rs = st.executeQuery("select *  from book_returned where [Rollno]= "+n1);                    
                    while(rs.next())
                    {                        
                        c=true;
                        data[j]=Integer.toString(rs.getInt("Rollno"));j++;
                        data[j]=Integer.toString(rs.getInt("Bnumber"));j++;
                        data[j]=Float.toString(rs.getFloat("Fine"));j++;
                        tf=tf+rs.getFloat("Fine");
                    }      
                    fw1 = new JTextField[j];
                    if(c)
                    {                        
                        String column[] ={"ROLLNO","BOOKNO","FINE"};                    
                        int g=20,h=0;
                        for(i=0;i<3;i++)
                        {
                            fw[i]= new JTextField();
                            fw[i].setText(column[i]);
                            fw[i].setBounds(80*(i+1),120,80,20);
                            f12.add(fw[i]);
                            fw[i].setEditable(false);
                            fw[i].setBackground(Color.red);                           
                            fw[i].setForeground(Color.white);
                        }
                        for(i=0;i<fw1.length;i++)
                        {
                            fw1[i]= new JTextField("");
                            fw1[i].setText(data[i]);
                            fw1[i].setBounds(80*(h+1),120+g,80,20);
                            f12.add(fw1[i]);
                            fw1[i].setEditable(false);
                            fw1[i].setBackground(Color.green);                                                    
                            h++;
                            if((i+1)%3==0)        
                            {
                                h=0;
                                g=g+20;
                            }                            
                        }
                        JOptionPane.showMessageDialog(f11,"TOTAL FINE TO PAY = "+Float.toString(tf),"Success", JOptionPane.PLAIN_MESSAGE,icon1);
                    }            
                    else                    
                        JOptionPane.showMessageDialog(f11,"ENTER THE CORRECT ROLLNO OR BOOK NOT RETURNED ","Warning", JOptionPane.PLAIN_MESSAGE,icon2);                                            
                    st.close();
                    cc.close();
                }
                catch(Exception ee)
                {
                    JOptionPane.showMessageDialog(f11,ee,"Error", JOptionPane.PLAIN_MESSAGE,icon3);
                }
            }
            else if(s.equals("CLEAR"))
            {
                t19.setText("");
                if(c==false)
                for(i=0;i<fw1.length;i++)                                    
                    fw1[i].setText("");               
            }
            else if(s.equals("GO BACK"))
            {
                f12.setVisible(false);                
                f7.setVisible(true);
                if(c==false)
                for(i=0;i<fw1.length;i++)                                    
                    fw1[i].setText("");
                t19.setText("");
            }
        }
    }            
    public static void main(String a[])
    {
        new lib();
    }
}