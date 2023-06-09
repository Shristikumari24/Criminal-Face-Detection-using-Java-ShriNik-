package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.imageio.*;
import java.sql.ResultSet;

class MainPage extends JFrame implements ActionListener {
    JFrame f;
    JLabel l;
    Box box;
    JButton b1,b2,b3,b4;
    MainPage() {
        //      Main Page
        f = new JFrame("Main Page");
        f.setSize(1000,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);

        l = new JLabel("Welcome");
        l.setFont(new Font("Algerian",Font.ITALIC,40));
        l.setBounds(100,60,250,50);
        l.setLocation(360,52);

//        ImageIcon icon = new ImageIcon("C://Users//Sandeep K Yadav//Pictures//Saved Pictures//profile.jpg");
//            b3.setIcon(new ImageIcon(getIconImage());

        b1 = new JButton("Home");
        b2 = new JButton("About us");
        b3 = new JButton("Profile");
        b4 = new JButton("Help");

        b1.setBounds(100,60,130,50);
        b1.setLocation(280,200);
        b2.setBounds(100,60,130,50);
        b2.setLocation(500,200);
        b3.setBounds(100,60,130,50);
        b3.setLocation(280,300);
        b4.setBounds(100,60,130,50);
        b4.setLocation(500,300);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        f.add(l); f.add(b1);f.add(b2);f.add(b3);f.add(b4);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1){
            new HomePage();
//            System.out.println("Home Page");
            this.setVisible(false);
        }
        else if (e.getSource()==b2){
//            new About_us();
            System.out.println("About us");
            this.setVisible(false);
        }
        else if (e.getSource()==b3) {
//            System.out.println("Profile");
            new Profile();
            setVisible(false);
        }
        else if (e.getSource()==b4) {
            System.out.println("Help");
        }

}

    public static void main(String[] args) {
        new MainPage();
    }
}