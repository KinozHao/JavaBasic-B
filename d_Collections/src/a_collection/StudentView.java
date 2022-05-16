package a_collection;

import z_tools.CollectionNote;

import java.util.Objects;

@CollectionNote("此类作为Collection的元素，用于测试使用")
public class StudentView {
        private String name;
        private int age;

    public StudentView() {
    }

    public StudentView(String name, int age) {
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

    @Override           //toString方法可以更方便的显示属性值
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("用于contains方法测试使用");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentView that = (StudentView) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }
}
