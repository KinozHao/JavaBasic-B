package collection_us;

import iterator_us.StudentParam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionMethod {
    public static void main(String[] args) {
        ADDmethod();
        Collection s =new ArrayList();
        s.add("h");
        s.add("e");
        s.add("r");
        s.remove("h");          //ɾ������ָ���ַ�
        s.clear();                  //���ȫ��
        System.out.println(s.contains("r"));    //�ж��Ƿ����
        System.out.println(s.isEmpty());        //�ж��Ƿ�Ϊ���ַ���
        System.out.println(s.size());           //�ж��ַ�����
        System.out.println(s);                  //��ӡ
    }

    private static void ADDmethod() {
        //Set s=new Set();    ����д��
        //ArrayList����ĸ�������д��toString����,�����ڴ�ӡ���������ʱ��,����Ĳ���object���е�toString���

        Collection s=new ArrayList();        //��������ָ���������
        boolean b1=s.add("hello world");    //������������ұ�
        boolean b2=s.add(true);
        boolean b3=s.add(100);
        boolean b4=s.add(100);
        boolean b5=s.add(new StudentParam("�߷Ƿ�",17));
        System.out.println(b4);             //b4��b3�Ĵ�ӡ�����Ϊtrue
        System.out.println(b3);             //ArrayList��������洢�ظ�
        for (int i = 0; i < s.size(); i++) {
            System.out.print("���ϱ���"+((ArrayList) s).get(i)+" ");
        }
        System.out.println();
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        Collection k=new HashSet();         //��������ָ���������
        boolean n1=k.add("h1z1");           //HashSet����������洢�ظ�
        boolean n2=k.add("h1z1");
        System.out.println(n1);
        System.out.println(n2);
    }
}
