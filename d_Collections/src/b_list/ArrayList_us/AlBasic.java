package b_list.ArrayList_us;

import java.util.ArrayList;

public class AlBasic {
    public static void main(String[] args) {
        method1();
        method2();
    }

    private static void method1(){
        //������һ��ArrayList����,���ϵ�������list,����װ��ȫ��String���͵��ַ�������
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
        //<>���Ƿ���,����ֻ��ʹ�������������ͣ�����ʹ�û�����������
        ArrayList<Integer> list2=new ArrayList<>();
        list2.add(1);
        list2.add(20);
        list2.add(300);
        list2.add(4000);
        list2.add(50000);
        list2.add(600000);
        list2.add(111111);
        System.out.println(list2);
        //���ϵĳ���ds
        int num=list2.size();
        System.out.println(num);
        //���ü��ϵ��ĸ�ֵ
        int num2=list2.get(4);
        System.out.println(num2);

    }
}
