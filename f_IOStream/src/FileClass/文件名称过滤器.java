package FileClass;

import java.io.File;
import java.io.FilenameFilter;

public class �ļ����ƹ����� {
    public static void main(String[] args) {
        File dir=new File("F:\\CSS��Ƶ"); //��ȡһ��File�ļ���Ŀ¼
        String [] arr=dir.list(new FilenameFilter() {
            /*FilenameFilter����
            ����ʵ�ִ˽ӿڵ����ʵ�����ڹ����ļ�����
            ��Щʵ�������ڹ���Ŀ¼�б�list��ķ���File
            ��ͨ�����󴰿ڹ��߰����ļ��Ի������*/
            @Override
            public boolean accept(File dir, String name) {
                System.out.println(dir);
                System.out.println(name);
                File King=new File(dir,name);
                return King.isFile() && King.getName().endsWith(".txt");
            }
        });
        for (String string : arr){
            System.out.println(string);
        }
    }
}
