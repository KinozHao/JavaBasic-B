package Map.Exercise;

import Map.Exercise.DoubleHMSon;

import java.util.HashMap;

public class DoubleHM {
    public static void main(String[] args) {
        //����һ��a���˫�м���
        HashMap<DoubleHMSon,String> javaA=new HashMap<>();
        javaA.put(new DoubleHMSon("����",30),"�ϳ���");
        javaA.put(new DoubleHMSon("����",18),"��ɽ��");
        javaA.put(new DoubleHMSon("���",25),"������");

        //����b���˫�м���
        HashMap<DoubleHMSon,String> javaB=new HashMap<>();
        javaB.put(new DoubleHMSon("������",3),"����");
        javaB.put(new DoubleHMSon("�ݼ̹�",2),"��");
        javaB.put(new DoubleHMSon("�ձ���",1),"����");

        //����һ��ѧУ���ϴ��a��b
        HashMap<HashMap<DoubleHMSon,String>,String> Kinoz=new HashMap<>();
        Kinoz.put(javaA,"����ԺУ");
        Kinoz.put(javaB,"����ԺУ");

        //����˫�м���
        for (HashMap<DoubleHMSon,String> key: Kinoz.keySet()){  //kinoz.keyset()��ʾ˫�м����м��ļ���
            String value=Kinoz.get(key);            //get(key)�Ǹ��ݼ�������ֵ����

            //��������˫�м��϶���
            for (DoubleHMSon key2 : key.keySet()){  //key.keyset�ǻ�ü���������ѧ�����Ķ���
                String value2=key.get(key2);
                //key���������   value2����Ĺ�����    value�������У��
                System.out.println(key+"="+value2+"="+value);
            }
        }

    }
}
