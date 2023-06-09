package ShriNik;

import java.sql.*;
public class ConnectSQL {
    Connection con;
    Statement stm;
    ConnectSQL(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/ShriNik","root","********");
            stm = con.createStatement();
        }
        catch (Exception e){
            e.printStackTrace();
        }

    }
    public static void main(String[] args) {
        new ConnectSQL();
    }
}