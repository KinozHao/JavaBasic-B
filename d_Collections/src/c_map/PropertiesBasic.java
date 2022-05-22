package c_map;

import java.io.FileInputStream;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/5/22 - 20:58
 * @apiNote Hashtable的子类Properties的使用
 */
public class PropertiesBasic{
    public static void main(String[] args) throws Exception{
        Properties p = new Properties();
        //1.加载配置文件
        p.load(new FileInputStream("d_Collections/jdbc.properties"));
        //2.通过key获取配置文件value
        p.getProperty("name");
        p.getProperty("age");
        p.getProperty("school");
        //3.输出
        System.out.println(p);
    }
}
