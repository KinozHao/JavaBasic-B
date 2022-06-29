package db_option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author kinoz
 * @Date 2022/6/29 - 19:35
 * @apiNote jdbc对事务的操纵
 */
public class Affairs {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = JDBC_Util.getConnection();
            //1.关闭自动提交(jdbc会同时开启事务)
            con.setAutoCommit(false);

            String sql1 ="update bank.account set money = money-100 where name='A'";
            pst = con.prepareStatement(sql1);
            pst.executeUpdate();
            int x = 1/0; //报错导致事务回滚
            String sql2 ="update bank.account set money = money+100 where name='B'";
            pst = con.prepareStatement(sql2);
            pst.executeUpdate();

            //2.若没问题就会提交(持久性)
            con.commit();
        } catch (Exception e) {
            try {
                //3.不符合原子性就会回滚(默认失败会自动回滚可略写)
                con.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            //4.资源释放
            JDBC_Util.CloseConnection(con,pst,null);
        }

    }

}
