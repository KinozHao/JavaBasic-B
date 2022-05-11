package compares_us;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author kinoz
 * @Date 2022/5/9 - 19:46
 * @apiNote Comparable自然排序
 * String、包装类等常用类实例了Comparable接口直接调用重写方法即可
 */
public class ComparableJK {
    @Test
    public void test1(){
        String s1 ="dfe";
        String s2 ="dfe";
        System.out.println(s1.compareTo(s2));

        Goods gd = new Goods("rice",3044);
        Goods gd2 = new Goods("wheat",330);
        System.out.println(gd.compareTo(gd2));

        Goods[] goods = new Goods[5];
        goods[0] = new Goods("LogicG304:",199);
        goods[1] = new Goods("Dell222:",332);
        goods[2] = new Goods("Apple99:",502);
        goods[3] = new Goods("MiMouse:",69);
        goods[4] = new Goods("Acer102d:",199);

        //默认为从低到高进行排序
        Arrays.sort(goods);
        System.out.println(Arrays.toString(goods));
    }
}
