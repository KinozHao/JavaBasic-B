package a_file;

import java.io.File;
import java.io.FilenameFilter;
/*
�ļ����ƹ�����
FilenameFilter����
1.����ʵ�ִ˽ӿڵ����ʵ�����ڹ����ļ�����
2.��Щʵ�������ڹ���Ŀ¼�б�list��ķ���File
3.��ͨ�����󴰿ڹ��߰����ļ��Ի������
* */
public class FileFilter {
    public static void main(String[] args) {
        File dir = new File("E:\\ͼƬ\\Blog�ز�"); //��ȡһ��File�ļ���Ŀ¼
        System.out.println("Root directory"+dir);
        FilenameFilter ffr = new FilenameFilter(){
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(name);
                File file = new File(dir,name);
                return file.isFile() && file.getName().endsWith(".png");
            }
        };
        String [] arr = dir.list(ffr);
        for (String str : arr){
            System.out.println(str);
        }
    }
}
