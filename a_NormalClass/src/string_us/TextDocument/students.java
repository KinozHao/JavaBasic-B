package string_us.TextDocument;

public class students {
    public static void main(String[] args) {

    }
}
class xs{
    private String name;
    private int age;

    public xs() {

    }
    public xs(String name, int age) {
        this.name = name;
        this.age = age;
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
        return "这个类的解释{" + "name='" + name + '\'' + ", age=" + age + '}';
    }
}
