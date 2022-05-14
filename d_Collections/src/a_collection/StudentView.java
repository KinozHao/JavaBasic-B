package a_collection;

import z_tools.CollectionNote;

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
}
