package MapStudy.HashMapStudy;

import java.util.Collection;
import java.util.HashMap;

public class HashMapMethod {
    public static void main(String[] args) {
        putAndclear();
        Judge();
        Collections();
    }

    private static void Collections() {     //��ȡ
        HashMap<String,Integer> j=new HashMap<>();
        j.put("Po",13);        //����ֵ
        j.put("Lo",14);
        j.put("Ho",15);
        Collection<Integer> in=j.values();  //��ȡ����������ֵ�ļ���
        System.out.println(in);
    }

    private static void Judge() {   //�ж�
        HashMap<String,Integer> po=new HashMap<>();
        po.put("Po",13);        //����ֵ
        po.put("Lo",14);
        po.put("Ho",15);
        //�ж��Ƿ����
        System.out.println(po.containsKey("Po"));
        System.out.println(po.containsValue(15));
        System.out.println(po.isEmpty());   //�ж��Ƿ�Ϊ��
    }

    private static void putAndclear() { //���
        HashMap<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //����ֵ
        go.put("Lo",14);
        go.put("Ho",15);
        System.out.println(go);
        go.clear();
        System.out.println(go);
    }
}
