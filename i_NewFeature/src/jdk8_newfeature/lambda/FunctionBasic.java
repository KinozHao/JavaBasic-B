package jdk8_newfeature.lambda;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * @author kinoz
 * @Date 2022/6/23 - 10:57
 * @apiNote �Ĵ�������ú���ʽ�ӿ�
 */
public class FunctionBasic {
    @Test
    public void ConsumerJK(){
        //Ĭ������д��
        happTime(13200, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("����"+aDouble+"$");
            }
        });
        System.out.println("--------------------------");
        //ʹ��lambda
        happTime(500,money -> System.out.println("����"+money+"$"));
    }

    public void happTime(double money,Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void PredicateJK(){
        List<String> list = Arrays.asList("HELLO","WOSO","WHY","OLYMPIC","FIX");
        //ʹ�������ӿ�
        List<String> afterlist = JudgeContains(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("O");
            }
        });
        System.out.println(afterlist);

        //ʹ��lambda
        List<String> lambdalist = JudgeContains(list, s -> s.contains("W"));
        System.out.println(lambdalist);
    }

    public List<String> JudgeContains(List<String> jh, Predicate<String> pro){
        ArrayList<String> jclist = new ArrayList<>();
        //ͨ��Predicate��test������ɸѡ���β�jh����������ӵ�list������
        for (String str : jh){
            if (pro.test(str)){
                jclist.add(str);
            }
        }
        return jclist;
    }
}
