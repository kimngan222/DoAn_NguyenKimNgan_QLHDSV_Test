/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BLL;

import DAL.*;
import DTO.*;
import java.sql.SQLException;

/**
 *
 * @author dell
 */
public class infoBLL {
    infoDAL testDal = new infoDAL();
        int result;
	public int insertUser(infoDTO info) throws SQLException,NullPointerException{
		result = testDal.insertUser(info);
		return result;
	}

}
