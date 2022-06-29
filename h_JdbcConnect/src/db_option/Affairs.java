package db_option;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author kinoz
 * @Date 2022/6/29 - 19:35
 * @apiNote jdbc������Ĳ���
 */
public class Affairs {
    public static void main(String[] args) {
        Connection con = null;
        PreparedStatement pst = null;
        try {
            con = JDBC_Util.getConnection();
            //1.�ر��Զ��ύ(jdbc��ͬʱ��������)
            con.setAutoCommit(false);

            String sql1 ="update bank.account set money = money-100 where name='A'";
            pst = con.prepareStatement(sql1);
            pst.executeUpdate();
            int x = 1/0; //����������ع�
            String sql2 ="update bank.account set money = money+100 where name='B'";
            pst = con.prepareStatement(sql2);
            pst.executeUpdate();

            //2.��û����ͻ��ύ(�־���)
            con.commit();
        } catch (Exception e) {
            try {
                //3.������ԭ���Ծͻ�ع�(Ĭ��ʧ�ܻ��Զ��ع�����д)
                con.rollback();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
            e.printStackTrace();
        }finally {
            //4.��Դ�ͷ�
            JDBC_Util.CloseConnection(con,pst,null);
        }

    }

}
