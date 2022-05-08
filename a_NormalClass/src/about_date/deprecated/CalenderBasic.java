package about_date.deprecated;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;


/**
 * @author kinoz
 * @Date 2022/5/8 - 19:07
 * @apiNote Calender���ʹ��
 * ȱ�� ���пɱ���
 */
public class CalenderBasic{
    @Test
    public void instance_Method(){
        //ʵ����
        Calendar mycalendar = Calendar.getInstance();
        //�鿴Calendar��ʵ����
        System.out.println(mycalendar.getClass());
        //��ȡ��ǰʱ��
        System.out.println(mycalendar.getTime());

        //get����
        int days = mycalendar.get(Calendar.DAY_OF_MONTH);
        System.out.println("�����ǵ��µĵ�:"+days+"��");
        int days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("�����ǽ���ĵ�:"+days2+"��");

        //set����
        //ָ����ǰʱ��Ϊ����ļ���
        mycalendar.set(Calendar.DAY_OF_YEAR,1);
        days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("�����ǽ���ĵ�:"+days2+"��");

        //add����
        //�ѵ�ǰʱ����ǰ����ָ����
        mycalendar.add(Calendar.DAY_OF_YEAR,3);
        days2 = mycalendar.get(Calendar.DAY_OF_YEAR);
        System.out.println("�����ǽ���ĵ�:"+days2+"��");
    }
    @Test
    public void format_Parse(){
        Calendar CDR = Calendar.getInstance();
        //��ʽ�� ������-->ʱ����
        System.out.println(CDR.getTime());
        //���� ʱ����-->������
        Date date = new Date();
        CDR.setTime(date);
        System.out.println("����ĵ�:"+CDR.get(Calendar.DAY_OF_YEAR)+"��");

    }

}
