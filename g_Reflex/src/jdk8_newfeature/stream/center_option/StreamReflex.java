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
 * @apiNote streamӳ�����
 */
public class StreamReflex {
    @Test
    public void test1(){
        //map(function f) ����һ��������Ϊ����,�ú����ᱻӦ�õ�ÿ��Ԫ����,��ӳ��Ϊһ���µ�Ԫ��
        //����һ �Լ������ݽ��д�д��
        List<String> list = Arrays.asList("aa","Bb","cc");
        list.stream().map(String::toUpperCase).forEach(s-> System.out.println(s));
        //������ ��ȡ���ֳ��ȴ�����������
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

        //flatMap(function f)  ����һ��������Ϊ����,�����е�ÿ��ֵ��ת����һ����,������������Ϊһ����
        Stream<Character> csm = list.stream().flatMap(StreamReflex::fromStreamToStream);
        csm.forEach(System.out::println);
    }

    //���ַ����ж���ַ����ɵļ���ת��Ϊ��Ӧ��Streamʵ��
    public static Stream<Character> fromStreamToStream(String str){
        ArrayList<Character> arr = new ArrayList<>();
        for (Character c:str.toCharArray()) {
            arr.add(c);
        }
        return arr.stream();
    }
}
