package jdk8_newfeature.stream.center_option;

import jdk8_newfeature.stream.Person;
import jdk8_newfeature.stream.PersonDB;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/6/26 - 20:05
 * @apiNote stream映射操作
 */
public class StreamReflex {
    @Test
    public void test1(){
        //map(function f) 接收一个函数作为参数,该函数会被应用到每个元素上,并映射为一个新的元素
        //举例一 对集合数据进行大写化
        List<String> list = Arrays.asList("aa","Bb","cc");
        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
        //举例二 获取名字长度大于三的姓名
        List<Person> pio = PersonDB.getPersonInfo();
        Stream<String> nameStream = pio.stream().map(Person::getName);
        nameStream.filter(name -> name.length() > 3).forEach(System.out::println);

    }
    @Test
    public void test2(){
        List<String> list = Arrays.asList("aa","Bb","cc");
        //map(function f)
        Stream<Stream<Character>> ssm = list.stream().map(StreamReflex::fromStreamToStream);
        ssm.forEach(s1 -> {
            s1.forEach(s2 -> System.out.println(s2));
        });
        System.out.println();

        //flatMap(function f)  接收一个函数作为参数,将流中的每个值都转换成一个流,把所有流连接为一个流
        Stream<Character> csm = list.stream().flatMap(StreamReflex::fromStreamToStream);
        csm.forEach(System.out::println);
    }

    //将字符串中多个字符构成的集合转换为对应的Stream实例
    public static Stream<Character> fromStreamToStream(String str){
        ArrayList<Character> arr = new ArrayList<>();
        for (Character c:str.toCharArray()) {
            arr.add(c);
        }
        return arr.stream();
    }
}
