package re_basic;

import java.util.Objects;
import java.util.Properties;

@ReAnnotation("������ʹ��ѧϰ��")
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
        System.out.println("����������������ģ�����");
    }

    @ReAnnotation("This is about the editor's info")
    public void info() throws ClassCastException{
        System.out.println("����һ������༭��");
    }

    @ReAnnotation("This is about you want secret info")
    private String secretInfo(String str) throws RuntimeException{
        System.out.println(str);
        return str;
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
}
