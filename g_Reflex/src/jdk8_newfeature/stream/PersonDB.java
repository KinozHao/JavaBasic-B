package jdk8_newfeature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:43
 * @apiNote ��������stream api����
 */
public class PersonDB{
    public static List<Person> getPersonInfo(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(1,"���",19742));
        list.add(new Person(2,"��˧",13442));
        list.add(new Person(3,"����",15642));
        list.add(new Person(4,"��κ����",17542));
        list.add(new Person(5,"����",14442));
        list.add(new Person(6,"ͷɶ��ҳ",16882));

        return list;
    }
}
