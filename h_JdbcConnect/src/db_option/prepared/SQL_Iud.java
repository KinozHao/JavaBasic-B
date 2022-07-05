package db_option.prepared;

import db_option.JDBC_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/6/29 - 17:24
 * @apiNote ʹ��PreparedStatement����Ա�֤sql����ע��
 */
public class SQL_Iud {
    public static void main(String[] args) throws Exception {
        delete();
    }
    public static void insert() throws Exception {
        Connection con = JDBC_Util.getConnection();

        String sql = "insert into jdbcstudy.users (id, NAME, PASSWORD, email, birthday) VALUES(?,?,?,?,?)";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,6);
        pst.setString(2,"��˹��");
        pst.setString(3,"12345678*");
        pst.setString(4,"Mask.gmail");
        pst.setDate(5,new java.sql.Date(new Date().getTime()));

        int i = pst.executeUpdate();
        if (i>0){
            System.out.println("����ɹ�");
        }

        JDBC_Util.CloseConnection(con,pst,null);
    }

    public static void update() throws Exception{
        Connection con = JDBC_Util.getConnection();
        String sql = "update jdbcstudy.users set PASSWORD=? where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,"zsnb666wd88");
        pst.setInt(2,5);

        int i = pst.executeUpdate();
        if (i>0){
            System.out.println("���ݸ��³ɹ�!");
        }
        JDBC_Util.CloseConnection(con,pst,null);
    }

    public static void delete() throws Exception{
        Connection con = JDBC_Util.getConnection();

        String sql = "delete from jdbcstudy.users where id=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setInt(1,6);
        int i = pst.executeUpdate();
        if (i>0){
            System.out.println("ɾ���ɹ�");
        }
        JDBC_Util.CloseConnection(con,pst,null);
    }
}
