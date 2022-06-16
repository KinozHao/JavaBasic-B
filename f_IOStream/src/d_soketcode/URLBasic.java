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
 * @apiNote 获取网络资源通过url
 * uniform resource locator
 */
public class URLBasic {
    public static void main(String[] args) {
        URL_Method();
        //调用方法
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

    //从网络获取资源到本地
    public static void Net_Url(String netsource,String localpath){

        InputStream in = null;
        FileOutputStream files = null;
        try {
            //1.获取资源URL
            URL url = new URL(netsource);

            //2.进行网络的连接
            HttpURLConnection ucn = (HttpURLConnection) url.openConnection();
            ucn.connect();

            //3.把网络资源存放在本地
            in = ucn.getInputStream();
            files = new FileOutputStream(localpath);
            byte[] bt = new byte[1024];
            int len;
            while ((len = in.read(bt)) != -1){
                files.write(bt,0,len);
            }
            System.out.println("获取文件成功");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            //4.释放流资源
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
