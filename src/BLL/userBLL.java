/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;


import DAL.*;
import DTO.*;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class userBLL {
     userDAL userDal = new userDAL(); 
	ResultSet result;
	
	public ResultSet LoginUser(userDTO user) throws SQLException, NullPointerException{
		result = userDal.LoginUser(user);
		return result;
	}

}
