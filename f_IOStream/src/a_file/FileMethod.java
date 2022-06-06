package a_file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * @author kinoz
 * @Date 2022/5/30 - 13:48
 * @apiNote File��ĳ��÷���
 * @see File
 */
public class FileMethod {
    @Test
    public void file_Get() {
        File files = new File("accessData.txt");

        System.out.println("����·��"+files.getAbsolutePath());

        System.out.println("���·��"+files.getPath());

        System.out.println("�ļ�����"+files.getName());

        System.out.println("�ļ��ַ�������"+files.length());

        System.out.println("�ļ�������޸�ʱ��"+new Date(files.lastModified()));

        //���ļ�������Ϊָ����·���ļ�
        //�豣֤file1���� file2������
        File file1 = new File("hello.txt");
        File file2 = new File("E:\\JavaCode\\SEImprove\\f_IOStream\\b.txt");
        System.out.println(file1.renameTo(file2));

        //ɾ���������߻���վ
        System.out.println(file2.delete());
    }

    @Test
    public void file_Make() throws IOException{
        File file = new File("E:\\JavaCode\\SEImprove\\LiuData\\InnerData");
        boolean mkdirs = file.mkdirs();
        if (mkdirs){
            System.out.println("�����ɹ�");
        }
        File file1 = new File("E:\\JavaCode\\SEImprove\\Singles");
        boolean mkdir = file1.mkdir();
        if (mkdir == true){
            System.out.println("�����ɹ�");
        }else {
            System.out.println("�ļ����Ѿ�����");
        }
    }

    @Test
    public void file_Judge() throws IOException {
        File file = new File("accessData.txt");
        //����a.txt�ļ�
        System.out.println(file.createNewFile());
        //�ж��ǲ��Ǹ��ļ���
        System.out.println(file.isDirectory());
        //�ж��ǲ��Ǹ��ļ�
        System.out.println(file.isFile());
        //�ж��Ƿ����
        System.out.println(file.exists());

    }
    @Test
    public void file_RW(){
        File file1 = new File("accessData.txt");
        //����Ϊ���ɶ�
        file1.setReadable(false);
        System.out.println("�Ƿ�ɶ�"+file1.canRead());

        //���ò���д
        file1.setWritable(true);
        System.out.println("�Ƿ��д"+file1.canWrite());

        System.out.println("�Ƿ�����"+file1.isHidden());
    }
}
