package about_date.deprecated;

import org.junit.Test;

import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
/**
 * @author kinoz
 * @Date 2022/5/4 - 20:58
 * @apiNote Date���ʹ��
 * ȱ�� �ѹ�ʱ ����ƫ��������
 */
public class DateBasic {
    @Test
    public void currentTime_Method(){
        //���ص�ǰʱ��(������)
        long i = System.currentTimeMillis();
        System.out.println(i);
        //ת��Ϊ���ڸ�ʽ
        Date date1 = new Date(i);
        System.out.println(date1);
    }

    @Test
    public void utilDateMethod(){
        //1.�ղι����� ���ص�ǰʱ��
        Date date = new Date();
        System.out.println(date);
        //��ȡ��ǰ������������ʱ���
        System.out.println(date.getTime());

        //2.�вι����� ����ָ��ʱ��(����ƫ��������)
        @Deprecated
        Date date1 = new Date(1990,4,4);
        System.out.println(date1);

        //��sql����Date��ת��
        Date date2 = new Date(33232323223L);
        //��������ͨ��getTime����ת��Ϊ�������ڣ����Ƹ�sql��Date
        java.sql.Date sqldate = new java.sql.Date(date2.getTime());
        System.out.println(sqldate);
    }
}
