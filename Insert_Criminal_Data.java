package ShriNik;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;


public class Insert_Criminal_Data extends JScrollPane implements ActionListener
{
    public String []dates
            = { "1", "2", "3", "4", "5",
            "6", "7", "8", "9", "10",
            "11", "12", "13", "14", "15",
            "16", "17", "18", "19", "20",
            "21", "22", "23", "24", "25",
            "26", "27", "28", "29", "30",
            "31" };
    public String []months
            = { "Jan", "Feb", "Mar", "Apr",
            "May", "Jun", "July", "Aug",
            "Sep", "Oct", "Nov", "Dec" };
    public String []years
            = { "1971","1972","1973","1974","1975","1976","1977","1978","1979","1980",
            "1981","1982","1983","1984","1985","1986","1987","1988","1989","1990",
            "1991","1992","1993","1994", "1995", "1996", "1997", "1998", "1999", "2000",
            "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
            "2011", "2012" };
    public String []year
            = { "1995", "1996", "1997", "1998", "1999", "2000",
            "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010",
            "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019","2020","2021","2022","2023"};
    public String [] ar = {"Arrested","Not Arrested"};
    public String []CrimeName = {"Accident","Assault","Assassination","Blackmail","Corruption","CyberCrime",
            "Fraud","Hijacking","Kidnapping","Murder","Robbery","Serial Killer","Smuggling","Suicide",
            "Theft","Terrorism","Try to Murder","Vandalism"};
    JFrame f,f1;
    Font font;
    JLabel l,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
    JTextField t1,t2,t4,t7,t8,t11,t13,t14,t15;
    JTextArea t6,t16,ta;
    JRadioButton r1,r2;
    ButtonGroup bg;
    JComboBox d,m,y,arrest,doa,moa,yoa,crime;
    JButton b,b1,b2;

    Insert_Criminal_Data(){
        f = new JFrame("Criminal Information");
        f.setSize(1000,750);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        font = new Font("TimeNewRoman", Font.PLAIN,22);

        l = new JLabel("Criminal Information");
        l.setBounds(300,25,400,50);
        l.setFont(new Font("Algerian",Font.PLAIN,35));
        l.setBackground(Color.green);
        l1 = new JLabel("First Name :");
        l1.setBounds(50,100,130,30);
        l1.setFont(font);
        l2 = new JLabel("Last Name :");
        l2.setBounds(50,150,130,30);
        l2.setFont(font);
        l3 = new JLabel("Gender :");
        l3.setBounds(50,200,120,30);
        l3.setFont(font);
        l4 = new JLabel("Age :");
        l4.setBounds(50,250,120,30);
        l4.setFont(font);
        l5 = new JLabel("D.O.B :");
        l5.setBounds(50,300,100,30);
        l5.setFont(font);
        l6 = new JLabel("Criminal Add:");
        l6.setBounds(50,350,200,30);
        l6.setFont(font);
        l7 = new JLabel("Criminal City :");
        l7.setBounds(50,450,180,30);
        l7.setFont(font);
        l8 = new JLabel("Criminal State :");
        l8.setBounds(50,500,180,30);
        l8.setFont(font);
        l9 = new JLabel("Arrest:");
        l9.setBounds(50,550,120,30);
        l9.setFont(font);
        l10 = new JLabel(" Date of Arrest:");
        l10.setBounds(45,600,200,30);
        l10.setFont(font);

        l11 = new JLabel("Complain Id:");
        l11.setBounds(470,100,200,30);
        l11.setFont(font);
        l12 = new JLabel("Crime Involved In:");
        l12.setBounds(470,150,200,30);
        l12.setFont(font);
        l13 = new JLabel("Upload Image :");
        l13.setBounds(470,200,200,30);
        l13.setFont(font);
        l14 = new JLabel("Image Id :");
        l14.setBounds(470,250,200,30);
        l14.setFont(font);
        l15 = new JLabel("Eyewitness Name:");
        l15.setBounds(470,300,220,30);
        l15.setFont(font);
        l16 = new JLabel("Eyewitness Add:");
        l16.setBounds(470,350,200,30);
        l16.setFont(font);

        t1 = new JTextField();
        t1.setBounds(200,100,170,30);
        t1.setFont(font);
        t2 = new JTextField();
        t2.setBounds(200,150,170,30);
        t2.setFont(font);

        r1 = new JRadioButton("Male");
        r1.setBounds(200,200,70,40);
        r1.setSelected(true);
        r1.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        r2 = new JRadioButton("Female");
        r2.setBounds(280,200,100,40);
        r2.setSelected(false);
        r2.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        bg = new ButtonGroup();
        bg.add(r1);bg.add(r2);

        t4 = new JTextField();
        t4.setBounds(200,250,170,30);
        t4.setFont(font);

        d = new JComboBox(dates);
        d.setBounds(200,300,50,30);
        d.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        m = new JComboBox(months);
        m.setBounds(250,300,70,30);
        m.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        y = new JComboBox(years);
        y.setBounds(330,300,80,30);
        y.setFont(new Font("TimeNewRoman", Font.PLAIN,18));

        t6 = new JTextArea();
        t6.setBounds(200,350,200,75);
        t6.setFont(new Font("TimeNewRoman", Font.PLAIN,20));
        t6.setLineWrap(true);
        t7 = new JTextField();
        t7.setBounds(220,450,170,30);
        t7.setFont(font);
        t8 = new JTextField();
        t8.setBounds(220,500,170,30);
        t8.setFont(font);

        arrest = new JComboBox(ar);
        arrest.setBounds(180,550,150,30);
        arrest.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        doa = new JComboBox(dates);
        doa.setBounds(210,600,50,30);
        doa.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        moa = new JComboBox(months);
        moa.setBounds(260,600,70,30);
        moa.setFont(new Font("TimeNewRoman", Font.PLAIN,18));
        yoa = new JComboBox(year);
        yoa.setBounds(340,600,80,30);
        yoa.setFont(new Font("TimeNewRoman", Font.PLAIN,18));

        t11 = new JTextField();
        t11.setBounds(650,100,170,30);
        t11.setFont(font);
        crime = new JComboBox(CrimeName);
        crime.setBounds(670,150,220,30);
        crime.setFont(new Font("TimeNewRoman", Font.PLAIN,18));

        t13 = new JTextField();
        t13.setBounds(650,200,190,30);
        t13.setFont(new Font("TimeNewRoman", Font.PLAIN,15));
        t14 = new JTextField();
        t14.setBounds(650,250,170,30);
        t14.setFont(font);
        t15 = new JTextField();
        t15.setBounds(670,300,170,30);
        t15.setFont(font);
        t16 = new JTextArea();
        t16.setBounds(650,350,200,75);
        t16.setFont(new Font("TimeNewRoman", Font.PLAIN,20));
        t16.setLineWrap(true);
        b = new JButton("Browser");
        b.setBounds(845,200,120,30);
        b1 = new JButton("Submit");
        b1.setBounds(350,650,120,45);
        b2 = new JButton("Clear");
        b2.setBounds(600,650,120,45);
        b.addActionListener(this);
        b1.addActionListener(this);
        b2.addActionListener(this);

        f.add(l);f.add(l1);f.add(l2);f.add(l3);f.add(l4);f.add(l5);f.add(l6);f.add(l7);f.add(l8);f.add(l9);f.add(l10);f.add(l11);f.add(l12);f.add(l13);f.add(l14);f.add(l15);f.add(l16);
        f.add(t1);f.add(t2);f.add(r1);f.add(r2);f.add(t4);f.add(d);f.add(m);f.add(y);f.add(t6);f.add(t7);f.add(t8);f.add(arrest);f.add(doa);f.add(moa);f.add(yoa);f.add(t11);f.add(crime);f.add(t13);f.add(t14);f.add(t15);f.add(t16);
        f.add(b);f.add(b1);f.add(b2);
        f.setLocationRelativeTo(null);
        f.setLayout(null);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.showDialog(null,"Select");
            File file = fileChooser.getSelectedFile();
            String fileName = file.getAbsolutePath();
            t13.setText(fileName);
        }
        else if(e.getSource()==b1){
            f1 = new JFrame("Criminal Information");
            f1.setSize(450,500);
            ta = new JTextArea();
            ta.setSize(400,450);
            ta.setLocation(20,10);
            ta.setLineWrap(true);
            ta.setFont(new Font("TimeNewRoman",Font.PLAIN,20));
            String data2;
            String data1 = "Name :- "+t1.getText()+" " + t2.getText() + "\n" ;
            if(r1.isSelected()){
                data2 = "Gender :- Male" + "\n";
            }
            else{
                data2 = "Gender :- Female" + "\n";
            }
            String data3 = "Age :- " + t4.getText() + "\n" + "D.O.B :- " + (String)d.getSelectedItem() + "/" + (String)m.getSelectedItem() + "/" + (String)y.getSelectedItem() + "\n"
                    + "Add :- " + t6.getText() +"\n"+ "Criminal City:- " + t7.getText() + "\n" + "Criminal State :- " + t8.getText() + "\n" + "Arrest :- " + (String)arrest.getSelectedItem() + "\n"
                    + "Date Of Arrest :- " + (String)doa.getSelectedItem() + "/" + (String)moa.getSelectedItem() + "/" + (String)yoa.getSelectedItem() + "\n" + "Complain Id :- " + t11.getText()
                    + "\n" + "Crime Involved In :- " + (String)crime.getSelectedItem() + "\n" + "Image Id :- " + t14.getText() + "\n" + "Eyewitness Name :- " + t15.getText() + "\n"
                    + "Eyewitness Add :- " + t16.getText();
            ta.setEditable(false);
            ta.setText(data1+data2+data3);
            ta.setEditable(false);
            f1.add(ta);
            f1.setLayout(null);
            f1.setLocationRelativeTo(null);
            f1.setVisible(true);
        }
        else if (e.getSource()==b2) {
            String cl = "";
            t1.setText(cl);
            t2.setText(cl);
            t4.setText(cl);
            d.setSelectedIndex(0);
            m.setSelectedIndex(0);
            y.setSelectedIndex(0);
            t6.setText(cl);
            t7.setText(cl);
            t8.setText(cl);
            arrest.setSelectedIndex(0);
            doa.setSelectedIndex(0);
            moa.setSelectedIndex(0);
            yoa.setSelectedIndex(0);
            t11.setText(cl);
            crime.setSelectedIndex(0);
            t13.setText(cl);
            t14.setText(cl);
            t15.setText(cl);
            t16.setText(cl);
        }
    }
    public static void main(String[] args) {
        new Insert_Criminal_Data();
    }
}