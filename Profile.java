package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Profile extends JFrame implements ActionListener{
    JFrame f,f1;
    JTextField t1,t2;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14;
    JButton b;
    Profile(){
        f = new JFrame("Profile");
        f.setSize(400,350);
        f.setDefaultCloseOperation(EXIT_ON_CLOSE);
        f.getContentPane().setBackground(Color.lightGray);

        l = new JLabel("User_Id :");
        l.setBounds(30,50,150,40);
        l.setFont(new Font("timeNewRoman", Font.PLAIN,25));
        l12 = new JLabel("Image_Id :");
        l12.setBounds(30, 100, 120, 30);
        l12.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
//        l.setLocation(100,0);
        t1 = new JTextField();
        t1.setBounds(150,50,150,30);
        t2 = new JTextField();
        t2.setBounds(150,100,150,30);
        b = new JButton("Click here");
        b.setBounds(120,160,130,50);
        b.addActionListener(this);
        f.add(l);f.add(t1);f.add(t2);f.add(b);f.add(l12);
        f.setLayout(null);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e) {
        String s = t1.getText();
        if (e.getSource() == b) {
            String[] x = {"First_Name", "Last_Name", "Mobile_no", "Email_Id", "Gender", "User_Id"};
            String[][] y = new String[2][6];
            int i = 0;
            int j = 0;
            f1 = new JFrame("Profile");
            f1.setSize(1000, 600);
            f1.setDefaultCloseOperation(EXIT_ON_CLOSE);

            l1 = new JLabel("Name :");
            l1.setBounds(50, 100, 100, 30);
            l1.setFont(new Font("TimeNewRoman", Font.ITALIC, 25));
            l2 = new JLabel("Mobile No :");
            l2.setBounds(50, 150, 150, 30);
            l2.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l3 = new JLabel("Email_Id :");
            l3.setBounds(50, 200, 120, 30);
            l3.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l4 = new JLabel("Gender :");
            l4.setBounds(50, 250, 100, 30);
            l4.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l5 = new JLabel("User_Id :");
            l5.setBounds(50, 300, 120, 30);
            l5.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l6 = new JLabel();
            l6.setBounds(180, 100, 350, 30);
            l6.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l7 = new JLabel();
            l7.setBounds(180, 150, 150, 30);
            l7.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l8 = new JLabel();
            l8.setBounds(180, 200, 350, 30);
            l8.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l9 = new JLabel();
            l9.setBounds(180, 250, 150, 30);
            l9.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l10 = new JLabel();
            l10.setBounds(180, 300, 150, 30);
            l10.setFont(new Font("TimeNewRoman", Font.PLAIN, 25));
            l11 = new JLabel();
            l11.setBounds(600, 100, 300, 300);

            l13 = new JLabel();
            l13.setBounds(500, 30, 490, 40);
            l13.setFont(new Font("Algerian", Font.ITALIC, 35));
            l14 = new JLabel();
            l14.setBounds(250, 30, 250, 40);
            l14.setFont(new Font("Algerian", Font.ITALIC, 35));
            f1.add(l1);f1.add(l2);f1.add(l3);f1.add(l4);f1.add(l5);f1.add(l6);f1.add(l7);f1.add(l8);f1.add(l9);f1.add(l10);f1.add(l11);f1.add(l13);f1.add(l14);

            try {
                ConnectSQL obj = new ConnectSQL();
                String q = " select First_Name,Last_Name,Mobile_no,Email_Id,Gender,User_Id from registration where User_Id = '" + t1.getText() + "'";
                ResultSet rest = obj.stm.executeQuery(q);
                if (rest.next()) {
//                  String la = rest.getString("First_Name");
                    l6.setText(rest.getString("First_Name") +" "+ rest.getString("Last_Name"));
                    l7.setText(rest.getString("Mobile_no"));
                    l8.setText(rest.getString("Email_Id"));
                    l9.setText(rest.getString("Gender"));
                    if(rest.getString("Gender").equals("Male")){
                        l14.setText("Welcome Mr.");
                    }else{
                        l14.setText("Welcome Mrs.");
                    }
                    l10.setText(rest.getString("User_Id"));
                    l13.setText(rest.getString("First_Name") +" "+ rest.getString("Last_Name")+" !!!");

//                    System.out.println("Name : " + rest.getString("First_Name"));
//                    y[i][j++] = rest.getString("First_Name");
//                    y[i][j++] = rest.getString("Last_Name");
//                    y[i][j++] = rest.getString("Mobile_no");
//                    y[i][j++] = rest.getString("Email_Id");
//                    y[i][j++] = rest.getString("Gender");
//                    y[i][j++] = rest.getString("User_Id");
//                y[i][j++] = rest.getString("Password");
//                    i++;
//                    j = 0;
//                    t1 = new JTable(y, x);
//                    t1.setBounds(100, 60, 400, 200);

                } else {
                    JOptionPane.showMessageDialog(null, "Invalid User_Id , Enter the correct information ");
                }

                ConnectSQL obj1 = new ConnectSQL();
                ResultSet re = obj1.stm.executeQuery("select * from image where id = '"+t2.getText()+"' ");
                if(re.next()){
                    byte[] img = re.getBytes("img");
                    ImageIcon image = new ImageIcon(img);
                    Image im = image.getImage();
                    Image myImg = im.getScaledInstance(l11.getWidth(),l11.getHeight(),Image.SCALE_SMOOTH);
                    ImageIcon ic = new ImageIcon(myImg);
                    l11.setIcon(ic);
                }
                else {
                    JOptionPane.showMessageDialog(null,"No Data Found");
                }

            } catch (SQLException e1) {
                e1.printStackTrace();
            }
//            JScrollPane sp = new JScrollPane(t1);
//            f1.add(sp);

            f1.setLayout(null);
            f1.setLocationRelativeTo(null);
            f1.setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Profile();
    }
}