package Set.Collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

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
        student[] arr = new student[5];
        //引用数据类型添加元素
        arr[0] =new student("Ross",9);
        arr[1] =new student("Jack",11);
        arr[2] =new student("Folk",19);

        //遍历这个学生数组
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }


    private static void methodTwo() {
        //多态体现
        Collection cls = new ArrayList();
        cls.add(new student("Ross",9));
        cls.add(new student("Jam",9));
        cls.add(new student("Walt",9));

        //转换为数组
        Object[] obj = cls.toArray();

        //遍历这个学生数组
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

