package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.ReData;
import org.junit.Test;


import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/23 - 15:12
 * @apiNote 方法引用格式
 */
public class MethodRefBasic {
    //1.对象::实例方法
    @Test
    //Consumer中的 void accept(T t)
    //PrintStream中的void println(T t)
    public void Test1(){
        //匿名写法
        Consumer<String> con0 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con0.accept("Tokyo");
        //lambda表达式
        Consumer<String> con = s -> System.out.println(s);
        con.accept("Beijing");
        //方法引用
        Consumer<String> con2 = System.out :: println;
        con2.accept("Shanghai");
    }

    @Test
    //Supplier中的 T get();
    //ReData中的 String getName();
    public void Test2(){
        //lambda表达式
        ReData reData = new ReData("kinoz",20);
        Supplier<String> sup = () -> reData.getName();
        System.out.println(sup.get());
        //方法引用
        Supplier<String> sup1 = reData::getName;
        System.out.println(sup1.get());
    }

    //2.类::静态方法
    @Test
    //Comparator中的int compare(int x, int y)
    //Integer中的int compare(int x, int y)
    public void Test3(){
        //lambda表达式
        Comparator<Integer> con = (c1,c2)->Integer.compare(c1,c2);
        System.out.println(con.compare(330, 25));
        //方法引用
        Comparator<Integer> con2 = Integer::compare;
        System.out.println(con2.compare(30, 30));
    }
    @Test
    //Function中的R apply(T t)
    //Math中的 round(double a)
    public void Test4(){
        //lambda表达式
        Function<Double,Long> fc = d -> Math.round(d);
        System.out.println(fc.apply(12.4233142323));

        //方法引用
        Function<Double,Long> fc2 = Math::round;
        System.out.println(fc2.apply(12.574));

    }
}
