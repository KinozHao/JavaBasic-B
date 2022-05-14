package c_map.TreeMapStudy;

import c_map.HashMapStudy.Student;

import java.util.Comparator;
import java.util.TreeMap;
//TreeMap集合键是Student值是String的一个案例

public class TreeMapUsing {
    public static void main(String[] args) {
        Object();
        Key();
    }

    private static void Key() {
        //比较键
        TreeMap<Student,String> tm=new TreeMap<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1, Student s2) {
                int num=s1.getName().compareTo(s2.getName());
                return num == 0 ? s1.getAge() - s2.getAge() : num;
            }
        });
        tm.put(new Student("Aniy",20),"Chicago");
        tm.put(new Student("Fiki",30),"Las Veges");
        tm.put(new Student("Nani",70),"Matins City");
    }

    private static void Object() {  //按照对象进行排序
        TreeMap<Student,String> tm=new TreeMap<>();
        tm.put(new Student("Aniy",20),"Chicago");
        tm.put(new Student("Fiki",30),"Las Veges");
        tm.put(new Student("Nani",70),"Matins City");
        System.out.println(tm);
    }
}
