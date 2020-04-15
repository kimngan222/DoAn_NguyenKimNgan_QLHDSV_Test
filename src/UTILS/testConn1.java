
package UTILS;

import java.sql.Connection;


public class testConn1 {
                public static void main(String[] args) {
		//Test connect
                test con = new test();
		Connection conn = con.getConnect();
		System.out.println(conn);
	}
}
