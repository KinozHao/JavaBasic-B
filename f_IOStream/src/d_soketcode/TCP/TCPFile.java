package d_soketcode.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author kinoz
 * @Date 2022/6/14 - 10:59
 * @apiNote 实现文件之间的传输
 */
public class TCPFile {

    @Test
    public void client() throws Exception{
        //Socket层面
        InetAddress ip = InetAddress.getLocalHost();
        Socket info = new Socket(ip, 8899);
        OutputStream send = info.getOutputStream();

        //流的层面
        FileInputStream my_file = new FileInputStream("1.jpg");
        int len;
        byte[] bt = new byte[1024];
        while ((len = my_file.read(bt))!= -1){
            send.write(bt,0,len);
        }
        //关闭数据输出
        info.shutdownOutput();

        //接受服务端传送过来的信息,控制台显示
        // TODO: 2022/6/14  客户端接收不到此条信息
        InputStream ins = info.getInputStream();
        ByteArrayOutputStream bosm = new ByteArrayOutputStream();
        //byte[] be = new byte[20];
        int lenII;
        while ((lenII = ins.read(bt)) != -1){
            bosm.write(bt,0,lenII);
        }

        my_file.close();
        send.close();
        info.close();
        bosm.close();
    }

    @Test
    public void server() throws Exception{
        //Socket层面
        ServerSocket ssk = new ServerSocket(8899);
        Socket socket = ssk.accept();
        InputStream ism = socket.getInputStream();

        //流的层面
        FileOutputStream fos = new FileOutputStream(new File("car.jpg"));
        int len;
        byte[] by = new byte[1024];
        while ((len = ism.read(by)) != - 1){
            fos.write(by,0,len);
        }

        //服务端测试
        System.out.println("图片输出完毕");

        //发给客户端的反馈信息
        // TODO: 2022/6/14  服务器端信息没有成功发送
        OutputStream os = socket.getOutputStream();
        os.write("数据已接受！".getBytes());


        fos.close();
        ism.close();
        socket.close();
        os.close();
    }
}
