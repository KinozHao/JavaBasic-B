package jdk8_newfeature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:43
 * @apiNote ��������stream api����
 */
public class PersonDB {
    public static List<Person> getPersonInfo(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(1,"���",9742));
        list.add(new Person(2,"��˧",3442));
        list.add(new Person(3,"����",5642));
        list.add(new Person(4,"��κ����",7542));
        list.add(new Person(5,"����",4442));
        list.add(new Person(6,"ͷɶ��ҳ",6882));

        return list;
    }
}
