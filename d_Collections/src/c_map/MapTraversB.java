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
        map.put("����",41);
        map.put("����",32);
        map.put("ɽ��",34);
        map.put("�㽭",33);
        //1.values������ȡ����value����
        //2.ͨ��Collection�����ַ�
        //3.����collection1�������б���
        Collection mapV = map.values();
        for (Object obj : mapV) {
            System.out.println(obj);
        }
    }
    @Test
    public void TraversAllKeys(){
        HashMap map = new HashMap();
        map.put("����",41);
        map.put("����",32);
        map.put("ɽ��",34);
        map.put("�㽭",33);
        Set set = map.keySet();
        for(Object obj:set){
            System.out.println(obj);
        }
    }
}
