package c_map;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/5/22 - 20:58
 * @apiNote Hashtable������Properties��ʹ��
 */
public class PropertiesBasic{
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        //1.���������ļ�
        p.load(new FileInputStream("d_Collections/jdbc.properties"));
        //2.ͨ��key��ȡ�����ļ�value
        p.getProperty("name");
        p.getProperty("age");
        p.getProperty("school");
        //3.���
        System.out.println(p);
    }
}
