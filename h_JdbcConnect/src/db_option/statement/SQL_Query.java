package db_option.statement;

import db_option.JDBC_Util;
import jdk.jfr.StackTrace;
import org.junit.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * @author kinoz
 * @Date 2022/6/29 - 16:19
 * @apiNote
 */
public class SQL_Query {
    public static void main(String[] args) throws Exception {
        Connection con = JDBC_Util.getConnection();
        Statement statement = con.createStatement();

        String sql = "select * from jdbcstudy.users";
        ResultSet rss = statement.executeQuery(sql);
        while (rss.next()) {
            System.out.println(rss.getObject("NAME"));
        }

        JDBC_Util.CloseConnection(con, statement, rss);
    }
    @Test
    public void loginTest() throws Exception {
        //user_login("Cherry","123456");
        //sql注入问题 通过特殊的字符串拼接盗取所有数据
        user_login(" 'or ' 1=1","'or ' 1=1");
    }
    //简单的用户校验，比对用户输入用户名和密码对不对的上
    public void user_login(String name,String pass) throws Exception{
        Connection con = JDBC_Util.getConnection();
        Statement statement = con.createStatement();

        String sql = "select * from jdbcstudy.users where name ='"+name+"' and password='"+pass+"'";
        ResultSet rss = statement.executeQuery(sql);
        while (rss.next()){
            System.out.println(rss.getObject("NAME"));
            System.out.println(rss.getObject("PASSWORD"));
        }/*else {
            System.out.println("数据库校验失败,请重新输入");
        }*/

        JDBC_Util.CloseConnection(con,statement,rss);
    }
}
