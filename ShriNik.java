package ShriNik;

import java.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ShriNik extends JFrame implements ActionListener {
    JFrame f;
    JButton b1,b2;
    JLabel l,l1;
    ShriNik() {
        //      Main Page
        f = new JFrame("ShriNik");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);
        f.setSize(1000, 600);

        b1 = new JButton("Login");
        b2 = new JButton("Register");
        l = new JLabel("ShriNik");
        l1 = new JLabel("OR");

        l.setBounds(100,50,250,50);
        l.setFont(new Font("Algerian",Font.ITALIC,40));
        l.setLocation(380,52);

        l1.setBounds(100,50,250,50);
        l1.setFont(new Font("TimeNewRoman",Font.ITALIC,25));
        l1.setLocation(433,200);

        b1.setBounds(100, 60, 130, 50);
        b2.setBounds(100, 60, 130, 50);
        b1.setLocation(280, 200);
        b2.setLocation(500, 200);

        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(b1);
        f.add(b2);
        f.add(l);
        f.add(l1);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==b1){
            new LoginPage();
            this.setVisible(true);
           this.setVisible(false);
        }
        if(e.getSource()==b2){
            new RegisterPage();
            this.setVisible(false);
        }
    }
    public static void main(String[] args) {
       new ShriNik();
    }
}