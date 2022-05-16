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
        //输出集合所有元素
        System.out.println(Numlist);
        //集合的长度
        System.out.println(Numlist.size());
        //调用索引为1的元素
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
        //List接口下实现类是有序的,顺序不一样使用equals会报错
        System.out.println(list.equals(list2));
    }
}
