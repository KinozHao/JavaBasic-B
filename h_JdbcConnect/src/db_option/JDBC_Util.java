package db_option;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/29 - 15:44
 * @apiNote 对创建数据库类的封装
 */
public class JDBC_Util {
    private static String driver = null;
    private static String url = null;
    private static String username = null;
    private static String password = null;
    //静态代码块 随着类的加载而加载
    static {
        try {
            InputStream in = JDBC_Util.class.getClassLoader().getResourceAsStream("db.properties");
            Properties pis = new Properties();
            pis.load(in);

            driver = pis.getProperty("driver");
            url = pis.getProperty("url");
            username = pis.getProperty("username");
            password = pis.getProperty("password");

            //驱动只用加载一次
            Class.forName(driver);

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    //创建连接
    public static Connection getConnection() throws Exception{
        return DriverManager.getConnection(url, username, password);
    }

    //关闭流
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
