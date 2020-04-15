/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import DTO.*;
import UTILS.test;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author dell
 */
public class userDAL {
        test con = new test();
	Connection conn = con.getConnect();;
	PreparedStatement pr;
	ResultSet resultSet;
    public ResultSet LoginUser(userDTO user) throws SQLException, NullPointerException {
                Statement stmt = conn.createStatement();
		//thực hiện insert dữ liệu vào bảng users
		//int result = 0;
		pr=conn.prepareStatement("select * from usersv where Name =? and pass=?");
		pr.setString(1,user.getUser());
		pr.setString(2,user.getPass());
		
		//…
		resultSet=pr.executeQuery();
		return resultSet;
	}

}
