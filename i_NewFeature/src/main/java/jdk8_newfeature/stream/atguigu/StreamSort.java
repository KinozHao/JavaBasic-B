package jdk8_newfeature.stream.atguigu;

import jdk8_newfeature.pojo.Person;
import jdk8_newfeature.pojo.PersonDB;
import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/7/5 - 18:49
 * @apiNote streamAPI�����Ĳ���
 */
public class StreamSort {
    @Test
    public void sortTest(){
        //default sort from small -> big
        List<Integer> list = Arrays.asList(1, 3, 5, 7, 2, 6, -3);
        Stream<Integer> sorted = list.stream().sorted();
        sorted.forEach(System.out::println);

        //customer sort [sort with Salary]
        List<Person> details = PersonDB.getPersonInfo();
        //methodA: lambda format
        details.stream().sorted((e1,e2)->(Double.compare(e1.getSalary(),e2.getSalary()))
        ).forEach(s-> System.out.println(s));

        //methodB: Method ref
        Stream<Person> cusSort = details.stream().sorted(Comparator.comparingDouble(Person::getSalary));
        cusSort.forEach(System.out::println);
    }
}
