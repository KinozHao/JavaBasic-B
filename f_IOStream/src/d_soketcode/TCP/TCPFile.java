package d_soketcode.TCP;

import org.junit.Test;

import java.io.*;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author kinoz
 * @Date 2022/6/14 - 10:59
 * @apiNote ʵ���ļ�֮��Ĵ���
 */
public class TCPFile {

    @Test
    public void client() throws Exception{
        //Socket����
        InetAddress ip = InetAddress.getLocalHost();
        Socket info = new Socket(ip, 8899);
        OutputStream send = info.getOutputStream();

        //���Ĳ���
        FileInputStream my_file = new FileInputStream("1.jpg");
        int len;
        byte[] bt = new byte[1024];
        while ((len = my_file.read(bt))!= -1){
            send.write(bt,0,len);
        }
        //�ر��������
        info.shutdownOutput();

        //���ܷ���˴��͹�������Ϣ,����̨��ʾ
        // TODO: 2022/6/14  �ͻ��˽��ղ���������Ϣ
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
        //Socket����
        ServerSocket ssk = new ServerSocket(8899);
        Socket socket = ssk.accept();
        InputStream ism = socket.getInputStream();

        //���Ĳ���
        FileOutputStream fos = new FileOutputStream(new File("car.jpg"));
        int len;
        byte[] by = new byte[1024];
        while ((len = ism.read(by)) != - 1){
            fos.write(by,0,len);
        }

        //����˲���
        System.out.println("ͼƬ������");

        //�����ͻ��˵ķ�����Ϣ
        // TODO: 2022/6/14  ����������Ϣû�гɹ�����
        OutputStream os = socket.getOutputStream();
        os.write("�����ѽ��ܣ�".getBytes());


        fos.close();
        ism.close();
        socket.close();
        os.close();
    }
}
