package c_map;
import org.junit.Test;
import z_tools.CollectionNote;

import javax.print.attribute.standard.NumberOfInterveningJobs;
import java.util.*;
@CollectionNote("关于Map遍历的实例")
public class MapTravers {
    @Test
    public void TraversAllValues(){
        HashMap map = new HashMap();
        map.put("河南",41);
        map.put("江苏",32);
        map.put("山东",34);
        map.put("浙江",33);
        //1.values方法获取所有value数据
        //2.通过Collection方法粗放
        //3.并对collection1方法进行遍历
        Collection mapV = map.values();
        for (Object obj : mapV) {
            System.out.println(obj);
        }
    }
    @Test
    public void TraversAllKeys(){
        HashMap map = new HashMap();
        map.put("河南",41);
        map.put("江苏",32);
        map.put("山东",34);
        map.put("浙江",33);
        Set set = map.keySet();
        for(Object obj:set){
            System.out.println(obj);
        }
    }
    //键值对同时遍历的两种方法
    @Test
    public void GetMethod(){
        //1.创建Map集合
        Map<String,Integer> datas = new HashMap<>();
        datas.put("Po",13);
        datas.put("Lo",14);
        datas.put("Ho",15);
        Set<String> keySet = datas.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()){
            //key值
            Object key = iterator.next();
            //通过key获取value
            Object value = datas.get(key);
            System.out.println(key+"-->"+value);
        }
    }

    @Test
    public void EntrySet(){
        Map<String,Integer> in=new HashMap<>();
        in.put("张三",23);
        in.put("李四",24);
        in.put("王五",25);
        Set<Map.Entry<String, Integer>> entries = in.entrySet();
        Iterator<Map.Entry<String, Integer>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Integer> next = iterator.next();
            Map.Entry mey = next;
            System.out.println(mey.getKey()+"->"+mey.getValue());
        }
        //定义一个临时变量 类型为Entry对象   entrySet获得元素
        for (Map.Entry<String,Integer> uc :in.entrySet()){
            System.out.println(uc.getKey()+"="+uc.getValue());
        }
    }
}
