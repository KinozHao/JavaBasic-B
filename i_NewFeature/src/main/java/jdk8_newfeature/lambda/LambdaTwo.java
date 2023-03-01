package jdk8_newfeature.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author kinoz
 * @Date 2022/6/21 - 14:19
 * @apiNote Lambda��ϸ�����
 * -> ����Lambda������
 * ->��� lambda�β��б�(��ʹ�ӿ��г��󷽷����β��б�)
 * ->�ұ� lambda��(����д�ĳ��󷽷��ķ�����)
 */
public class LambdaTwo {
    @Test
    //1.���β��޷���ֵ
    public void Test1(){
        Runnable rn = () -> {
            System.out.println("hello world");
        };
        rn.run();
    }
    @Test
    //2.���β��޷���ֵ
    public void Test2(){
        Consumer<Integer> con = (Integer ins) -> {
            System.out.println("���컨��"+ins+"$");
        };
        con.accept(89);

        //2.1�����ƶ�ʡ�Ժ�������ͱ�ʶ
        Consumer<Integer> cons = (ins) -> {
            System.out.println("���컨��"+ins+"$");
        };
        con.accept(99);
        //2.2������ֻ��1��ʱ,()Ҳ��ʡ��
        Consumer<Integer> cons1 = ins -> {
            System.out.println("���컨��"+ins+"$");
        };
        con.accept(99);
    }
    @Test
    //3.�����������ϲ���������ִ����䣬�ҿ����з���ֵ
    public void Test3(){
        Comparator<Integer> cm = (param1,param2) ->{
            System.out.println("���Ǹ��ӿ�");
            System.out.println("�����Ƚ�����Integer���͵���ֵ");
            return Integer.compare(param1,param2);
        };
        //3.1ֻ��һ�����ʱ��return��{}����ʡ��
        Comparator<Integer> cm1 = (param1,param2) -> Integer.compare(param1,param2);
        //3.2��������
        Comparator<Integer> cm2 = Integer::compare;
    }

}
