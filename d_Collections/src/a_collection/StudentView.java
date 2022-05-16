package a_collection;

import z_tools.CollectionNote;

import java.util.Objects;

@CollectionNote("������ΪCollection��Ԫ�أ����ڲ���ʹ��")
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

    @Override           //toString�������Ը��������ʾ����ֵ
    public String toString() {
        return "student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("����contains��������ʹ��");
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentView that = (StudentView) o;
        return age == that.age &&
                Objects.equals(name, that.name);
    }
}
