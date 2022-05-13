package collection_us.set_us.TreeSet;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.TreeSet;
/*
* comparator接口的使用
* */
public class Generic {
    public static void main(String[] args) {
        arrayMethod();
        treeMethod();

    }
    private static void arrayMethod(){
        TreeSet<Student> ts1 = new TreeSet<>(new Comparators());
        ts1.add(new Student("Z",23));
        ts1.add(new Student("A",67));
        ts1.add(new Student("C",43));
        ts1.add(new Student("P",832));

        TreeSet<BaseStudent> ts2 = new TreeSet<>(new Comparators());
        ts2.add(new BaseStudent("Z",23));
        ts2.add(new BaseStudent("A",67));
        ts2.add(new BaseStudent("C",43));
        ts2.add(new BaseStudent("P",832));

        System.out.println(ts2);
    }
    private static void treeMethod() {
        ArrayList<Student> list1=new ArrayList<>();
        list1.add(new Student("Cn",18));
        list1.add(new Student("Us",168));
        list1.add(new Student("Un",32));

        ArrayList<BaseStudent> list2=new ArrayList<>();
        list2.add(new BaseStudent("Ak",18));
        list2.add(new BaseStudent("M4",168));
        list2.add(new BaseStudent("M16",32));

        list1.addAll(list2);
        System.out.println(list1);
    }
}
class Comparators implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        int num = o1.getAge()-o2.getAge();
        return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}
