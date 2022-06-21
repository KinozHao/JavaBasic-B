package jdk8_newfeature;

import org.junit.Test;

import java.util.Comparator;

/**
 * @author kinoz
 * @Date 2022/6/21 - 13:54
 * @apiNote LAMBDA���ʽ��ʹ��
 */
public class LambdaBasic {
    @Test
    public void ThreadTest(){
        //ǰ
        Runnable runA = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello no lambda!");
            }
        };
        runA.run();

        //��
        Runnable runB = () -> System.out.println("hello world");;
        Thread thread = new Thread(runB);
        thread.start();
    }
    @Test
    public void ComparatorTest(){
        //����д��
        Comparator<Integer> cm = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return Integer.compare(o1,o2);
            }
        };
        System.out.println(cm.compare(21,23));

        //Lambda
        Comparator<Integer> cm1 = (o1, o2) -> Integer.compare(o1,o2);
        System.out.println(cm1.compare(21,23));

        //�������ʽ
        Comparator<Integer> cm2 = Integer::compare;
        System.out.println(cm2.compare(21,23));
    }
}
