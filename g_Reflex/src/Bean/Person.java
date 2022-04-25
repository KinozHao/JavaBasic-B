package Bean;

import java.util.Objects;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person() {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())    //�жϵ��ö���ʹ��������ֽ����ļ�
        return false;                                   //�Ƿ���ͬһ���ֽ����ļ�
        Person person = (Person) o;
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
    public void doing(){
        System.out.println("I doing homework");
    }

    public void doing(int num){     //�������� ��������ͬ ������ͬ
        System.out.println("I also get up at AM " +num+ " o'clock");
    }

}
