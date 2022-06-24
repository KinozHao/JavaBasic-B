package jdk8_newfeature.methdo_ref;

import org.junit.Test;
import re_basic.ReData;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/24 - 20:22
 * @apiNote 构造器引用
 */
public class ConstructorRef {
    @Test
    //supplier中的T get()方法
    //ReData中的空参构造器:ReData()
    public void test1(){
        Supplier<ReData> sp = new Supplier() {
            @Override
            public Object get() {
                return new ReData();
            }
        };
        System.out.println(sp.get());

        Supplier<ReData> sp2 = () -> new ReData();
        System.out.println(sp2.get());

        Supplier<ReData> sp3 = ReData::new;
        System.out.println(sp3.get());
    }

    //Function中的R apply(T)
    //ReData中的 ReData(String name)构造器
    @Test
    public void test2(){
        //泛型左边为形参,右边为返回值
        Function<String,ReData> fuc = param -> new ReData(param);
        System.out.println(fuc.apply("with lambda"));
        Function<String,ReData> fuc2 = ReData::new;
        System.out.println(fuc2.apply("with constructorRef"));
    }

    @Test
    public void test3(){
        BiFunction<String,Integer,ReData>  bif = (str,in) ->new ReData(str,in);
        System.out.println(bif.apply("小李", 20));
        BiFunction<String,Integer,ReData>  bif2 = ReData::new;
        System.out.println(bif2.apply("赵宇", 19));
        

    }
}
