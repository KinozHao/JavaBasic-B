package re_basic;

import java.util.Objects;

@ReAnnotation("反射所使用学习类")
public class ReData extends Dynamism<String> implements ReInterface<String>{
    public int id;
    private String name;
    private int age;

    public ReData() {
    }

    public ReData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    private ReData(String name) {
        this.name = name;
    }

    @Override
    public void Profile() {
        System.out.println("这个类就是用来反射的！！！");
    }

    @ReAnnotation("This is about the editor's info")
    public void info() throws ClassCastException{
        System.out.println("这是一个代码编辑器");
    }

    @ReAnnotation("This is about you want secret info")
    private String secretInfo(String str) throws RuntimeException{
        System.out.println(str);
        return null;
    }
    private static void anotherMethod(){
        System.out.println("我是一个静态方法，这是我的输出语句");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())
        return false;
        ReData person = (ReData) o;
        return age == person.age &&
            Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
}
