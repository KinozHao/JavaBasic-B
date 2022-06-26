package jdk8_newfeature;

import org.junit.Test;
import re_basic.ReData;

import java.io.PrintStream;
import java.util.Comparator;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/25 - 15:09
 * @apiNote
 */
public class alltest {
    @Test
    public void lambdatest(){
        //有多个形参 但无返回值
        Comparator<Integer> con = (c1,c2) -> Integer.compare(c1,c2);
        int compare = con.compare(20, 30);
        System.out.println(compare);

        //单个形参 无返回值
        Consumer<String> cr = (t) -> System.out.println(t);
        cr.accept("hello lambda");

        //多个形参 有返回值
        Comparator<Integer> con3 = (c1,c2) ->{
            System.out.println(c1);
            System.out.println(c2);
            return Integer.compare(c1,c2);
        };
        System.out.println(con3.compare(20, 30));
        //无形参 无返回值
        Runnable run = () -> System.out.println("hola");
        run.run();
    }

    @Test
    public void reftest(){
        Consumer<String> str = ss -> System.out.println(ss);
        str.accept("hello ref");
        PrintStream out = System.out;
        Consumer<String> strs = out::println;
        strs.accept("the truly ref");

        ReData re = new ReData("Jerry",28);
        Supplier<String> spp = re::getName;
        Supplier<Integer> spp2 = re::getAge;
        System.out.println(spp.get()+spp2.get());

        Comparator<Integer> con = (c1,c2)->Integer.compare(c1,c2);
        Comparator<Integer> con2 = Integer::compare;


        Function<Double,Long> fuc = n1 -> Math.round(n1);
        //四舍五入
        System.out.println(fuc.apply(14.823232));

        Function<Double,Long> func = Math::round;
        System.out.println(func.apply(9999.99999));

    }

    @Test
    public void ref2test(){
        //not allow the rule interface abstract param != methodRef param && return value !=  try like this
        Comparator<Integer> con = (c1,c2) -> c1.compareTo(c2);
        Comparator<Integer> cvn = Integer::compareTo;
        int compare = cvn.compare(30, 50);
        System.out.println(compare);
    }

    @Test
    public void constest(){
        Function<String,ReData> fun = param -> new ReData(param);
        System.out.println(fun.apply("Hello"));
        Function<String,ReData> no = ReData::new;
        BiFunction<String,Integer,ReData> fun2 = (str,in) -> new ReData(str,in);
        System.out.println(fun2.apply("Oboma", 49));
        BiFunction<String,Integer,ReData> no2 = ReData::new;

        Function<Integer,String[]> ff = str -> new String[str];
        String[] apply = ff.apply(10);
        System.out.println(apply.toString());
        Function<Integer,String[]> ffs = String[]::new;
    }
}
