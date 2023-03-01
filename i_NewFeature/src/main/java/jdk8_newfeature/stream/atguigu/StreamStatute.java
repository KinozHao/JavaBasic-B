package jdk8_newfeature.stream.atguigu;

import jdk8_newfeature.pojo.Person;
import jdk8_newfeature.pojo.PersonDB;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/7/5 - 20:08
 * @apiNote Stream��Լ and StreamCollection
 */
public class StreamStatute {
    @Test
    public void StatuteTest1(){
        // calculate list sum with stream statute
        List<Integer> list = Arrays.asList(1, 3, 5, 12, 4, 4224134, 2422);
        // lambda format
        Integer sum = list.stream().reduce(0, (e, e2) -> Integer.sum(e, e2));
        // Method ref
        Integer sum2 = list.stream().reduce(0, Integer::sum);
        System.out.println(sum);

        // all person salary sum;
        // lambda format
        Optional<Double> allSalary = PersonDB.getPersonInfo().stream().map(e -> e.getSalary()).reduce((d1, d2) -> Double.sum(d1, d2));
        // Method ref
        Optional<Double> allSalaryRef = PersonDB.getPersonInfo().stream().map(Person::getSalary).reduce(Double::sum);
        System.out.println("all salary sum:"+allSalary+"$");
    }
    @Test
    public void CollectionTest(){
        //��ȡ���ʴ���12000���˲���װΪһ���µ�list
        //Ҳ���Է�װΪlist
        Stream<Person> stream = PersonDB.getPersonInfo().stream();
        List<Person> list = stream.filter(e -> e.getSalary() > 12000).collect(Collectors.toList());
        list.forEach(System.out::println);
    }
}
