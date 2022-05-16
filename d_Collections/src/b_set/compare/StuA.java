package b_set.compare;

public class StuA extends StuB {
    private String name;
    private int age;

    public StuA(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public StuA() {
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
