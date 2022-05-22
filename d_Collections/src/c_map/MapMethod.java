package c_map;

import jdk.swing.interop.SwingInterOpUtils;
import org.junit.Test;
import java.util.*;

public class MapMethod {
    @Test
    //增删改
    public void Method1() {
        HashMap go=new HashMap<>();
        go.put("Po",13);
        go.put("Lo",14);
        go.put("Ho",15);
        go.put("Ho",15333); //修改
        go.remove("Po",13); //移除
        System.out.println(go);
        System.out.println("key-value的个数:"+go.size());
        //putAll方法的体现
        HashMap go2 = new HashMap();
        go2.putAll(go);
        go2.put("HH",22);
        System.out.println(go2);
        go.clear();//清除
        System.out.println(go);
    }
    @Test
    //判断
    public void Judge(){
        HashMap map = new HashMap();
        map.put("A",0);
        map.put("B",1);
        map.put("C",2333);
        //获取指定key对应的value
        System.out.println(map.get("C"));

        //判断Map中是否包含指定key和value
        System.out.println(map.containsKey("A"));
        System.out.println(map.containsValue("2333"));
        System.out.println(map.isEmpty());  //判断是否为空

        //判断两个map中数据是否全部相等
        System.out.println(map.equals(new HashMap()));

    }

}
