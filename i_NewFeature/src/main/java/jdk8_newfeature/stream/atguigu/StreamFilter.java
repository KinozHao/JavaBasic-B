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
 * @apiNote streamɸѡ����Ƭ����
 */
public class StreamFilter {
    @Test
    public void test1(){
        List<Person> person = PersonDB.getPersonInfo();
        Stream<Person> stream = person.stream();
        //��ѯ���ʴ���5000������
        stream.filter(human -> human.getSalary() >= 5000)
                .forEach(System.out::println);
        System.out.println("---------------------");
        // �ض��� ��ȡ�ض�����ǰ����
        person.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------");
        // ����Ԫ��  ����ǰ����������
        person.stream().skip(2).forEach(System.out::println);
        System.out.println("---------------------");
        // ȥ��
        person.add(new Person(8,"�ܷ���",3500));
        person.add(new Person(8,"�ܷ���",3500));
        person.add(new Person(8,"�ܷ���",3500));
        person.add(new Person(8,"�ܷ���",3500));

        person.stream().distinct().forEach(System.out::println);
    }
}
