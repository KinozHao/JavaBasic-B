package b_set.set_test;

import z_tools.CollTraver;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author kinoz
 * @Date 2022/5/20 - 19:32
 * @apiNote
 */
public class EmTest {
    public static void main(String[] args) {
        //通过年月日从小到大比
        Comparator birthCompare = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof  Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate m1 = e1.getBirthday();
                    MyDate m2 = e2.getBirthday();
                    //比较年
                    int minusYear = m1.getYear() - m2.getYear();
                    if (minusYear != 0){
                        return minusYear;
                    }
                    //比较月
                    int minusMonth =  m1.getDay() - m2.getDay();
                    if (minusMonth != 0 ){
                        return minusMonth;
                    }
                    //比较日
                    return m1.getDay() - m2.getDay();
                }
                throw new RuntimeException("输入数据不一致");
            }
        };
        //comparator使用
        TreeSet tree = new TreeSet(birthCompare);
        tree.add(new Employee("Jack",35,new MyDate(1443,4,4)));
        tree.add(new Employee("Zker",35,new MyDate(2352,12,28)));
        tree.add(new Employee("Noonson",35,new MyDate(6352,7,18)));
        tree.add(new Employee("Anna",35,new MyDate(352,9,2)));
        CollTraver.IteratorTravers(tree);
    }
}
