package c_map;
import org.junit.Test;
import z_tools.CollectionNote;

import java.util.*;
@CollectionNote("键值对同时遍历的两种方法")
public class MapTraversA {
    @Test
    @CollectionNote("使用key获取value的方式")
    public void ObjectMethod(){
        //1.创建Map集合
        Map<String,Integer> data = new HashMap<>();
        data.put("Po",13);
        data.put("Lo",14);
        data.put("Ho",15);
        Set<String> sets = data.keySet();
        Iterator<String> iterator = sets.iterator();

        while (iterator.hasNext()){
            //key值
            Object key = iterator.next();
            //通过key获取value
            Object value = data.get(key);
            System.out.println(key+"-->"+value);
        }
    }

    @Test
    @CollectionNote("使用EntrySet方法")
    public void EntrySet(){
        Map<String,Integer> in = new HashMap<>();
        in.put("张三",23);
        in.put("李四",24);
        in.put("王五",25);
        //1.通过entrySet获取一个Set类型的变量
        Set<Map.Entry<String, Integer>> entries = in.entrySet();
        //2.调用迭代器
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            //3.把iterator转换为Entry类型
            Map.Entry<String, Integer> keyvalue = iterator.next();
            //4.调用Entry中方法，完成key_value的遍历
            System.out.println(keyvalue.getKey()+"->"+keyvalue.getValue());
        }
    }
    @Test
    @CollectionNote("使用增强for方法")
    public void ForeachMethod(){
        Map<String,Integer> in = new HashMap<>();
        in.put("张三",23);
        in.put("李四",24);
        in.put("王五",25);
        //foreach遍历Map数据必须用泛型指定好类型
        for (Map.Entry<String,Integer> Entry :in.entrySet()){
            System.out.println(Entry.getKey()+"="+Entry.getValue());
        }
    }
}
