package b_byte.Copy;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
/**
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote ֻ������С��ͼƬ����
 */
public class PicCopy {
    @Test
    public void pic_Test(){
        FileInputStream fis= null;
        FileOutputStream fos= null;
        try {
            //��������������
            fis = new FileInputStream("E:\\ͼƬ\\Wallpaper\\1.jpg");
            //�������������
            fos = new FileOutputStream("test.jpg");
            int i;
            while ((i=fis.read()) != -1){       //���ϵĶ�ȡÿһ���ֽ�
                fos.write(i);                   //д��ÿһ���ֽ�
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //����֮��ǵùر��� �ͷ���Դ
            try {
                fis.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
