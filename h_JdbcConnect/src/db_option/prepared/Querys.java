package db_option.prepared;

import db_option.JDBC_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author kinoz
 * @Date 2022/6/29 - 17:46
 * @apiNote
 */
public class Querys {
    public static void main(String[] args) throws Exception {
        user_login("lisi","123456");
        user_login(" 'or ' 1=1","'or ' 1=1");
    }
    public static void select() throws Exception{
        //1.ͨ���������ȡ����
        Connection con = JDBC_Util.getConnection();
        //2.sql���
        String sql = "select * from school.student";
        //3.Ԥ����
        PreparedStatement pst = con.prepareStatement(sql);
        //4.��ʽ��ѯ
        ResultSet rst = pst.executeQuery();
        while (rst.next()){
            System.out.println(rst.getObject("StudentNo"));
            System.out.println(rst.getObject("LoginPwd"));
            System.out.println(rst.getObject("StudentName"));
            System.out.println("===========================");
        }

        JDBC_Util.CloseConnection(con,pst,rst);
    }


    // ��ȫ�Ĳ�ѯ�����û���Ϣ
    public static void user_login(String name,String password) throws Exception {
        Connection con = JDBC_Util.getConnection();
        //ʹ��PreparedStatement���Ժܺõı���Sqlע��
        //��Ѵ�������Ĳ��������ַ�,�������д���ת���ַ�,�ᱻֱ��ת��
        String sql = "select * from mybatisframe.user where username =? and password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,name);
        pst.setString(2,password);
        ResultSet rst = pst.executeQuery();
        if (rst.next()){
            System.out.println(rst.getObject("NAME"));
        }else {
            System.out.println("����ʧ�ܣ������º˶������Ϣ������");
        }

        JDBC_Util.CloseConnection(con,pst,rst);
    }
}
