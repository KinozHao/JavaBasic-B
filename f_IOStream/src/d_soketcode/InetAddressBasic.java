package d_soketcode;

import org.junit.Test;

import java.net.InetAddress;
import java.net.Socket;

/**
 * @author kinoz
 * @Date 2022/6/9 - 21:52
 * @apiNote InetAddress的使用
 */
public class InetAddressBasic {
    @Test
    public void IAB() throws Exception{
        //getByName中可以写IP也可以写域名
        InetAddress ipadd = InetAddress.getByName("www.kinozspace.top");
        System.out.println(ipadd);

        //获取本机的IP地址
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //获取HostIP或者域名
        System.out.println(ipadd.getHostAddress());
        System.out.println(ipadd.getHostName());
    }
}
