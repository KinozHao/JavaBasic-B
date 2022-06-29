package db_option.apaches;

import db_option.DBCP_Util;

import java.sql.Connection;
import java.sql.Statement;

/**
 * @author kinoz
 * @Date 2022/6/29 - 20:17
 * @apiNote DBCP的测试
 */
public class Dbcp_insert {
    public static void main(String[] args) throws Exception {
        Connection con = DBCP_Util.getConnection();
        Statement statement = con.createStatement();

        String str ="insert into jdbcstudy.users (`id`, `NAME`, `PASSWORD`, `email`, `birthday`)" +
                "values ('8','谭嘉庆','2021130850','1972690714@qq.com','2001-02-18')";
        int i = statement.executeUpdate(str);
        if (i>0){
            System.out.println("插入数据成功！");
        }


        DBCP_Util.CloseConnection(con,statement,null);
    }
}
