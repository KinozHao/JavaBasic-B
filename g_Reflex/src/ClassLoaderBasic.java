import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/17 - 16:26
 * @apiNote 类加载器的理解
 */
public class ClassLoaderBasic {
    @Test
    public void clrMethod(){
        //对于自定义类，使用系统加载器进行加载
        ClassLoader clr1 = ClassLoaderBasic.class.getClassLoader();
        System.out.println(clr1);

        //通过系统加载器的getParent(),获取扩展类加载器
        ClassLoader clr2 = clr1.getParent();
        System.out.println(clr2);

        //无法获取引导类加载器(主要负责加载java核心类库)
        ClassLoader clr3 = clr2.getParent();
        System.out.println(clr3);
    }

    @Test
    public void LoaderTest() throws IOException {
        //方式一 通过类的加载器和Properties类读取配置文件
        Properties prop = new Properties();
        ClassLoader clr = ClassLoaderBasic.class.getClassLoader();
        InputStream ism = clr.getResourceAsStream("database.properties");
        prop.load(ism);

        String name = prop.getProperty("name");
        String age = prop.getProperty("age");
        System.out.println("姓名:"+name+",年龄:"+age);

        //方式二 通过字节流
        FileInputStream fis = new FileInputStream("bytes.properties");
        prop.load(fis);

        System.out.println("学号"+prop.getProperty("collageid"));
        System.out.println("班级号"+prop.getProperty("classnum"));
    }
}
