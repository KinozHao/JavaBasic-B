package FileClass.Features;

import java.io.File;
import java.io.IOException;

public class MakeFeatures {
    public static void main(String[] args) throws IOException {
        File a=new File("Go.txt");  //����һ��txt���͵��ļ�
        System.out.println(a.createNewFile());

        File b=new File("Kinoz");   //����һ���ļ���
        System.out.println(b.mkdir());

        File c=new File("������ʿ\\��һ��");   //�����ļ��� ������ļ��в�����,����㴴������
        System.out.println(c.mkdirs());
    }
}
