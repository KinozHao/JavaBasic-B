package a_file.file_test;

import java.io.File;

/**
 * @author kinoz
 * @Date 2022/5/27 - 13:13
 * @apiNote
 * 1:��ȡһ��file��Ŀ¼�ļ�
 * 2:����һ������ͨ��File��list�����Ѷ�ȡ�����ļ���ֵ������
 */
public class CusFileSuffix {
    public static void main(String[] args) {
        //����һ �˽�
        File file=new File("E:\\ͼƬ\\Blog�ز�");
        String[] arr = file.list();           //��ȡ��Ŀ¼�µ������ļ����ļ���
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/
        //������ ���ų��� ����һ��File����,��listFiles��ȡĿ¼�µ������ļ����ļ���
        File [] subFile = file.listFiles();
        for (File Gos : subFile) {
            if (Gos.isFile() && Gos.getName().endsWith(".png")){
                System.out.println(Gos);
            }
        }
    }
}
