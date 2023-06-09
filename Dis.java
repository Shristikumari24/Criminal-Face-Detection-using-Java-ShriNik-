package ShriNik;

import javax.swing.*;
import java.io.File;
import java.io.FileInputStream;
import java.sql.*;

public class Dis {
    Dis(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/ShriNik","root","Shristy@123");
            String q = "insert into image values(?,?)";
            PreparedStatement ps=con.prepareStatement(q);

            JFileChooser fileChooser = new JFileChooser("C://Users//shris//OneDrive//Pictures//Saved Pictures");
            fileChooser.showOpenDialog(null);
            File file = fileChooser.getSelectedFile();
            FileInputStream fin=new FileInputStream(file);
            ps.setInt(1,3);
            ps.setBinaryStream(2,fin,fin.available());
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null,"Image Added Successfully");
        }catch (Exception e) {e.printStackTrace();}
    }

    public static void main(String[] args) {
            new Dis();
    }
}
