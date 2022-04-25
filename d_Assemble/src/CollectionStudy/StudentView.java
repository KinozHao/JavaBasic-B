package CollectionStudy;

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
}
