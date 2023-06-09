package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HomePage extends  JFrame implements ActionListener {
        JFrame f;
        Font f1;
        JLabel l;
    HomePage(){
        f = new JFrame("HomePage");
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setBackground(Color.lightGray);
        f.setSize(1000,600);

        l = new JLabel("ShriNik");
        l.setFont(new Font("Algerian",Font.ITALIC,43));
        l.setBounds(100,60,200,60);
        l.setLocation(350,25);

        f1 = new Font("TimeNewRoman", Font.ROMAN_BASELINE,22);

        JMenuBar mb = new JMenuBar();
        mb.setBackground(Color.green);

        JMenu m1 = new JMenu("View");
        JMenuItem mi1 = new JMenuItem("View Criminal Data");
        JMenuItem mi4 = new JMenuItem("Delete Criminal Data");

        JMenu m2 = new JMenu("Insert");
        JMenuItem mi2 = new JMenuItem("Insert Criminal Data");

        JMenu m3 = new JMenu("Modify");
        JMenuItem mi3 = new JMenuItem("Modify Criminal Data");

        m1.add(mi1);m1.add(mi4);
        m2.add(mi2);
        m3.add(mi3);

        mb.add(m1);
        mb.add(m2);
        mb.add(m3);

        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        m1.setFont(f1); m2.setFont(f1); m3.setFont(f1); mi1.setFont(f1); mi2.setFont(f1); mi3.setFont(f1); mi4.setFont(f1);
        f.add(l);
        f.setJMenuBar(mb);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
            String cmd = e.getActionCommand();
            if (cmd.equals("View Criminal Data")){
                System.out.println("View Criminal Data");
            }
        if (cmd.equals("Insert Criminal Data")){
                new Insert_Criminal_Data();
        }
        if (cmd.equals("Modify Criminal Data")){
            System.out.println("Modified Criminal Data");
        }
        if (cmd.equals("Delete Criminal Data")){
            System.out.println("Deleted Criminal Data");
        }
    }
    public static void main(String[] args) {
        new HomePage();
    }
}
