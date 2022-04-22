package MapStudy.HashMapStudy;

import java.util.Collection;
import java.util.HashMap;

public class HashMapMethod {
    public static void main(String[] args) {
        putAndclear();
        Judge();
        Collections();
    }

    private static void Collections() {     //获取
        HashMap<String,Integer> j=new HashMap<>();
        j.put("Po",13);        //键对值
        j.put("Lo",14);
        j.put("Ho",15);
        Collection<Integer> in=j.values();  //获取集合中所有值的集合
        System.out.println(in);
    }

    private static void Judge() {   //判断
        HashMap<String,Integer> po=new HashMap<>();
        po.put("Po",13);        //键对值
        po.put("Lo",14);
        po.put("Ho",15);
        //判断是否包含
        System.out.println(po.containsKey("Po"));
        System.out.println(po.containsValue(15));
        System.out.println(po.isEmpty());   //判断是否为空
    }

    private static void putAndclear() { //添加
        HashMap<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //键对值
        go.put("Lo",14);
        go.put("Ho",15);
        System.out.println(go);
        go.clear();
        System.out.println(go);
    }
}
