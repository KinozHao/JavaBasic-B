package about_date;

import org.junit.Test;

import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/4 - 20:58
 * @apiNote Date���ʹ��
 */
public class DateBasic {
    @Test
    public void utilDateMethod(){
        //1.�ղι����� ���ص�ǰʱ��
        Date date = new Date();
        System.out.println(date.toString());
        //��ȡ��ǰ������������ʱ���
        System.out.println(date.getTime());

        //2.�вι����� ����ָ��ʱ��
        @Deprecated
        Date date1 = new Date(1990,3,4,13,22);

        //��sql����Date��ת��
        Date date2 = new Date(33232323223L);
        //��������ͨ��getTime����ת��Ϊ�������ڣ����Ƹ�sql��Date
        java.sql.Date date3 = new java.sql.Date(date2.getTime());
        System.out.println(date3);
    }
}
