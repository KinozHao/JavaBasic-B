package a_file;

import java.io.File;

/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote File���� ��������ȡĿ¼������
 */
public class FileTravers {
    public static void main(String[] args) {
        //���·����ȡ
        File file = new File("E:\\ͼƬ\\Blog�ز�");
        String[] arr = file.list();
        /*for (String string: arr) {
            if (string.endsWith(".avi")){
                System.out.println(string);
            }
        }*/

        //����·����ȡ
        File [] subFile = file.listFiles();
        //2.�Դ�File[]����,��ȡȫ���ļ�
        for (File files : subFile) {
            //3.ֻ��ȡ��.png��β������
            if (files.isFile() && files.getName().endsWith(".png")){
                System.out.println(files);
            }
        }
    }
}
