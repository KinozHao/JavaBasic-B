package Test;

public class TestTwo {
    public static void main(String[] args) throws  Exception{
        xs s = new xs("Mike",18);
        System.out.println("Before:"+s);
        Tools t =new Tools();
        t.setProperty(s,"age",55);
        System.out.println("After:"+s);
    }
}
class xs {
    private String name;
    private int age;

    public xs(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public xs() {
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
        return "xs{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
