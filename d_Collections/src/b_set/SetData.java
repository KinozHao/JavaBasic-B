package b_set;

import java.util.Objects;
//供TreeSet作为元素排序使用
public class SetData implements Comparable {
    private String name;
    private int age;

    public SetData(String name, int age) {
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
        return name+"->"+age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SetData stuB = (SetData) o;
        return age == stuB.age &&
                Objects.equals(name, stuB.name);
    }

    @Override
    //哈希码在HashSet的存放过程中有很深刻的体现
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    //自然排序的体现
    public int compareTo(Object o) {
        if (o instanceof SetData){
            SetData data = (SetData)o;
            //先判断名称
            int compare = this.name.compareTo(data.name);
            //如果名称一样(返回为0就是一样)
            if (compare == 0){
                //通过Integer再比较年龄(若不比较就会只存一个数据)
                return Integer.compare(this.age,data.age);
            }else {
                return compare;
            }
        }else {
            throw new RuntimeException("输入类型不符合");
        }
    }
}
