package object_us;

/**
 * @author kinoz
 * @date 2022/4/9 - 17:53
 * @apiNote ==和equals的区别
 */
public class EqualsUs {
    public static void main(String[] args) {
        StudentList studentList1=new StudentList("Jone",21);
        StudentList studentList2=new StudentList("Jone",21);

        //重写前比较两个对象的地址值
        //重写后比较两个对象的实体内容(属性)
        boolean isEquals = studentList1.equals(studentList2);
        System.out.println("studentlist类型比较equals:"+isEquals);

        //==比较引用数据类型，比较的是地址值
        System.out.println("studentlist类型比较==:"+(studentList1 == studentList2));


        //==比较基本数据类型，比较的是值
        int a = 10;
        int b = 20;
        System.out.println("int类型比较:"+(a == b));


    }
}
