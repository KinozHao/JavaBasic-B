package jdk8_newfeature.stream.center_option;

import jdk8_newfeature.stream.Person;
import jdk8_newfeature.stream.PersonDB;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:47
 * @apiNote streamɸѡ����Ƭ����
 */
public class StreamFilter {
    @Test
    public void test1(){
        List<Person> pio = PersonDB.getPersonInfo();
        Stream<Person> stream = pio.stream();
        //��ѯ���ʴ���5000������
        stream.filter(e -> e.getSalary() >= 5000).forEach(System.out::println);
        System.out.println("---------------------");
        // �ض��� ��ȡ�ض�����ǰ����
        pio.stream().limit(3).forEach(System.out::println);
        System.out.println("---------------------");
        // ����Ԫ��  ����ǰ����������
        pio.stream().skip(2).forEach(System.out::println);
        System.out.println("---------------------");
        // ȥ��
        pio.add(new Person(8,"�ܷ���",3500));
        pio.add(new Person(8,"�ܷ���",3500));
        pio.add(new Person(8,"�ܷ���",3500));
        pio.add(new Person(8,"�ܷ���",3500));

        pio.stream().distinct().forEach(System.out::println);
    }
}
