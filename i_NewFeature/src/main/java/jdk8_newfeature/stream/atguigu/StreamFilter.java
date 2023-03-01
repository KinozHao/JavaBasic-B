package jdk8_newfeature.stream.atguigu;

import jdk8_newfeature.pojo.Person;
import jdk8_newfeature.pojo.PersonDB;
import org.junit.Test;

import java.util.List;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:47
 * @apiNote stream筛选与切片操作
 */
public class StreamFilter {
    @Test
    public void test1(){
        List<Person> pio = PersonDB.getPersonInfo();
        Stream<Person> stream = pio.stream();
        //查询工资大于5000的数据
        stream.filter(e -> e.getSalary() >= 5000).forEach(System.out::println);
        System.out.println("---------------------");
        // 截断流 获取截断索引前数据
        pio.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------");
        // 跳过元素  跳过前索引个数据
        pio.stream().skip(2).forEach(System.out::println);
        System.out.println("---------------------");
        // 去重
        pio.add(new Person(8,"周非洋",3500));
        pio.add(new Person(8,"周非洋",3500));
        pio.add(new Person(8,"周非洋",3500));
        pio.add(new Person(8,"周非洋",3500));

        pio.stream().distinct().forEach(System.out::println);
    }
}
