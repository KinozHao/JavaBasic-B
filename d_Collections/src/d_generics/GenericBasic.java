package d_generics;

import org.junit.Test;

import java.lang.invoke.VarHandle;
import java.util.*;

/** @apiNote
 * 让一个集合只存储一种数据类型的数据
 * Generic是一种规范
 * */
public class GenericBasic {
    @Test
    public void CollectionGeneric() {
        //指定泛型的类型，避免出现类型不安全问题
        Vector<String> vector = new Vector();
        vector.add("俺的圣剑");
        vector.add("信息学院");
        vector.add("机械学院");
        //保证数据安全
        //vector.add(123);
        Iterator<String> iterator = vector.iterator();
        while (iterator.hasNext()){
            String datas = iterator.next();
            System.out.println(datas);
        }
    }
    @Test
    public void MapGeneric(){
        HashMap<String, Integer> datas = new HashMap<>();
        datas.put("苹果",29);
        datas.put("凤梨",21);
        datas.put("鸡爪",51);
        Set<Map.Entry<String, Integer>> set = datas.entrySet();
        //泛型的嵌套，Entry为Map接口的内部接口
        Iterator<Map.Entry<String, Integer>> ddq = set.iterator();
        while (ddq.hasNext()){
            Map.Entry<String, Integer> e = ddq.next();
            //调用Entry接口中的方法
            Integer value = e.getValue();
            String key = e.getKey();
            System.out.println(key+"-->"+value);
        }
    }
}
