package FileClass;

import java.io.File;
/*
*1:��ȡһ��file��Ŀ¼�ļ�
2:����һ������ͨ��File��list�����Ѷ�ȡ�����ļ���ֵ������
3:<1>����1 ֻ��Ϊ�˽���÷���2
���ڿ����õĶ�
 <2>����2����һ��File����,��listFiles��ȡĿ¼�µ������ļ����ļ���
* */
public class ���ָ��Ŀ¼��ָ����׺���ļ��� {
    public static void main(String[] args) {
        File file=new File("F:\\CSS��Ƶ");
        String[] arr=file.list();           //��ȡ��Ŀ¼�µ������ļ����ļ���
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/
        File [] subFile=file.listFiles();   //��ȡ��Ŀ¼�µ������ļ����ļ���
        for (File Gos : subFile) {
            if (Gos.isFile() && Gos.getName().endsWith(".avi")){
                System.out.println(Gos);
            }
        }
    }
}
