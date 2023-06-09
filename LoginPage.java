package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class LoginPage extends JFrame implements ActionListener  {
    JFrame f;
    JLabel ls,l,l1,l2;
    JTextField t1;
    JButton b1;
    JPasswordField t2;
    LoginPage(){

        f = new JFrame("Login Page");

        ls = new JLabel("ShriNik");
        ls.setBounds(100,50,250,50);
        ls.setFont(new Font("Algerian",Font.ITALIC,40));
        ls.setLocation(380,10);

        l = new JLabel("You are in Login page ");
        l.setBounds(100,50,250,50);
        l.setFont(new Font("TimeNewRoman",Font.ITALIC,22));
        l.setLocation(350,50);
        f.add(l);

        b1 = new JButton("Login");
        b1.setBounds(100,60,130,50);
        b1.setLocation(350,300);
        f.add(b1);
        b1.addActionListener(this);

        t1 = new JTextField();
        t1.setBounds(180,150,150,25);
        t2 = new JPasswordField();
        t2.setBounds(180,200,150,25);
        l1=new JLabel("User Id : ");
        l1.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        l1.setBounds(50,150, 100,30);
        l2=new JLabel("Password : ");
        l2.setBounds(50,200, 120,20);
        l2.setFont(new Font("TimeNewRoman",Font.BOLD,20));
        f.add(ls);f.add(l1); f.add(l2);f.add(t1);f.add(t2);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
         String userName = t1.getText();
        String passWord = t2.getText();
        if (e.getSource() == b1) {
            try {
                    ConnectSQL obj = new ConnectSQL();
                    String s = "select User_Id,Password from registration where User_Id='"+userName+"' and Password = '"+passWord+"' ";
                ResultSet resultSet = obj.stm.executeQuery(s);
                if(resultSet.next()){
                    JOptionPane.showMessageDialog(null,"Login Successfully");
                    new MainPage();
                    this.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(null,"Invalid User Id OR Password");
                    this.setVisible(true);
                }
            } catch (Exception e1) {
                e1.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new LoginPage();
    }
}
