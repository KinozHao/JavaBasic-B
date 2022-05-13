package map_us.HashMapStudy;
import java.util.*;
//Map集合的遍历之键找值
//通过查看Map集合的api发现没有iterator方法,那么双列集合如何迭代
public class HashMapTraversing {
    public static void main(String[] args) {
        //迭代器
        Map<String,Integer> go=new HashMap<>();
        go.put("Po",13);        //键对值
        go.put("Lo",14);
        go.put("Ho",15);
        Set<String> keySet=go.keySet();     //获取所有的key
        Iterator<String> in=keySet.iterator();  //获取迭代器
        while (in.hasNext()){                   //判断集合中是否有元素
            String key=in.next();               //获取每一个key
            Integer value=go.get(key);          //根据key获取value
            System.out.println(key+"-->"+value);    //结果
        }
        //增强for
        for (String key:go.keySet()){           //go.keySet是所有key的集合
            System.out.println(key+"-->"+go.get(key));
        }
    }
}
