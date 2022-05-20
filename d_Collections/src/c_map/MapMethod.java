package c_map;

import org.junit.Test;
import java.util.*;

public class MapMethod {
    @Test
    public void Collections() {     //��ȡ
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Po",13);        //����ֵ
        map.put("Lo",14);
        map.put("Ho",15);
        Collection<Integer> integers = map.values();  //��ȡ����������ֵ�ļ���
        System.out.println(integers);
    }
    @Test
    public void Judge() {   //�ж�
        HashMap<String,Integer> po=new HashMap<>();
        po.put("Po",13);        //����ֵ
        po.put("Lo",14);
        po.put("Ho",15);
        //�ж��Ƿ����
        System.out.println(po.containsKey("Po"));
        System.out.println(po.containsValue(15));
        System.out.println(po.isEmpty());   //�ж��Ƿ�Ϊ��
    }
    @Test
    public void putAndclear() { //���
        HashMap<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //����ֵ
        go.put("Lo",14);
        go.put("Ho",15);
        System.out.println(go);
        go.clear();
        System.out.println(go);
    }

}
