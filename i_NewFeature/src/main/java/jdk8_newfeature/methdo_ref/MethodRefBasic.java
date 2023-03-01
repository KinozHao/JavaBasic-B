package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.pojo.User;
import org.junit.Test;


import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/23 - 15:12
 * @apiNote �������ø�ʽ
 */
public class MethodRefBasic {
    //1.����::ʵ������
    @Test
    //Consumer�е� void accept(T t)
    //PrintStream�е�void println(T t)
    public void Test1(){
        //����д��
        Consumer<String> con0 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con0.accept("Tokyo");
        //lambda���ʽ
        Consumer<String> con = s -> System.out.println(s);
        con.accept("Beijing");
        //��������
        Consumer<String> con2 = System.out :: println;
        con2.accept("Shanghai");
    }

    @Test
    //Supplier�е� T get();
    //ReData�е� String getName();
    public void Test2(){
        //lambda���ʽ
        User reData = new User("kinoz",20);
        Supplier<String> sup = () -> reData.getName();
        System.out.println(sup.get());
        //��������
        Supplier<String> sup1 = reData::getName;
        System.out.println(sup1.get());
    }

    //2.��::��̬����
    @Test
    //Comparator�е�int compare(int x, int y)
    //Integer�е�int compare(int x, int y)
    public void Test3(){
        //lambda���ʽ
        Comparator<Integer> con = (c1,c2)->Integer.compare(c1,c2);
        System.out.println(con.compare(330, 25));
        //��������
        Comparator<Integer> con2 = Integer::compare;
        System.out.println(con2.compare(30, 30));
    }
    @Test
    //Function�е�R apply(T t)
    //Math�е� round(double a)
    public void Test4(){
        //lambda���ʽ
        Function<Double,Long> fc = d -> Math.round(d);
        System.out.println(fc.apply(12.4233142323));

        //��������
        Function<Double,Long> fc2 = Math::round;
        System.out.println(fc2.apply(12.574));

    }
}
