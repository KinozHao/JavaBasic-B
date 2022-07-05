package db_option;


import org.apache.commons.dbcp2.BasicDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/29 - 20:12
 * @apiNote apache基金会提供的一套数据库连接池
 */
public class DBCP_Util {
    private static DataSource dse = null;
    //静态代码块 随着类的加载而加载
    static {
        try {
            InputStream in = DBCP_Util.class.getClassLoader().getResourceAsStream("dbcp.properties");
            Properties pis = new Properties();
            pis.load(in);
            //工厂代理模式
            dse = BasicDataSourceFactory.createDataSource(pis);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //创建连接
    public static Connection getConnection() throws Exception{
        return dse.getConnection();
    }

    //关闭流
    public static void CloseConnection(Connection con, Statement sta, ResultSet rst){
        if (con != null){
            try {
                con.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (sta != null){
            try {
                sta.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (rst != null){
            try {
                rst.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
    }
}
