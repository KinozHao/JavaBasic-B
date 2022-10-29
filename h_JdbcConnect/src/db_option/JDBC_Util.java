package db_option;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/29 - 15:44
 * @apiNote �Դ������ݿ���ķ�װ
 */
public class JDBC_Util {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;
    //��̬����� ������ļ��ض�����
    static {
        try {
            InputStream in = JDBC_Util.class.getClassLoader().getResourceAsStream("db.properties");
            Properties pis = new Properties();
            pis.load(in);

            driver = pis.getProperty("driver");
            url = pis.getProperty("url");
            username = pis.getProperty("username");
            password = pis.getProperty("password");

            //����ֻ�ü���һ��
            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //��������
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, username, password);
    }

    //�ر���
    public static void CloseConnection(Connection con, Statement sta, ResultSet rst) {
        try {
            con.close();
            sta.close();
            rst.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
