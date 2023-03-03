package jdk8_newfeature.stream.atguigu;

import jdk8_newfeature.pojo.Person;
import jdk8_newfeature.pojo.PersonDB;
import org.junit.Test;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:47
 * @apiNote stream筛选与切片操作
 */
public class StreamFilter {
    @Test
    public void test1(){
        List<Person> person = PersonDB.getPersonInfo();
        Stream<Person> stream = person.stream();
        //查询工资大于5000的数据
        stream.filter(human -> human.getSalary() >= 5000)
                .forEach(System.out::println);
        System.out.println("---------------------");
        // 截断流 获取截断索引前数据
        person.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------");
        // 跳过元素  跳过前索引个数据
        person.stream().skip(2).forEach(System.out::println);
        System.out.println("---------------------");
        // 去重
        person.add(new Person(8,"周非洋",3500));
        person.add(new Person(8,"周非洋",3500));
        person.add(new Person(8,"周非洋",3500));
        person.add(new Person(8,"周非洋",3500));

        person.stream().distinct().forEach(System.out::println);
    }
}
