package b_list.ArrayList_us.PracticeQuestion;
import java.util.ArrayList;
/*
Question:
Make 4 students object add to the ArrayList and traversing the ArrayList
Thought:
1:Make a Student class have Four parts
2:MAKE a ArrayList for using to save the student object Generic:<Student>
3:According the class Make Four Student Object
4:Add four Student Object to the ArrayList:add
5:Traversing the ArrayList ALSO THINGS:for`size`get
 */
public class DemoAarrayListStudent {
    public static void main(String[] args) {
        Student one=new Student("赵丽颖",20);
        Student two=new Student("杨幂",27);
        Student three=new Student("周杰伦",18);
        Student four=new Student("张杰",25);

        ArrayList<Student> list=new ArrayList<>();
        list.add(one);
        list.add(two);
        list.add(three);
        list.add(four);

        //Arraylist traversing
        for (int i = 0; i < list.size(); i++) {
            Student stu=list.get(i);
            System.out.println("Name:"+stu.getName()+"Age:"+stu.getAge());
        }
    }
}
class Student{      //定义一个学生类
    private String name;
    private int age;
    public Student() {
    }
    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name) {
    this.name = name;
    }
    public String getName() {
    return name;
    }
    public void setAge(int age) {
    this.age = age;
    }
    public int getAge() {
    return age;
    }
}
