package map_us.maptest;

import java.util.HashMap;

//ͳ���ַ�����ÿ���ַ����ֵĴ���
public class Nums {
    public static void main(String[] args) {
        //����һ���ַ������ַ���ת��Ϊ�ַ�����;
        String str = "abccbaabccba";
        char[] arr = str.toCharArray();

        //����˫�м���,����ַ������ַ��Լ��ַ����ֵĴ���
        HashMap<Character, Integer> hm = new HashMap<>();

        //�����ַ������е�ÿһ���ַ�,�����ַ������˫�м�����
        for (char c:arr){
            //ifд��
        /*for (char c:arr){
            if (! hm.containsKey(c)){       //������������key
                hm.put(c,1);
                }else{                      //�������key�Ļ���ÿ�μ�1�����
                    hm.put(c,hm.get(c)+1);
                }
            }*/
        //��Ԫ�������д��
        hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
        }
        //���д�ӡ���
       for (Character key:hm.keySet()){
           System.out.println(key+"--->"+hm.get(key));
       }

    }
}
