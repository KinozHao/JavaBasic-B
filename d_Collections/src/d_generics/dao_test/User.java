package d_generics.dao_test;

import java.util.Objects;

/**
 * @author kinoz
 * @Date 2022/5/27 - 21:09
 * @apiNote 把此类看为数据库中的一张员工类表格
 */
public class User {
    private String department;
    private int age;
    private String name;

    public User() {
    }

    public User(String department, int age, String name) {
        this.department = department;
        this.age = age;
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
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
        return "User{" +
                "department='" + department + '\'' +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return age == user.age &&
                Objects.equals(department, user.department) &&
                Objects.equals(name, user.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(department, age, name);
    }
}