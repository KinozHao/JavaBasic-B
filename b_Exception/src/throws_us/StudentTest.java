package throws_us;

public class StudentTest {
    public static void main(String[] args) {
        Student stu = new Student();
        //��ʱ���û�������쳣������Ҫʹ��try_catch���а���
        try {
            stu.getInfo(20);
        } catch (AgeFalseException E) {
            System.out.println(E.getMessage());
        }
    }
}
class Student {
    int age;

    public void getInfo(int age) throws AgeFalseException {   //�׳��쳣
        if (age>=0 && age<=26) {   //�ж������ȡֵ��Χ
            this.age = age;
            System.out.println("����:"+age);
        }else {
            //�ֶ���һ���쳣
            throw new AgeFalseException("��ͳ���ѧ���ķ�Χ��");
        }
    }
}
