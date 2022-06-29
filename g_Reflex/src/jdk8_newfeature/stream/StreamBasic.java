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

    }

    @Test
    // ����ͨ�����鴴��
    public void test2(){
        int[] in = new int[]{1,2,3,4,5};
        //������������ ͨ�����ж�
        IntStream stream = Arrays.stream(in);

        //�Զ����� ͨ�������ж�
        ReData r1 = new ReData("Jerry", 20);
        ReData r2 = new ReData("Tuling", 10);
        ReData[] rd = {r1,r2};
        Stream<ReData> stream1 = Arrays.stream(rd);
    }

    @Test
    // ����ͨ������������
    public void test3(){
        Stream<Integer> ism = Stream.of(1, 3, 5, 21, 42);
    }

    @Test
    // �ġ�ͨ��������
    public void test4(){
        // limitΪ�������� forEachΪ��ֹ����
        //������ʽ
        //����ǰ10��ż��
        Stream.iterate(0,t->t+2).limit(10).forEach(System.out::println);

        //������ʽ
        //����10�������
        Stream.generate(Math::random).limit(10).forEach(System.out::println);
    }
}
