package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.pojo.User;
import org.junit.Test;

import java.util.Comparator;
import java.util.function.BiPredicate;
import java.util.function.Function;

/**
 * @author kinoz
 * @Date 2022/6/23 - 16:18
 * @apiNote �������ø�ʽ��
 * ���ַ��������е��ѵ�
 * ��::ʵ������
 */
public class MethodRefII {
    @Test
    //String�е� compareTo(String s)
    //Comparator�е� compare(T o1, T o2)
    public void Test1(){
        //lambda���ʽ
        //��ʱo1��Ϊ������Ҳ����ͨ���������õķ�ʽȥд
        Comparator<String> con = (o1,o2)->o1.compareTo(o2);
        System.out.println(con.compare("NIO", "Nii"));
        //��������
        Comparator<String> con2 = String::compareTo;
        System.out.println(con2.compare("NIO", "NIO"));
    }

    @Test
    //String�е� equals(Object obj)
    //BiPredicate�е� test(T t, U u)
    public void Test2(){
        //lambda���ʽ
        BiPredicate<String,String> bpt = (u1,u2)->u1.equals(u2);
        System.out.println(bpt.test("a","b"));
        //��������
        BiPredicate<String,String> bpt2 = String::equals;
        System.out.println(bpt.test("a","a"));
    }

    @Test
    //ReData�е� getName()
    //Function�е�  R apply(T t)
    public void Test3(){
        //lambda���ʽ
        User reData = new User("Jerry", 20);
        Function<User,String> fun = e -> e.getName();
        System.out.println(fun.apply(reData));

        //��������
        Function<User,String> fun2 = User::getName;
        System.out.println(fun2.apply(reData));
    }
}
