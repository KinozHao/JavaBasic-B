package d_soketcode;

import org.junit.Test;

import java.net.InetAddress;

/**
 * @author kinoz
 * @Date 2022/6/9 - 21:52
 * @apiNote InetAddress��ʹ��
 */
public class InetAddressBasic {
    @Test
    public void IAB() throws Exception{
        //getByName�п���дIPҲ����д����
        InetAddress ipadd = InetAddress.getByName("www.kinozspace.top");
        System.out.println(ipadd);

        //��ȡ������IP��ַ
        InetAddress localHost = InetAddress.getLocalHost();
        System.out.println(localHost);

        //��ȡHost IP��������
        System.out.println(ipadd.getHostAddress());
        System.out.println(ipadd.getHostName());
    }
}
