import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author kinoz
 * @Date 2022/6/17 - 16:26
 * @apiNote ������������
 */
public class ClassLoaderBasic {
    @Test
    public void clrMethod(){
        //�����Զ����࣬ʹ��ϵͳ���������м���
        ClassLoader clr1 = ClassLoaderBasic.class.getClassLoader();
        System.out.println(clr1);

        //ͨ��ϵͳ��������getParent(),��ȡ��չ�������
        ClassLoader clr2 = clr1.getParent();
        System.out.println(clr2);

        //�޷���ȡ�����������(��Ҫ�������java�������)
        ClassLoader clr3 = clr2.getParent();
        System.out.println(clr3);
    }

    @Test
    public void LoaderTest() throws IOException {
        //��ʽһ ͨ����ļ�������Properties���ȡ�����ļ�
        Properties prop = new Properties();
        ClassLoader clr = ClassLoaderBasic.class.getClassLoader();
        InputStream ism = clr.getResourceAsStream("database.properties");
        prop.load(ism);

        String name = prop.getProperty("name");
        String age = prop.getProperty("age");
        System.out.println("����:"+name+",����:"+age);

        //��ʽ�� ͨ���ֽ���
        FileInputStream fis = new FileInputStream("bytes.properties");
        prop.load(fis);

        System.out.println("ѧ��"+prop.getProperty("collageid"));
        System.out.println("�༶��"+prop.getProperty("classnum"));
    }
}
