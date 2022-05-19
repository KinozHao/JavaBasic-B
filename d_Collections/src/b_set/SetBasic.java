package b_set;
import org.junit.Test;
import z_tools.CollTraver;

import java.math.BigInteger;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
/** @apiNote LinkedHashSet为HashSet的子类
    底层为双向链表，能保证怎么存就怎么取
*/
public class SetBasic {
    @Test
    public void Normal() {
        HashSet s = new HashSet();
        s.add("a");
        s.add(34);
        s.add("c");
        s.add(34.74322);
        /*类若重写了hashCode就只能存在一个
        添加的元素按照equals判断时，不可返回true*/
        s.add(new SetData("星巴克",1990));
        s.add(new SetData("星巴克",1990));
        Iterator iterator = s.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }
    @Test
    public void NormalII(){
        //LinkedHashSet为HashSet的子类
        //链表作用的体现
        //输出为有序是假象 只是因为存储的数据同时维护了两个引用 用链接前后数据
        LinkedHashSet lhs = new LinkedHashSet();
        lhs.add(323);
        lhs.add(new SetData("Jack",25));
        lhs.add(new BigInteger("3245223242352523523525236422"));
        lhs.add(29.64345432344242);
        CollTraver.IteratorTravers(lhs);
    }
}


