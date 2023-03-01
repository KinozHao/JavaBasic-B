package jdk8_newfeature.methdo_ref;

import jdk8_newfeature.pojo.User;
import org.junit.Test;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * @author kinoz
 * @Date 2022/6/24 - 20:22
 * @apiNote
 */
public class ConstructorRef {
    @Test
    public void test1(){
        Supplier<User> sp = new Supplier() {
            @Override
            public Object get() {
                return new User();
            }
        };
        System.out.println(sp.get());

        Supplier<User> sp2 = () -> new User();
        System.out.println(sp2.get());

        Supplier<User> sp3 = User::new;
        System.out.println(sp3.get());
    }

    @Test
    public void test2(){
    Function<String, User> fuc = param -> new User(param);
    System.out.println(fuc.apply("with lambda"));

    Function<String, User> fuc2 = User::new;
    System.out.println(fuc2.apply("with constructorRef"));
    }

    @Test
    public void test3(){
        BiFunction<String,Integer, User>  bif = (str, in) ->new User(str,in);
        System.out.println(bif.apply("Сate", 20));

        BiFunction<String,Integer, User>  bif2 = User::new;
        System.out.println(bif2.apply("Ruma", 19));
    }

    @Test
    public void test4(){
        Function<Integer,String[]> fun = length -> new String[length];
        String[] say = fun.apply(5);
        System.out.println(Arrays.toString(say));


        Function<Integer,String[]> fun2 = String[]::new;
        System.out.println(Arrays.toString(fun2.apply(10)));
    }
}
