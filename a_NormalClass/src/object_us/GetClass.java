package object_us;

/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote getClass以及getSuperclass的使用
 */


public class GetClass {
    public static void main(String[] args) {
        StudentList studentList =new StudentList("xiaohuia",13);
        //获取对象的类
        System.out.println(studentList.getClass());
        //获取对象的父类
        System.out.println(studentList.getClass().getSuperclass());
    }
}
