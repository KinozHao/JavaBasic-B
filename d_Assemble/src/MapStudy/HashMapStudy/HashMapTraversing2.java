package MapStudy.HashMapStudy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
//Map集合的遍历之键值对对象找键和值
public class HashMapTraversing2 {
    public static void main(String[] args) {
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
