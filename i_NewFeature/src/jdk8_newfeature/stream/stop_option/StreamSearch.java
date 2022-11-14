package jdk8_newfeature.stream.stop_option;

import jdk8_newfeature.stream.Person;
import jdk8_newfeature.stream.PersonDB;
import org.junit.Test;

import java.util.List;
import java.util.Optional;

/**
 * @author kinoz
 * @Date 2022/7/5 - 19:18
 * @apiNote StreamAP关于匹配与查找的使用
 */
public class StreamSearch {
    @Test
    public void MatchTest1(){
        List<Person> data = PersonDB.getPersonInfo();
        boolean b = data.stream().allMatch(e -> e.getSalary() > 800);
        System.out.println("judge all person salary > 800: "+b);

        boolean b1 = data.stream().allMatch(e -> e.getSalary() > 10000);
        System.out.println("judge have anyone salary > 10000"+b1);

        //judge anyone first name is 刘
        boolean b2 = data.stream().noneMatch(e -> e.getName().startsWith("刘"));
        System.out.println(b2);

        //return the first param
        Optional<Person> first = data.stream().findFirst();
        System.out.println(first);

        //return the random param
        Optional<Person> random = data.parallelStream().findAny();
        System.out.println(random);
    }

    @Test
    public void MatchTest2(){
        List<Person> data = PersonDB.getPersonInfo();
        long count = data.stream().filter(e -> e.getSalary() > 14000).count();
        System.out.println("the salary more than 14000 count:"+count);

        Optional<Double> max = data.stream().map(e -> e.getSalary()).max((d1, d2) -> Double.compare(d1, d2));
        //use method ref
        Optional<Double> max2 = data.stream().map(Person::getSalary).max(Double::compare);
        System.out.println("the highest salary:"+max);

        Optional<Double> min = data.stream().map(Person::getSalary).min(Double::compareTo);
        System.out.println("the lowest salary:"+min);

    }
    @Test
    public void MatchTest3() {
        List<Person> data = PersonDB.getPersonInfo();
        //foreach InnerIterator
        data.stream().forEach(System.out::println);
        System.out.println("-----------------------------");
        //just traverse
        data.forEach(System.out::println);
    }
}
