package db_option.statement;

import db_option.JDBC_Util;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kinoz
 * @Date 2022/6/29 - 16:06
 * @apiNote
 */
public class SQL_Update {
    public static void main(String[] args) throws Exception {
        //1.获取连接
        Connection con = JDBC_Util.getConnection();
        //2.获取sql对象 用于数据库操纵
        Statement sta = con.createStatement();

        //3.要执行的sql语句
        String sql = "update jdbcstudy.users set `name` = '马妞' where id between 5 and 8";
        //4.执行sql语句并做出判断
        int i = sta.executeUpdate(sql);
        if (i > 0 ){
            System.out.println("插入成功");
        }

        //5.释放资源
        JDBC_Util.CloseConnection(con,sta,null);
    }
}
