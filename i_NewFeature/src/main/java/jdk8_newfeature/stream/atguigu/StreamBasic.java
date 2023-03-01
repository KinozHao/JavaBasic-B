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
 * @apiNote Stream��ʵ������ʽ
 */
public class StreamBasic {
    @Test
    // һ��ͨ�����ϴ���
    public void test1(){
        List<Integer> arr = Arrays.asList(20,30,40,50);
        //˳����
        Stream<Integer> stream = arr.stream();

        //������
        Stream<Integer> integerStream = arr.parallelStream();

        //˫�м���
        //��ӡ������С��60������,��ȥ��
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
        // ����ͨ�����鴴��
        int[] in = new int[]{1,2,3,4,5,5,6,7,5,2};
        //������������ ͨ�����ж�
        IntStream stream = Arrays.stream(in);

        //�Զ����� ͨ�������ж�
        User r1 = new User("Jerry", 20);
        User r2 = new User("Tom", 10);
        User[] rd = {r1,r2};
        Stream<User> stream1 = Arrays.stream(rd);

        // ����ͨ������������
        Stream<Integer> ism = Stream.of(1, 3, 5, 21, 42);
    }

    @Test
    // �ġ�ͨ��������
    public void test4(){
        // limitΪ�������� forEachΪ��ֹ����

        //������ʽ������ǰ10��ż��
        Stream.iterate(0,var->var+2).limit(10).forEach(System.out::println);

        //������ʽ������10�������
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
