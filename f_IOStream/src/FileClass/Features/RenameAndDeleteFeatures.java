package FileClass.Features;

import java.io.File;
import java.io.IOException;

public class RenameAndDeleteFeatures {
    public static void main(String[] args) throws IOException {
        File a=new File("Go.txt");
        File b=new File("Java.txt");
        System.out.println(a.renameTo(b));  //·����ͬ�������,���л���,�����ͬ���Ǽ����͸���

        File c=new File("china.txt");
        //����ʹ��delete���� ��Ϊdelete���ܵ�ɾ�����߻���վ,һ��ɾ���ͺ����һ���
        System.out.println(c.delete());     //delete����ɾ���ļ� ɾ���ļ���Ҫ��֤�ļ���Ϊ������û�ж���

    }
}
