package about_date.deprecated;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author kinoz
 * @Date 2022/5/8 - 22:43
 * @apiNote �����������ɹ������
 */
public class FishTest {
    public static void main(String[] args) throws ParseException {
        //��ʼ��
        String dt1 = "1990-01-01";
        //������
        String dt2 = "2022-05-08";
        SimpleDateFormat sdf = new SimpleDateFormat("yyy-MM-dd");
        Date begin = sdf.parse(dt1);
        Date last = sdf.parse(dt2);
        //����ʱ���
        System.out.println("��ʼ��������������:"+(last.getTime() - begin.getTime())/(1000*60*60*24)+1);
        //1 2 3���� 4 0ɹ��
        System.out.println(118151 % 5);

    }
}
