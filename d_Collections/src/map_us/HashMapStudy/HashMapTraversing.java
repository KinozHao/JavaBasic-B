package map_us.HashMapStudy;
import java.util.*;
//Map���ϵı���֮����ֵ
//ͨ���鿴Map���ϵ�api����û��iterator����,��ô˫�м�����ε���
public class HashMapTraversing {
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
}
