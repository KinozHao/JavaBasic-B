package c_map;
import java.util.*;
//Map集合的遍历体现
public class MapTravers {
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
    //Map集合的遍历之键值对对象找键和值
    private static void AnotherMethod(){
        Map<String,Integer> in=new HashMap<>();
        in.put("张三",23);
        in.put("李四",24);
        in.put("王五",25);

        //Map.Entry说明Entry是Map的内部接口,将键和值封装成了Entry对象,并存储在Set集合中
        Set<Map.Entry<String,Integer>> en=in.entrySet();
        //迭代器的泛型和Set集合的泛型保持一致
        Iterator<Map.Entry<String,Integer>> it=en.iterator();
        while (it.hasNext()){           //判断集合中是否有元素
            Map.Entry<String,Integer> go=it.next(); //获取每一个key
            //Entry中的getKey/getValue 分别用来获取 键和值
            System.out.println(go.getKey()+"="+go.getValue());
        }

        //定义一个临时变量 类型为Entry对象   entrySet获得元素
        for (Map.Entry<String,Integer> uc :in.entrySet()){
            System.out.println(uc.getKey()+"="+uc.getValue());
        }
    }
}
