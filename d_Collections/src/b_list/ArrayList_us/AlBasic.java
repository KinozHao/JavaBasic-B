package b_list.ArrayList_us;

import java.util.ArrayList;

public class AlBasic {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1(){
        //创建了一个ArrayList集合,集合的名称是list,里面装的全是String类型的字符串数据
        //Note:JDK 1.7++ One the right<> not must write but must write the<>
        ArrayList<String> list=new ArrayList<>();
        //when you want to write some data you have to using the "add method"
        list.add("Hisi");
        System.out.println(list);
        list.add("Italy");
        list.add("Joffire");
        list.add("Kngs");
        System.out.println(list);
    }

    public static void method2() {
        ArrayList<String> list=new ArrayList<>();
        //<>就是泛型,泛型只能使用引用数据类型，不能使用基本数据类型
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(20);
        list2.add(300);
        list2.add(4000);
        list2.add(50000);
        list2.add(600000);
        list2.add(111111);
        System.out.println(list2);
        //集合的长度ds
        int num=list2.size();
        System.out.println(num);
        //调用集合第四个值
        int num2=list2.get(4);
        System.out.println(num2);

    }
}
