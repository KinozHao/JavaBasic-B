package SetStudy.TreeSet;

public class BaseStudent extends Student{
    private String name;
    private int age;

    public BaseStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public BaseStudent() {
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

    @Override
    public String toString() {
        return "BaseStudent{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
