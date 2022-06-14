package d_soketcode.TCP;

import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author kinoz
 * @Date 2022/6/14 - 10:28
 * @apiNote 通过Java实现数据在客户端和服务端的传输
 */
public class    TCPBasic {
    @Test
    //客户端
    public void client() throws Exception{
        //1.创建Socket对象 指明ip和端口号
        InetAddress ip = InetAddress.getLocalHost();
        int port = 8899;
        Socket socket = new Socket(ip, port);

        //2.通过输出流发送数据
        OutputStream opsm = socket.getOutputStream();
        opsm.write("我是云南的，云南怒江的！".getBytes());

        //3.释放流资源
        opsm.close();
        socket.close();
    }

    @Test
    //服务器端
    public void server() throws Exception{
        //1.创建服务器端serverSocket，指明自己的端口号
        ServerSocket sst = new ServerSocket(8899);
        //2.接收客户端的数据
        Socket sk = sst.accept();
        //3.获取流输入
        InputStream ism = sk.getInputStream();

        //4.相当于把获取到的所有字符存放在一个数组中
        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        byte[] buffer = new byte[20];
        int len;
        while ((len = ism.read(buffer)) != -1){
            bais.write(buffer,0,len);
        }

        //5.通过toString方法把字节转换为字符串输出
        System.out.println(bais.toString());
        System.out.println("client ip:"+sk.getInetAddress());

        //6.释放流资源
        bais.close();
        ism.close();
        sk.close();
        sst.close();
    }
}
