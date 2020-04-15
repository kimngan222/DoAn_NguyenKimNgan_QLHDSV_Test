package UTILS;



 
import java.sql.*;
 
public class test {
	
	public Connection getConnect() {
		Connection con = null;
		String url = "jdbc:mysql://localhost:3306/sinhvien";
		String user = "root";
		String password = "";
		try {
                    //Đăng kí Driver
			Class.forName("com.mysql.jdbc.Driver");
                        //Thiết lập connect
			con = DriverManager.getConnection(url, user, password);
		} catch (Exception er) {
			er.printStackTrace();
		}
		return con;
	}

    public PreparedStatement PreparedStatement(String string) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}