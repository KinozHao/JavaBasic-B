package c_map;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import java.util.*;

public class MapMethod {
    @Test
    //��ɾ��
    public void Method1() {
        HashMap go=new HashMap<>();
        go.put("Po",13);
        go.put("Lo",14);
        go.put("Ho",15);
        go.put("Ho",15333); //�޸�
        go.remove("Po",13); //�Ƴ�
        System.out.println(go);
        System.out.println("key-value�ĸ���:"+go.size());
        //putAll����������
        HashMap go2 = new HashMap();
        go2.putAll(go);
        go2.put("HH",22);
        System.out.println(go2);
        go.clear();//���
        System.out.println(go);
    }
    @Test
    //�ж�
    public void Judge(){
        HashMap map = new HashMap();
        map.put("A",0);
        map.put("B",1);
        map.put("C",2333);
        //��ȡָ��key��Ӧ��value
        System.out.println(map.get("C"));

        //�ж�Map���Ƿ����ָ��key��value
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("2333"));
        System.out.println(map.isEmpty());  //�ж��Ƿ�Ϊ��

        //�ж�����map�������Ƿ�ȫ�����
        System.out.println(map.equals(new HashMap()));

    }

}
