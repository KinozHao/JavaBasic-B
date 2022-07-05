package jdk8_newfeature.stream;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kinoz
 * @Date 2022/6/26 - 19:43
 * @apiNote 此类用于stream api测试
 */
public class PersonDB{
    public static List<Person> getPersonInfo(){
        ArrayList<Person> list = new ArrayList<>();
        list.add(new Person(1,"相非",19742));
        list.add(new Person(2,"王帅",13442));
        list.add(new Person(3,"刘六",15642));
        list.add(new Person(4,"唤魏导法",17542));
        list.add(new Person(5,"匪无",14442));
        list.add(new Person(6,"头啥分页",16882));

        return list;
    }
}
