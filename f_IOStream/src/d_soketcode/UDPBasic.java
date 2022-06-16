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
 * @apiNote UDP����Э����java�е�����
 */
public class UDPBasic {
    @Test
    //��TCP���UDP�ǲ��ȴ����ֵ�,���ܶ���������Ƿ����ֱ�ӷ���һ�����ݹ�ȥ
    public void sender() throws IOException {
        //1.����Socket����
        DatagramSocket sock = new DatagramSocket();
        //2.Ҫ���͵�����
        String  str = "���Ͷ˷�����һ����Ϣ";
        byte[] bs = str.getBytes();
        //3.���ݷ�װΪ���ݰ�
        DatagramPacket data = new DatagramPacket(bs,bs.length, InetAddress.getLocalHost(),9090);
        //4.�����ݷ���
        sock.send(data);
        //5.�����ͷ�
        sock.close();

    }

    @Test
    public void receiver() throws IOException{
        //1.ȷ�����Ͷ˶˿ں�
        DatagramSocket socket = new DatagramSocket(9090);
        //2.���ܵ�����
        byte[] bt = new byte[100];
        DatagramPacket data = new DatagramPacket(bt,0,bt.length);
        socket.receive(data);
        //3.����ת��ΪString���
        System.out.println(new String(data.getData(),0,data.getLength()));
        //4.�����ͷ�
        socket.close();

    }
}
