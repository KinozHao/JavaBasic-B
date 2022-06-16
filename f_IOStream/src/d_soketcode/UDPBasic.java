package d_soketcode;

import org.junit.Test;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * @author kinoz
 * @Date 2022/6/14 - 14:36
 * @apiNote UDP网络协议在java中的体现
 */
public class UDPBasic {
    @Test
    //和TCP相比UDP是不等待握手的,不管对面服务器是否存在直接发送一条数据过去
    public void sender() throws IOException {
        //1.创建Socket对象
        DatagramSocket sock = new DatagramSocket();
        //2.要发送的数据
        String  str = "发送端发送了一条信息";
        byte[] bs = str.getBytes();
        //3.数据封装为数据包
        DatagramPacket data = new DatagramPacket(bs,bs.length, InetAddress.getLocalHost(),9090);
        //4.把数据发出
        sock.send(data);
        //5.流的释放
        sock.close();

    }

    @Test
    public void receiver() throws IOException{
        //1.确定发送端端口号
        DatagramSocket socket = new DatagramSocket(9090);
        //2.接受到数据
        byte[] bt = new byte[100];
        DatagramPacket data = new DatagramPacket(bt,0,bt.length);
        socket.receive(data);
        //3.数据转换为String输出
        System.out.println(new String(data.getData(),0,data.getLength()));
        //4.流的释放
        socket.close();

    }
}
