package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.ReData;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/24 - 20:22
 * @apiNote ����������
 */
public class ConstructorRef {
    @Test
    //supplier�е�T get()����
    //ReData�еĿղι�����:ReData()
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

    @Test
    //Function�е�R apply(T)
    //ReData�е� ReData(String name)������
    public void test2(){
    //�������Ϊ�β�,�ұ�Ϊ����ֵ
    Function<String,ReData> fuc = param -> new ReData(param);
    System.out.println(fuc.apply("with lambda"));

    Function<String,ReData> fuc2 = ReData::new;
    System.out.println(fuc2.apply("with constructorRef"));
    }

    @Test
    //BigFunction�е�R apply(T t, U u)
    //ReData�е� ReData(String name, int age)������
    public void test3(){
        BiFunction<String,Integer,ReData>  bif = (str,in) ->new ReData(str,in);
        System.out.println(bif.apply("С��", 20));

        BiFunction<String,Integer,ReData>  bif2 = ReData::new;
        System.out.println(bif2.apply("����", 19));
    }

    //��������
    @Test
    public void test4(){
        Function<Integer,String[]> fun = length -> new String[length];
        //����һ������Ϊ5������
        String[] say = fun.apply(5);
        System.out.println(Arrays.toString(say));

        Function<Integer,String[]> fun2 = String[]::new;
        //����һ������Ϊ10������
        System.out.println(Arrays.toString(fun2.apply(10)));
    }
}
