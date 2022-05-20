package b_set.set_test;

/**
 * @author kinoz
 * @Date 2022/5/20 - 19:24
 * @apiNote
 */
public class Employee implements Comparable{

    @Override
    //按照姓名字母排序
    public int compareTo(Object o) {
        if (o instanceof Employee){
            Employee OE = (Employee)o;
            int compare =  this.getName().compareTo(OE.getName());
            if (compare == 0){
                return Integer.compare(this.getAge(),OE.getAge());
            }else {
                return compare;
            }
        }
        throw new RuntimeException("输入类型不匹配");
    }

    private String name;
    private int age;
    private MyDate birthday;

    public Employee(String name, int age, MyDate birthday) {
        this.name = name;
        this.age = age;
        this.birthday = birthday;
    }

    public Employee() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthday=" + birthday +
                '}';
    }


}
