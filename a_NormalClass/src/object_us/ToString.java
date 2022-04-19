package object_us;

public class ToString {
    public static void main(String[] args) {
        StudentList s = new StudentList("小白",3);
        //没用重写之前调用的是地址值
        //重写后输出的是属性值
        System.out.println(s);
        System.out.println(s.toString());

    }
}
