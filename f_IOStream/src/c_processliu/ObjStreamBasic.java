package c_processliu;

import org.junit.Test;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/5 - 16:30
 * @apiNote 对象流的使用，序列化机制
 */
public class ObjStreamBasic {
    @Test
    public void OOS() throws IOException {
        //序列化过程
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myText.dat"));

        //添加对象到流文件中
        oos.writeObject(new String("this is a secret file"));
        oos.flush();
        oos.writeObject(new ObjData(1,"banana",12.3));
        oos.flush();

        oos.close();
    }

    @Test

    public void OIS() throws Exception{
        //反序列化过程
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myText.dat"));

        //获取到数据强转为String输出
        Object obj = ois.readObject();
        String str = (String)obj;

        //自定义类
        ObjData oda = (ObjData)ois.readObject();

        System.out.println(str);
        System.out.println(oda);

        ois.close();
    }

}
