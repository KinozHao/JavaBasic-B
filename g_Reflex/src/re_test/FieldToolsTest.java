package re_test;

public class FieldToolsTest {
    public static void main(String[] args) throws  Exception{
        Student stu = new Student("Mike",18);
        System.out.println("Before:"+stu);

        //使用工具类更改构造器属性值
        FieldTools t = new FieldTools();
        t.setField(stu,"age",55);
        System.out.println("After:"+stu);
    }
}
class Student {
    private String name;
    private int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
