package db_option.safe;

import db_option.JDBC_Util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

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
        Connection con = JDBC_Util.getConnection();
        String sql = "select * from school.student";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rst = pst.executeQuery();
        while (rst.next()){
            System.out.println(rst.getObject("StudentNo"));
            System.out.println(rst.getObject("LoginPwd"));
            System.out.println(rst.getObject("StudentName"));
            System.out.println("===========================");
        }

        JDBC_Util.CloseConnection(con,pst,rst);
    }


    // 安全的查询核验用户信息
    public static void user_login(String name,String password) throws Exception {
        Connection con = JDBC_Util.getConnection();
        //使用PreparedStatement可以很好的避免Sql注入
        //会把传入进来的参数当作字符,假设其中存在转义字符,会被直接转义
        String sql = "select * from jdbcstudy.users where name =? and password=?";
        PreparedStatement pst = con.prepareStatement(sql);
        pst.setString(1,name);
        pst.setString(2,password);
        ResultSet rst = pst.executeQuery();
        if (rst.next()){
            System.out.println(rst.getObject("NAME"));
        }else {
            System.out.println("检验失败，请重新核对你的信息！！！");
        }

        JDBC_Util.CloseConnection(con,pst,rst);
    }
}
