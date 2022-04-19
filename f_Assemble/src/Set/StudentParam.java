package Set;

public class StudentParam {
    String  name;
    int age;

    public StudentParam(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StudentParam() {
    }

    @Override
    public String toString() {
        return "students{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
