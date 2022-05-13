package about_date.deprecated;

import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/7 - 22:45
 * @apiNote SimpleDateFormal���ʹ��
 * ��Ҫ���ڽ���ʱ��
 */
public class SDFBasic {
    @Test
    public void test1() throws ParseException {
        //Ĭ�Ϲ����� ֻ��ʹ��Ĭ���ṩ�ĸ�ʽ
        SimpleDateFormat sdf = new SimpleDateFormat();
        Date dt = new Date();
        //���ʽdateԭ������
        System.out.println(sdf.format(dt));

        //������Dateԭ���ĸ�ʽ
        Date dt2 = sdf.parse("2022/5/7 ����10:49");
        System.out.println(dt2);
    }

    @Test
    public void test2() throws ParseException {
        //Ĭ�Ϲ����� ֻ��ʹ��Ĭ���ṩ�ĸ�ʽ
        SimpleDateFormat sdf = new SimpleDateFormat("GG yyyy-MM-dd hh:mm:ss");
        Date dt = new Date();
        //��ʽ��dt�������Զ����ʽ
        System.out.println(sdf.format(dt));

        //������Dateԭ���ĸ�ʽ(parse�����ݱ���������Զ����ʽ��ͬ)
        //����ParseException
        Date dt2 = sdf.parse("��Ԫ 2022-05-07 10:53:29");
        System.out.println(dt2);
    }
    //���ַ���ת��Ϊsql�µ�date
    @Test
    public void transform() throws ParseException {
        String birth = "2020-09-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date dt = sdf.parse(birth);
        java.sql.Date birthDate = new java.sql.Date(dt.getTime());
        System.out.println(birthDate);
    }

}