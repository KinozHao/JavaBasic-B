package c_processliu;

import org.junit.Test;

import java.io.*;

/**
 * @author kinoz
 * @Date 2022/6/5 - 16:30
 * @apiNote ��������ʹ�ã����л�����
 */
public class ObjStreamBasic {
    @Test
    public void OOS() throws IOException {
        //���л�����
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("myText.dat"));

        //��Ӷ������ļ���
        oos.writeObject(new String("this is a secret file"));
        oos.flush();
        oos.writeObject(new ObjData(1,"banana",12.3));
        oos.flush();

        oos.close();
    }

    @Test

    public void OIS() throws Exception{
        //�����л�����
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("myText.dat"));

        //��ȡ������ǿתΪString���
        Object obj = ois.readObject();
        String str = (String)obj;

        //�Զ�����
        ObjData oda = (ObjData)ois.readObject();

        System.out.println(str);
        System.out.println(oda);

        ois.close();
    }

}
