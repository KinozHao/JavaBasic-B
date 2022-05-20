package c_map;

import org.junit.Test;
import java.util.*;

public class MapMethod {
    @Test
    public void Collections() {     //获取
        HashMap<String,Integer> map=new HashMap<>();
        map.put("Po",13);        //键对值
        map.put("Lo",14);
        map.put("Ho",15);
        Collection<Integer> integers = map.values();  //获取集合中所有值的集合
        System.out.println(integers);
    }
    @Test
    public void Judge() {   //判断
        HashMap<String,Integer> po=new HashMap<>();
        po.put("Po",13);        //键对值
        po.put("Lo",14);
        po.put("Ho",15);
        //判断是否包含
        System.out.println(po.containsKey("Po"));
        System.out.println(po.containsValue(15));
        System.out.println(po.isEmpty());   //判断是否为空
    }
    @Test
    public void putAndclear() { //添加
        HashMap<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //键对值
        go.put("Lo",14);
        go.put("Ho",15);
        System.out.println(go);
        go.clear();
        System.out.println(go);
    }

}
