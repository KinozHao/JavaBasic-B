package map_us.maptest;

import java.util.HashMap;

public class InformTest {
    public static void main(String[] args) {
        //�����һ��˫�м���
        HashMap<InformView,String> area_a = new HashMap<>();
        area_a.put(new InformView("����",30),"�ϳ���");
        area_a.put(new InformView("����",18),"��ɽ��");
        area_a.put(new InformView("���",25),"������");

        //����ڶ���˫�м���
        HashMap<InformView,String> area_b = new HashMap<>();
        area_b.put(new InformView("������",3),"����");
        area_b.put(new InformView("�ݼ̹�",2),"��");
        area_b.put(new InformView("�ձ���",1),"����");

        //����һ�����з���
        HashMap<HashMap<InformView,String>,String> city =new HashMap<>();
        city.put(area_a,"�㽭ʡ������");
        city.put(area_b,"�㽭ʡ������");

        //����˫�м��ϡ�
        //city.keySet()��ʾ˫�м����м��ļ���
        for (HashMap<InformView,String> key: city.keySet()){
            //get(key)�Ǹ��ݼ�������ֵ����
            String value= city.get(key);

            //��������˫�м��϶���
            //key.keySet�ǻ�ü���������������Ϣ�Ķ���
            for (InformView key2 : key.keySet()){
                String value2=key.get(key2);
                //key���������   value2����ĵ���    value�������ʡ�ݳ���
                System.out.println(key+"="+value2+"="+value);

            }
        }

    }
}
