package db_option.apaches;

import db_option.DBCP_Util;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author kinoz
 * @Date 2022/6/29 - 22:17
 * @apiNote 通过DBCP创建数据库连接
 */
public class Drop_select {
    @Test
    public void WithPrepared() throws Exception{
        Connection con = DBCP_Util.getConnection();
        String sql = "select * from jdbcstudy.users";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        while (rst.next()){
            System.out.println(rst.getObject("NAME"));
        }

        DBCP_Util.CloseConnection(con,pst,rst);

    }
    @Test
    public void JustStatement() throws Exception{
        Connection con = DBCP_Util.getConnection();

        Statement sta = con.createStatement();

        String sql = "select * from jdbcstudy.users";

        ResultSet rst = sta.executeQuery(sql);

        while (rst.next()){
            System.out.println(rst.getObject("NAME"));
        }


        DBCP_Util.CloseConnection(con,sta,rst);
    }
}
