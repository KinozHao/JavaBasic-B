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
 * @apiNote ͨ��Javaʵ�������ڿͻ��˺ͷ���˵Ĵ���
 */
public class    TCPBasic {
    @Test
    //�ͻ���
    public void client() throws Exception{
        //1.����Socket���� ָ��ip�Ͷ˿ں�
        InetAddress ip = InetAddress.getLocalHost();
        int port = 8899;
        Socket socket = new Socket(ip, port);

        //2.ͨ���������������
        OutputStream opsm = socket.getOutputStream();
        opsm.write("�������ϵģ�����ŭ���ģ�".getBytes());

        //3.�ͷ�����Դ
        opsm.close();
        socket.close();
    }

    @Test
    //��������
    public void server() throws Exception{
        //1.������������serverSocket��ָ���Լ��Ķ˿ں�
        ServerSocket sst = new ServerSocket(8899);
        //2.���տͻ��˵�����
        Socket sk = sst.accept();
        //3.��ȡ������
        InputStream ism = sk.getInputStream();

        //4.�൱�ڰѻ�ȡ���������ַ������һ��������
        ByteArrayOutputStream bais = new ByteArrayOutputStream();
        byte[] buffer = new byte[20];
        int len;
        while ((len = ism.read(buffer)) != -1){
            bais.write(buffer,0,len);
        }

        //5.ͨ��toString�������ֽ�ת��Ϊ�ַ������
        System.out.println(bais.toString());
        System.out.println("client ip:"+sk.getInetAddress());

        //6.�ͷ�����Դ
        bais.close();
        ism.close();
        sk.close();
        sst.close();
    }
}
