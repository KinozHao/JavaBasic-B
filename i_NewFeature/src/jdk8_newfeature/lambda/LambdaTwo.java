package jdk8_newfeature.lambda;

import org.junit.Test;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * @author kinoz
 * @Date 2022/6/21 - 14:19
 * @apiNote Lambda的细节理解
 * -> 代表Lambda操作符
 * ->左边 lambda形参列表(即使接口中抽象方法的形参列表)
 * ->右边 lambda体(即重写的抽象方法的方法体)
 */
public class LambdaTwo {
    @Test
    //1.无形参无返回值
    public void Test1(){
        Runnable rn = () -> {
            System.out.println("hello world");
        };
        rn.run();
    }
    @Test
    //2.有形参无返回值
    public void Test2(){
        Consumer<Integer> con = (Integer ins) -> {
            System.out.println("今天花了"+ins+"$");
        };
        con.accept(89);

        //2.1类型推断省略后面的类型标识
        Consumer<Integer> cons = (ins) -> {
            System.out.println("今天花了"+ins+"$");
        };
        con.accept(99);
        //2.2若参数只有1个时,()也可省略
        Consumer<Integer> cons1 = ins -> {
            System.out.println("今天花了"+ins+"$");
        };
        con.accept(99);
    }
    @Test
    //3.当有两个以上参数，多条执行语句，且可能有返回值
    public void Test3(){
        Comparator<Integer> cm = (param1,param2) ->{
            System.out.println("这是个接口");
            System.out.println("用来比较两个Integer类型的数值");
            return Integer.compare(param1,param2);
        };
        //3.1只有一条语句时，return和{}都可省略
        Comparator<Integer> cm1 = (param1,param2) -> Integer.compare(param1,param2);
        //3.2方法引用
        Comparator<Integer> cm2 = Integer::compare;
    }

}
