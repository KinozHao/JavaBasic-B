import org.junit.Test;

import java.io.*;
import java.net.*;

/**
 * @author kinoz
 * @Date 2022/6/21 - 18:50
 * @apiNote
 */
public class nettest {
    @Test
    public void client() throws Exception{
        InetAddress localHost = InetAddress.getLocalHost();
        Socket socket = new Socket(localHost,8899);
        OutputStream outputStream = socket.getOutputStream();

        FileInputStream fis = new FileInputStream("1.jpg");
        int len;
        byte[] bt = new byte[1024];
        while ((len = fis.read(bt)) != -1){
            outputStream.write(bt,0,len);
        }

        socket.close();
        outputStream.close();
        fis.close();
    }
    @Test
    public void server() throws Exception{
        ServerSocket serverSocket = new ServerSocket(8899);
        Socket accept = serverSocket.accept();
        InputStream inputStream = accept.getInputStream();
     /*   ByteArrayOutputStream baos = new ByteArrayOutputStream();
        int len;
        byte[] bt = new byte[20];
        while ((len = inputStream.read(bt)) != -1){
            baos.write(bt,0,len);
        }
        System.out.println(baos.toString());*/

        FileOutputStream files = new FileOutputStream(new File("2.png"));
        int len;
        byte[] bt = new byte[1024];
        while ((len = inputStream.read(bt)) != -1){
            files.write(bt,0,len);
        }
        serverSocket.close();
        accept.close();
        inputStream.close();
        files.close();
        //baos.close();
    }
    @Test
    public void send() throws Exception{
        DatagramSocket socket = new DatagramSocket();
        String str = "message";
        byte[] bt = str.getBytes();
        DatagramPacket packet = new DatagramPacket(bt,bt.length,InetAddress.getLocalHost(),8899);

        socket.send(packet);
        socket.close();
        System.out.println(InetAddress.getLocalHost().getHostName()+":·¢ËÍ³É¹¦");
    }
    @Test
    public void receive() throws Exception{
        DatagramSocket socket = new DatagramSocket(8899);
        byte[] bt = new byte[100];
        DatagramPacket packet = new DatagramPacket(bt, 0, bt.length);
        socket.receive(packet);
        System.out.println(new String(packet.getData(),0,packet.getLength()));

        socket.close();
    }
    @Test
    public void neturl() throws Exception{
        URL url = new URL("https://user-images.githubusercontent.com/3369400/133268513-5bfe2f93-4402-42c9-a403-81c9e86934b6.jpeg");
        HttpURLConnection ucn = (HttpURLConnection) url.openConnection();
        ucn.connect();
        InputStream ism = ucn.getInputStream();
        int len;
        byte[] bt = new byte[1024];
        FileOutputStream fos = new FileOutputStream(new File("github.jpeg"));
        while ((len = ism.read(bt)) != -1){
            fos.write(bt,0,len);
        }

        ism.close();
        fos.close();
    }
}
