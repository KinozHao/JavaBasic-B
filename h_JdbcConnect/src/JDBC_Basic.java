import org.junit.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/29 - 13:45
 * @apiNote
 */
public class JDBC_Basic {
    public static void main(String[] args) throws Exception{
        // 1.通过反射加载驱动
        Class.forName("com.mysql.jdbc.Driver");

        // 2.连接需要提供的三件套
        String url = "jdbc:mysql://localhost:3306/school?userUnicode=true&characterEncoding=gbk&useSSL=true";
        String name = "root";
        String pass = "123456";

        // 3.通过读取步骤2获取数据库连接
        Connection con = DriverManager.getConnection(url, name, pass);

        // 4. 获取sql对象 此对象用于对sql数据的操纵
        Statement statement = con.createStatement();


        // 5.sql查询语句
        String sql = "select * from student";

        // 6.通过statement读取sql语句转换为java对象
        ResultSet resultSet = statement.executeQuery(sql);

        // 7.数据调用输出
        while (resultSet.next()){
            System.out.println(resultSet.getObject("LoginPwd"));
            System.out.println( resultSet.getObject("StudentName"));
            System.out.println("=======================================");
        }

        // 8.释放资源
        resultSet.close();
        statement.close();
        con.close();
    }
}
