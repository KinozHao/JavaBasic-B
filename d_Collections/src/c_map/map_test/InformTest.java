package c_map.map_test;

import java.util.HashMap;

public class InformTest {
    public static void main(String[] args) {
        //�����һ��˫�м���
        HashMap<InformData,String> area_a = new HashMap<>();
        area_a.put(new InformData("����",30),"�ϳ���");
        area_a.put(new InformData("����",18),"��ɽ��");
        area_a.put(new InformData("���",35),"������");

        //����ڶ���˫�м���
        HashMap<InformData,String> area_b = new HashMap<>();
        area_b.put(new InformData("������",3),"����");
        area_b.put(new InformData("�ݼ̹�",2),"��");
        area_b.put(new InformData("�ձ���",1),"����");

        //����һ�����кϼ� ����Ƕ��
        HashMap<HashMap<InformData,String>,String> city =new HashMap<>();
        city.put(area_a,"�㽭ʡ������");
        city.put(area_b,"�㽭ʡ������");

        //����˫�м��ϡ�
        //city.keySet()��ʾ˫�м����м��ļ���
        for (HashMap<InformData,String> key: city.keySet()){
            //get(key)�Ǹ��ݼ�������ֵ����
            String value= city.get(key);

            //��������˫�м��϶���
            //key.keySet�ǻ�ü���������������Ϣ�Ķ���
            for (InformData key2 : key.keySet()){
                String value2=key.get(key2);
                //key���������   value2����ĵ���    value�������ʡ�ݳ���
                System.out.println(key+"==="+value2+"==="+value);

            }
        }

    }
}
