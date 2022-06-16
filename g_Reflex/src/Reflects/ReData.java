package Reflects;

import java.util.Objects;

public class ReData {
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

    public void info(){
        System.out.println("这是一个代码编辑器");
    }

    private String secretInfo(String str){
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
