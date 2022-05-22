package c_map;

import java.util.Map;
import java.util.Objects;

public class MapData implements Comparable {
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
    //写法一
    public int compareTo(Object o) {
        if (o instanceof MapData){
            MapData mo = (MapData)o;
            int compare = this.getName().compareTo(mo.getName());
            if (compare != 0){
                return compare;
            }else {
                return Integer.compare(this.getAge(),mo.getAge());
            }
        }else {
            throw new RuntimeException("输入类型不匹配");
        }
    }
    //写法二
    /*public int compareTo(MapData o) {
        int num = this.age - o.age;    //以年龄为主要条件
        return num == 0 ? this.name.compareTo(o.name):num;
    }*/
}
