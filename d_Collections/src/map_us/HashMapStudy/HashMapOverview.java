package map_us.HashMapStudy;

import java.util.HashMap;

public class HashMapOverview {
    public static void main(String[] args) {
        HashMap<String,String> in=new HashMap<>();
        in.put("abc","Acer");       //ǰ��Ϊ�� ����Ϊֵ
        in.put("mon","pown");
        in.put("cce","Ater");
        in.put("cce","Pros");       //key��Ψһ��,�������ظ���
        // ���������µ�Ԫ�ص�Map�лᵼ�¾�Ԫ�ر�����  ֻ��������Ԫ��
        System.out.println(in.get("cce"));
    }
}
