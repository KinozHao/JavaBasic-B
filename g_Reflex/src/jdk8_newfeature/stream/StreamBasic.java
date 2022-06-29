package jdk8_newfeature.stream;

import org.junit.Test;
import re_basic.ReData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:09
 * @apiNote Stream的实例化方式
 */
public class StreamBasic {
    @Test
    // 一、通过集合创建
    public void test1(){
        List<Integer> arr = Arrays.asList(20,30,40,50);
        //顺序流
        Stream<Integer> stream = arr.stream();

        //并行流
        Stream<Integer> integerStream = arr.parallelStream();

    }

    @Test
    // 二、通过数组创建
    public void test2(){
        int[] in = new int[]{1,2,3,4,5};
        //基本数据类型 通过类判断
        IntStream stream = Arrays.stream(in);

        //自定义类 通过泛型判断
        ReData r1 = new ReData("Jerry", 20);
        ReData r2 = new ReData("Tuling", 10);
        ReData[] rd = {r1,r2};
        Stream<ReData> stream1 = Arrays.stream(rd);
    }

    @Test
    // 三、通过自身方法创建
    public void test3(){
        Stream<Integer> ism = Stream.of(1, 3, 5, 21, 42);
    }

    @Test
    // 四、通过无限流
    public void test4(){
        // limit为条件限制 forEach为终止操作
        //迭代方式
        //遍历前10个偶数
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);

        //生产方式
        //生产10个随机数
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
