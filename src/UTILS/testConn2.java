
package UTILS;

import java.sql.*;



public class testConn2 {
    public static void main(String args[]) {
        try {
            test con = new test();
            Connection conn = con.getConnect();
            Statement stmt = conn.createStatement();
            // get data from table 'thongtin'
            ResultSet rs = stmt.executeQuery("select * from thongtin");
            // show data gồm 2 cột
            while (rs.next()) {
                System.out.println(rs.getInt(1) + "\t" + rs.getString(2) +"\t"+rs.getString(3));
            }
            // close connection
            conn.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
