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
        //1.��ȡ����
        Connection con = JDBC_Util.getConnection();
        //2.��ȡsql���� �������ݿ����
        Statement sta = con.createStatement();

        //3.Ҫִ�е�sql���
        String sql = "update jdbcstudy.users set `name` = '���' where id between 5 and 8";
        //4.ִ��sql��䲢�����ж�
        int i = sta.executeUpdate(sql);
        if (i > 0 ){
            System.out.println("����ɹ�");
        }

        //5.�ͷ���Դ
        JDBC_Util.CloseConnection(con,sta,null);
    }
}
