package b_set.compare;

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
        TreeSet<StuB> ts1 = new TreeSet<>(new Comparators());
        ts1.add(new StuB("Z",23));
        ts1.add(new StuB("A",67));
        ts1.add(new StuB("C",43));
        ts1.add(new StuB("P",832));

        TreeSet<StuA> ts2 = new TreeSet<>(new Comparators());
        ts2.add(new StuA("Z",23));
        ts2.add(new StuA("A",67));
        ts2.add(new StuA("C",43));
        ts2.add(new StuA("P",832));

        System.out.println(ts2);
    }
    private static void treeMethod() {
        ArrayList<StuB> list1=new ArrayList<>();
        list1.add(new StuB("Cn",18));
        list1.add(new StuB("Us",168));
        list1.add(new StuB("Un",32));

        ArrayList<StuA> list2=new ArrayList<>();
        list2.add(new StuA("Ak",18));
        list2.add(new StuA("M4",168));
        list2.add(new StuA("M16",32));

        list1.addAll(list2);
        System.out.println(list1);
    }
}
class Comparators implements Comparator<StuB> {

    @Override
    public int compare(StuB o1, StuB o2) {
        int num = o1.getAge()-o2.getAge();
        return num == 0 ? o1.getName().compareTo(o2.getName()) : num;
    }
}
