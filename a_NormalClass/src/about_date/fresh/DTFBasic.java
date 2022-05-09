package about_date.fresh;

import org.junit.Test;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

/**
 * @author kinoz
 * @Date 2022/5/8 - 21:55
 * @apiNote DateTimeFormatter���ʹ�� SDF's plus version
 * Ҫ���ڽ���ʱ��
 */
public class DTFBasic {
    @Test
    public void normalUs(){
        DateTimeFormatter ter3 = DateTimeFormatter.ofPattern("GGG:yyyy-MM-dd HH:mm:ss");
        //��ʽ��
        String str_time = ter3.format(LocalDateTime.now());
        System.out.println(str_time);

        //����
        System.out.println(ter3.parse("��Ԫ:2022-05-08 10:26:31"));

    }
    @Test
    public void standardInstance(){
        DateTimeFormatter ter = DateTimeFormatter.ISO_LOCAL_DATE_TIME;
        //��ʽ�� ����-->�ַ���
        String strtime = ter.format(LocalDateTime.now());
        System.out.println("���ڸ�ʽ:"+LocalDateTime.now());
        System.out.println("�ַ�����ʽ:"+strtime);

        //���� �ַ���-->����
        System.out.println(ter.parse("2022-05-08T22:03:13.091247400"));

    }
    @Test
    public void InstanceII() {
        //jdk9���������withZone(ZoneId.systemDefault())
        //Style������ SHORT MEDIUM LONG FULL

        //��ʽ��
        DateTimeFormatter ter2 = DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM).withZone(ZoneId.of("Asia/Shanghai"));
        String strsj = ter2.format(LocalDateTime.now());
        System.out.println(strsj);

        //����
        System.out.println(ter2.parse("2022��5��8�� ����10:19:41"));
    }
}
