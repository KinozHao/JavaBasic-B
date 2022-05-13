package iterator_us;

import java.util.ArrayList;
import java.util.Collection;
//ArrayList的转换
public class ConvertTest {
    public static void main(String[] args) {
        SetToArrayS();
        System.out.println("-------");
        SetToArray();
        System.out.println();
        System.out.println("-------");
        UserVariable();
        System.out.println("-------");
        SetToCharacter();
    }

    private static void SetToArray() {
        Collection cl = new ArrayList();
        cl.add("h");
        cl.add("b");
        cl.add("c");
        Object [] arr=cl.toArray();     //集合转换为数组
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }
    }


    //当传入值为一个对象
    private static void UserVariable() {
        //1自定义对象 自己定义一个类存储自己的对象
        ArrayList ar = new ArrayList();
        ar.add(new StudentParam("李小化",32));
        ar.add(new StudentParam("孙而诶",15));
        ar.add(new StudentParam("周懂位",13));

        //2集合转换为数组
        Object [] obj = ar.toArray();

        for (int i = 0; i < obj.length; i++) {
            /*//3直接打印，通过重写过的toString方法判定元素是否添加成功
            System.out.println(obj[i]);*/
            StudentParam s = (StudentParam) obj[i]; //向下转型(强转)
            System.out.println("姓名:"+s.name+" 年龄:"+s.age);
        }
    }


    private static void SetToArrayS() {
        //集合转换为数组 当add为String类型
        ArrayList<String> s = new ArrayList<>();
        s.add("字符串1");
        s.add("字符串2");
        s.add("字符串3");

        Object [] obj = s.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.print("集合转数组"+ obj[i]+" ");
        }
        System.out.println();//换行


    }

    private static void SetToCharacter(){
        ArrayList<String> s = new ArrayList<>();
        s.add("字符串1");
        s.add("字符串2");
        s.add("字符串3");

        Object [] obj = s.toArray();
        //集合转换为字符串
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < obj.length; i++) {
            sb.append(obj[i]);
        }
        System.out.println();//换行
        sb.append("字符串");
        System.out.println("集合转换为字符串:"+sb);
    }
}
