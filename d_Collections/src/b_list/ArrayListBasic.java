package b_list;

import org.junit.Test;

import java.util.ArrayList;

public class ArrayListBasic {
    @Test
    public void BasicUs() {
        ArrayList<Integer> Numlist=new ArrayList<>();
        Numlist.add(10);
        Numlist.add(20);
        Numlist.add(30);
        //�����������Ԫ��
        System.out.println(Numlist);
        //���ϵĳ���
        System.out.println(Numlist.size());
        //��������Ϊ1��Ԫ��
        System.out.println(Numlist.get(1));

    }
    @Test
    public void someMethod(){
        ArrayList list = new ArrayList();
        list.add("Honor");
        list.add("Huawei");
        list.add("OnePlus");
        list.add("Mi");
        System.out.println("We got this"+list.get(2));

        list.remove(3);

        System.out.println(list);

        System.out.println("The arrays size:"+list.size());

        ArrayList list2 = new ArrayList();
        list2.add("Mi");
        list2.add("Honor");
        list2.add("Huawei");
        list2.add("OnePlus");
        //List�ӿ���ʵ�����������,˳��һ��ʹ��equals�ᱨ��
        System.out.println(list.equals(list2));
    }
}
