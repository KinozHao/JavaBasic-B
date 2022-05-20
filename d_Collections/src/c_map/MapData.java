package c_map;

import java.util.Objects;

public class MapData implements Comparable<MapData> {
        private String name;
        private int age;

    public MapData(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        MapData student = (MapData) o;

        if (age != student.age) return false;
        return Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public int compareTo(MapData o) {
        int num=this.age -o.age;    //以年龄为主要条件
        return num == 0 ? this.name.compareTo(o.name):num;
    }
}
