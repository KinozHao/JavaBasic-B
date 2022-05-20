package c_map;
import java.util.*;
//Map���ϵı�������
public class MapTravers {
    public static void main(String[] args) {
        //������
        Map<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //����ֵ
        go.put("Lo",14);
        go.put("Ho",15);
        Set<String> keySet=go.keySet();     //��ȡ���е�key
        Iterator<String> in=keySet.iterator();  //��ȡ������
        while (in.hasNext()){                   //�жϼ������Ƿ���Ԫ��
            String key=in.next();               //��ȡÿһ��key
            Integer value=go.get(key);          //����key��ȡvalue
            System.out.println(key+"-->"+value);    //���
        }
        //��ǿfor
        for (String key:go.keySet()){           //go.keySet������key�ļ���
            System.out.println(key+"-->"+go.get(key));
        }
    }
    //Map���ϵı���֮��ֵ�Զ����Ҽ���ֵ
    private static void AnotherMethod(){
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
