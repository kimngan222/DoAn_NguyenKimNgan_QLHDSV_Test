
package UTILS;

import java.sql.*;



public class userSV {
    public static void main(String args[]) {
        try {
            test con = new test();
            Connection conn = con.getConnect();
            Statement stmt = conn.createStatement();
            // get data from table 'thongtin'
            ResultSet rs = stmt.executeQuery("select * from userSV");
            // show data gồm 2 cột
            while (rs.next()) {
                System.out.println(rs.getString(1) + "\t\t" + rs.getString(2));
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
