package map_us.HashMapStudy;

import java.util.HashMap;
//键为对象的时候键的唯一性还存在不存在
public class ObjectKey {
    public static void main(String[] args) {
        HashMap<Student,String> in=new HashMap<>();
        in.put(new Student("Lee",30),"Shanghai");
        in.put(new Student("Lee",23),"Tokyo");
        in.put(new Student("Ho",12),"Paris");
        System.out.println(in);
    }
}
