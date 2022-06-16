package d_soketcode;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author kinoz
 * @Date 2022/6/14 - 15:15
 * @apiNote ��ȡ������Դͨ��url
 * uniform resource locator
 */
public class URLBasic {
    public static void main(String[] args) {
        URL_Method();
        //���÷���
        URLBasic.Net_Url("https://blogpic-1310626923.cos.ap-nanjing.myqcloud.com/img/io_picb.png","io.png");
        URLBasic.Net_Url("https://img-blog.csdnimg.cn/68d43f9bd4184d9588b05286899b33c9.png#pic_center","csdn.png");
    }

    public static void URL_Method() {
        try {
            URL url = new URL("https://www.kinozspace.top");
            System.out.println(url.getHost());
            System.out.println(url.getPort());
            System.out.println(url.getProtocol());
            System.out.println(url.getPath());
            System.out.println(url.getFile());
        }catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    //�������ȡ��Դ������
    public static void Net_Url(String netsource,String localpath){

        InputStream in = null;
        FileOutputStream files = null;
        try {
            //1.��ȡ��ԴURL
            URL url = new URL(netsource);

            //2.�������������
            HttpURLConnection ucn = (HttpURLConnection) url.openConnection();
            ucn.connect();

            //3.��������Դ����ڱ���
            in = ucn.getInputStream();
            files = new FileOutputStream(localpath);
            byte[] bt = new byte[1024];
            int len;
            while ((len = in.read(bt)) != -1){
                files.write(bt,0,len);
            }
            System.out.println("��ȡ�ļ��ɹ�");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.�ͷ�����Դ
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    files.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
