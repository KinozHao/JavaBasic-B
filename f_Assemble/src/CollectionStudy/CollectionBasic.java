package CollectionStudy;

import java.util.*;

/** @apiNote Collection本事是一个接口无法进行初始化
 * Collection的初始化由它的实现类完成
 * 直接继承它的接口有两个(List Set)
 * 实现List接口的常用类(LinkedList ArrayList Vector)
 * 实现Set接口的常用类(HashSet TreeSet)
* */
public class CollectionBasic {
    public static void main(String[] args) {
        //静态调用静态
        methodOne();
        methodTwo();
    }

    private static void methodOne(){
        //基本数据类型数组(静态初始化)
        int [] ints = {1,2,3,4,5};
        System.out.println(Arrays.toString(ints));

        //引用数据类型数组(动态初始化)
        StudentView[] arr = new StudentView[5];
        //引用数据类型添加元素
        arr[0] =new StudentView("Ross",9);
        arr[1] =new StudentView("Jack",11);
        arr[2] =new StudentView("Folk",19);

        //遍历这个学生数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    private static void methodTwo() {
        //多态体现
        Collection cls = new ArrayList();
        cls.add(new StudentView("Ross",9));
        cls.add(new StudentView("Jam",9));
        cls.add(new StudentView("Walt",9));

        //转换为数组
        Object[] obj = cls.toArray();

        //遍历这个学生数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

