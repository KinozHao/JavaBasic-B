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
 * @apiNote 四大核心内置函数式接口
 */
public class FunctionBasic {
    @Test
    public void ConsumerJK(){
        //默认匿名写法
        happTime(13200, new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {
                System.out.println("花了"+aDouble+"$");
            }
        });
        System.out.println("--------------------------");
        //使用lambda
        happTime(500,money -> System.out.println("花了"+money+"$"));
    }

    public void happTime(double money,Consumer<Double> con){
        con.accept(money);
    }

    @Test
    public void PredicateJK(){
        List<String> list = Arrays.asList("HELLO","WOSO","WHY","OLYMPIC","FIX");
        //使用匿名接口
        List<String> afterlist = JudgeContains(list, new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return s.contains("O");
            }
        });
        System.out.println(afterlist);

        //使用lambda
        List<String> lambdalist = JudgeContains(list, s -> s.contains("W"));
        System.out.println(lambdalist);
    }

    public List<String> JudgeContains(List<String> jh, Predicate<String> pro){
        ArrayList<String> jclist = new ArrayList<>();
        //通过Predicate的test方法做筛选把形参jh符合数据添加到list数组中
        for (String str : jh){
            if (pro.test(str)){
                jclist.add(str);
            }
        }
        return jclist;
    }
}
