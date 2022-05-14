package c_map.HashMapStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ
public class HashMapTraversing2 {
    public static void main(String[] args) {
        Map<String,Integer> in=new HashMap<>();
        in.put("����",23);
        in.put("����",24);
        in.put("����",25);

        //Map.Entry˵��Entry��Map���ڲ��ӿ�,������ֵ��װ����Entry����,���洢��Set������
        Set<Map.Entry<String,Integer>> en=in.entrySet();
        //�������ķ��ͺ�Set���ϵķ��ͱ���һ��
        Iterator<Map.Entry<String,Integer>> it=en.iterator();
        while (it.hasNext()){           //�жϼ������Ƿ���Ԫ��
            Map.Entry<String,Integer> go=it.next(); //��ȡÿһ��key
            //Entry�е�getKey/getValue �ֱ�������ȡ ����ֵ
            System.out.println(go.getKey()+"="+go.getValue());
        }

        //����һ����ʱ���� ����ΪEntry����   entrySet���Ԫ��
        for (Map.Entry<String,Integer> uc :in.entrySet()){
            System.out.println(uc.getKey()+"="+uc.getValue());
        }
    }
}
