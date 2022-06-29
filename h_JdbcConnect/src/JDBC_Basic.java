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
        // 1.ͨ�������������
        Class.forName("com.mysql.jdbc.Driver");

        // 2.������Ҫ�ṩ��������
        String url = "jdbc:mysql://localhost:3306/school?userUnicode=true&characterEncoding=gbk&useSSL=true";
        String name = "root";
        String pass = "123456";

        // 3.ͨ����ȡ����2��ȡ���ݿ�����
        Connection con = DriverManager.getConnection(url, name, pass);

        // 4. ��ȡsql���� �˶������ڶ�sql���ݵĲ���
        Statement statement = con.createStatement();


        // 5.sql��ѯ���
        String sql = "select * from student";

        // 6.ͨ��statement��ȡsql���ת��Ϊjava����
        ResultSet resultSet = statement.executeQuery(sql);

        // 7.���ݵ������
        while (resultSet.next()){
            System.out.println(resultSet.getObject("LoginPwd"));
            System.out.println( resultSet.getObject("StudentName"));
            System.out.println("=======================================");
        }

        // 8.�ͷ���Դ
        resultSet.close();
        statement.close();
        con.close();
    }
}
