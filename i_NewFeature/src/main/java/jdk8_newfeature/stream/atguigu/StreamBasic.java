package jdk8_newfeature.stream.atguigu;

import jdk8_newfeature.pojo.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import java.util.function.IntPredicate;
import java.util.function.Predicate;
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

        //双列集合
        //打印出分数小于60的数据,且去重
        HashMap<String, Integer> data = new HashMap<>();
        data.put("linear_algebra",60);
        data.put("math_analysis",60);
        data.put("math_analysis",90);
        data.put("calculus",29);
        data.put("Korean",46);
        Stream<Map.Entry<String, Integer>> mapStream = data.entrySet().stream();
        mapStream.distinct()
                .filter(value -> value.getValue()<60)
                .forEach(value -> System.out.println(value));
    }

    @Test
    public void test2(){
        // 二、通过数组创建
        int[] in = new int[]{1,2,3,4,5,5,6,7,5,2};
        //基本数据类型 通过类判断
        IntStream stream = Arrays.stream(in);

        //自定义类 通过泛型判断
        User r1 = new User("Jerry", 20);
        User r2 = new User("Tom", 10);
        User[] rd = {r1,r2};
        Stream<User> stream1 = Arrays.stream(rd);

        // 三、通过自身方法创建
        Stream<Integer> ism = Stream.of(1, 3, 5, 21, 42);
    }

    @Test
    // 四、通过无限流
    public void test4(){
        // limit为条件限制 forEach为终止操作

        //迭代方式：遍历前10个偶数
        Stream.iterate(0,var->var+2).limit(10).forEach(System.out::println);

        //生产方式：生产10个随机数
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
