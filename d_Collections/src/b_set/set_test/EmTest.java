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
        //ͨ�������մ�С�����
        Comparator birthCompare = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof Employee && o2 instanceof  Employee){
                    Employee e1 = (Employee)o1;
                    Employee e2 = (Employee)o2;

                    MyDate m1 = e1.getBirthday();
                    MyDate m2 = e2.getBirthday();
                    //�Ƚ���
                    int minusYear = m1.getYear() - m2.getYear();
                    if (minusYear != 0){
                        return minusYear;
                    }
                    //�Ƚ���
                    int minusMonth =  m1.getDay() - m2.getDay();
                    if (minusMonth != 0 ){
                        return minusMonth;
                    }
                    //�Ƚ���
                    return m1.getDay() - m2.getDay();
                }
                throw new RuntimeException("�������ݲ�һ��");
            }
        };
        //comparatorʹ��
        TreeSet tree = new TreeSet(birthCompare);
        tree.add(new Employee("Jack",35,new MyDate(1443,4,4)));
        tree.add(new Employee("Zker",35,new MyDate(2352,12,28)));
        tree.add(new Employee("Noonson",35,new MyDate(6352,7,18)));
        tree.add(new Employee("Anna",35,new MyDate(352,9,2)));
        CollTraver.IteratorTravers(tree);
    }
}
