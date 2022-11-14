package jdk8_newfeature;

import java.util.Objects;

/**
 * @author kinoz
 * @Date 2022/11/14 10:31
 * @apiNote
 */
public class ReData {
    public int id;
    private String name;
    private int age;

    public ReData() {
    }

    public ReData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public ReData(String name) {
        this.name = name;
    }

    //This is about the editor's info
    public void info() throws ClassCastException{
        System.out.println("����һ������༭��");
    }

    //This is about you want secret info
    private String secretInfo(String str) throws RuntimeException{
        System.out.println(str);
        return null;
    }
    private static void anotherMethod(){
        System.out.println("����һ����̬�����������ҵ�������");
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
