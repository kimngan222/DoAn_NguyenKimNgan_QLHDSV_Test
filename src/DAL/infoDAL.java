/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAL;

import UTILS.test;
import java.sql.*;
import DTO.*;

public class infoDAL {
        test con = new test();
	Connection conn = con.getConnect();;
	PreparedStatement pr;
	//ResultSet resultSet;
    public int insertUser(infoDTO info) throws SQLException, NullPointerException{
                Statement stmt = conn.createStatement();
		//thực hiện insert dữ liệu vào bảng users
		int result = 0;
		pr=conn.prepareStatement("INSERT INTO thongtin (id, ten, sex) VALUES(?, ?, ?)");
		pr.setString(1,info.getInfoID());
		pr.setString(2,info.getInfoName());
		pr.setString(3,info.getInfoSex());
		//…
		result=pr.executeUpdate();
		return result;
	}

}
