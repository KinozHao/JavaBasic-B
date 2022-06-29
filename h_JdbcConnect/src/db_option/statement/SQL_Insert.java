package db_option.statement;

import db_option.JDBC_Util;

import java.sql.*;

/**
 * @author kinoz
 * @Date 2022/6/29 - 14:37
 * @apiNote ͨ��������������ݿ����һ������
 */
public class SQL_Insert {
    public static void main(String[] args) throws Exception {
        Connection con = JDBC_Util.getConnection();
        Statement statement = con.createStatement();

        String str ="insert into jdbcstudy.users (`id`, `NAME`, `PASSWORD`, `email`, `birthday`)" +
                "values ('8','Make','123456','Make@gmail.com','1980-12-08')";
        int i = statement.executeUpdate(str);
        if (i>0){
            System.out.println("����ɹ���");
        }


       JDBC_Util.CloseConnection(con,statement,null);
    }
}
