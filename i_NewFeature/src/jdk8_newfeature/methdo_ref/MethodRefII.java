package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.ReData;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * @author kinoz
 * @Date 2022/6/23 - 16:18
 * @apiNote 方法引用格式二
 * 三种方法引用中的难点
 * 类::实例方法
 */
public class MethodRefII {
    @Test
    //String中的 compareTo(String s)
    //Comparator中的 compare(T o1, T o2)
    public void Test1(){
        //lambda表达式
        //此时o1作为调用者也可以通过方法引用的方式去写
        Comparator<String> con = (o1,o2)->o1.compareTo(o2);
        System.out.println(con.compare("NIO", "Nii"));
        //方法引用
        Comparator<String> con2 = String::compareTo;
        System.out.println(con2.compare("NIO", "NIO"));
    }

    @Test
    //String中的 equals(Object obj)
    //BiPredicate中的 test(T t, U u)
    public void Test2(){
        //lambda表达式
        BiPredicate<String,String> bpt = (u1,u2)->u1.equals(u2);
        System.out.println(bpt.test("a","b"));
        //方法引用
        BiPredicate<String,String> bpt2 = String::equals;
        System.out.println(bpt.test("a","a"));
    }

    @Test
    //ReData中的 getName()
    //Function中的  R apply(T t)
    public void Test3(){
        //lambda表达式
        ReData reData = new ReData("Jerry", 20);
        Function<ReData,String> fun = e -> e.getName();
        System.out.println(fun.apply(reData));

        //方法引用
        Function<ReData,String> fun2 = ReData::getName;
        System.out.println(fun2.apply(reData));
    }
}
