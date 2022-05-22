package c_map;

import org.junit.Test;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

/**
 * @author kinoz
 * @Date 2022/5/22 - 20:21
 * @apiNote
 */
public class MapTraversB {
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
}
