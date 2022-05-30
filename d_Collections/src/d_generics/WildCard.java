package d_generics;

import d_generics.generic_test.Datas;
import d_generics.generic_test.wcData;
import org.junit.Test;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/29 - 9:30
 * @apiNote 通配符"?"使用
 */
public class WildCard {
    //1.泛型的继承
    @Test
    public void Generic_Extend(){
        //两者为并列关系
        List<String> l1 = null;
        List<Integer> l2 = null;
        //继承关系
        Map<String,Double> m1 = null;
        HashMap<String,Double> m2 = null;

    }
    //2.泛型中通配符的使用
    @Test
    public void WildCard_Us() {
        List<String> l1 = null;
        List<Integer> l2 = new LinkedList<>();
        l2.add(13);
        l2.add(199);
        //"?"的体现
        List<?> all = null;
        all = l2;
        //添加(写入) 只能null值
        /*all.add(134);
        all.add("abc");*/
        all.add(null);

        //获取(读取) 允许读取，读取的类型为Object
        Object object = all.get(1);
        System.out.println(object);
    }
    //3.通配符在遍历上的体现
    public void show(List<?> l1){
        Iterator<?> iterator = l1.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }
    }
    @Test
    //4.条件通配符体现
    public void WildCardII_Us(){
        //extends可以理解为"<="
        //super可以理解为">="
        List<? extends Datas> l1 = null;
        List<? super Datas > l2 = null;

        List<wcData> t1 = new ArrayList<>();
        List<Datas> t2 = new ArrayList<>();
        List<Object> t3 = new ArrayList<>();

        l1 = t1;
        l1 = t2;
        //l1 = t3;

        //l2 = t1;
        l2 = t2;
        l2 = t3;

        //读取数据 ?entends体现
        l1 = t1;
        Datas datas = l1.get(0);
        //类型不能小于Datas,否则编译异常
        //wcData wcd = l1.get(0);
        System.out.println(datas);

        //读取数据 ?super体现
        l2 = t2;
        //类型需比Datas大，否则编译异常
        //Datas dts = l2.get(0);
        Object object = l2.get(0);
        System.out.println(object);

        //写入数据:
        //编译异常
        //l1.add(new wcData());
        //编译政策[? super]类型不能大于Datas
        l2.add(new Datas());
        l2.add(new wcData());

    }
}
