package throws_us;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        //此时调用还会出现异常，就需要使用try_catch进行包裹
        try {
            stu.getInfo(20);
        } catch (AgeFalseException E) {
            System.out.println(E.getMessage());
        }
    }
}
class Student {
    int age;

    public void getInfo(int age) throws AgeFalseException {   //抛出异常
        if (age>=0 && age<=26) {   //判断年龄的取值范围
            this.age = age;
            System.out.println("年龄:"+age);
        }else {
            //手动抛一个异常
            throw new AgeFalseException("年纪超过学生的范围！");
        }
    }
}
