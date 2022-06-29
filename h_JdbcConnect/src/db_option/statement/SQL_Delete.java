package db_option.statement;

import db_option.JDBC_Util;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kinoz
 * @Date 2022/6/29 - 16:11
 * @apiNote
 */
public class SQL_Delete {
    public static void main(String[] args) throws Exception {
        Connection con = JDBC_Util.getConnection();
        Statement sta = con.createStatement();

        String sql = "delete from jdbcstudy.users where name='Âíæ¤'";
        int i = sta.executeUpdate(sql);
        if (i>0){
            System.out.println("É¾³ý³É¹¦");
        }

        JDBC_Util.CloseConnection(con,sta,null);
    }
}
