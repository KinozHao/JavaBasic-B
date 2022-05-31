package c_map.map_test;

import java.util.HashMap;

public class InformTest {
    public static void main(String[] args) {
        //定义第一组双列集合
        HashMap<InformData,String> area_a = new HashMap<>();
        area_a.put(new InformData("苏锡",30),"上城区");
        area_a.put(new InformData("苏轼",18),"萧山区");
        area_a.put(new InformData("李白",35),"滨江区");

        //定义第二组双列集合
        HashMap<InformData,String> area_b = new HashMap<>();
        area_b.put(new InformData("李宗泽",3),"城西");
        area_b.put(new InformData("戚继光",2),"稠江");
        area_b.put(new InformData("驼宾王",1),"福田");

        //定义一个城市合集 泛型嵌套
        HashMap<HashMap<InformData,String>,String> city =new HashMap<>();
        city.put(area_a,"浙江省杭州市");
        city.put(area_b,"浙江省义乌市");

        //遍历双列集合、
        //city.keySet()表示双列集合中键的集合
        for (HashMap<InformData,String> key: city.keySet()){
            //get(key)是根据键对象获得值对象
            String value= city.get(key);

            //遍历键的双列集合对象
            //key.keySet是获得集合中所有人物信息的对象
            for (InformData key2 : key.keySet()){
                String value2=key.get(key2);
                //key代表的是人   value2代表的地区    value代表的是省份城市
                System.out.println(key+"==="+value2+"==="+value);

            }
        }

    }
}
