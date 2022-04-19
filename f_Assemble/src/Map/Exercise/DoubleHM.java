package Map.Exercise;

import Map.Exercise.DoubleHMSon;

import java.util.HashMap;

public class DoubleHM {
    public static void main(String[] args) {
        //定义一个a班的双列集合
        HashMap<DoubleHMSon,String> javaA=new HashMap<>();
        javaA.put(new DoubleHMSon("西湖",30),"上城区");
        javaA.put(new DoubleHMSon("苏轼",18),"萧山区");
        javaA.put(new DoubleHMSon("李白",25),"滨江区");

        //定义b班的双列集合
        HashMap<DoubleHMSon,String> javaB=new HashMap<>();
        javaB.put(new DoubleHMSon("李宗泽",3),"城西");
        javaB.put(new DoubleHMSon("戚继光",2),"稠江");
        javaB.put(new DoubleHMSon("驼宾王",1),"福田");

        //定义一个学校集合存放a和b
        HashMap<HashMap<DoubleHMSon,String>,String> Kinoz=new HashMap<>();
        Kinoz.put(javaA,"杭州院校");
        Kinoz.put(javaB,"义乌院校");

        //遍历双列集合
        for (HashMap<DoubleHMSon,String> key: Kinoz.keySet()){  //kinoz.keyset()表示双列集合中键的集合
            String value=Kinoz.get(key);            //get(key)是根据键对象获得值对象

            //遍历键的双列集合对象
            for (DoubleHMSon key2 : key.keySet()){  //key.keyset是获得集合中所有学生键的对象
                String value2=key.get(key2);
                //key代表的是人   value2代表的归属地    value代表的是校区
                System.out.println(key+"="+value2+"="+value);
            }
        }

    }
}
