package db_option;


import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/29 - 20:12
 * @apiNote apache������ṩ��һ�����ݿ����ӳ�
 */
public class DBCP_Util {
    private static DataSource dse = null;
    //��̬����� ������ļ��ض�����
    static {
        try {
            //�����ȡ�����ļ�
            InputStream in = DBCP_Util.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties pis = new Properties();
            pis.load(in);
            //��������ģʽ
            dse = BasicDataSourceFactory.createDataSource(pis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //��������
    public static Connection getConnection() throws Exception{
        return dse.getConnection();
    }

    //�ر���
    public static void CloseConnection(Connection con, Statement sta, ResultSet rst){
        try {
            //���� �൱��if�ж�
            assert con != null;
            assert sta != null;
            assert rst != null;
            con.close();
            sta.close();
            rst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
