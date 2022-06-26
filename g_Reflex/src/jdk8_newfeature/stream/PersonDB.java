package jdk8_newfeature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:43
 * @apiNote 此类用于stream api测试
 */
public class PersonDB {
    public static List<Person> getPersonInfo(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(1,"相非",9742));
        list.add(new Person(2,"王帅",3442));
        list.add(new Person(3,"刘六",5642));
        list.add(new Person(4,"唤魏导法",7542));
        list.add(new Person(5,"匪无",4442));
        list.add(new Person(6,"头啥分页",6882));

        return list;
    }
}
