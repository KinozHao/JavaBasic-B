package map_us.maptest;

import java.util.HashMap;

//统计字符串中每个字符出现的次数
public class Nums {
    public static void main(String[] args) {
        //定义一个字符串把字符串转换为字符数组;
        String str = "abccbaabccba";
        char[] arr = str.toCharArray();

        //定义双列集合,存放字符串中字符以及字符出现的次数
        HashMap<Character, Integer> hm = new HashMap<>();

        //遍历字符数组中的每一个字符,并将字符存放在双列集合中
        for (char c:arr){
            //if写法
        /*for (char c:arr){
            if (! hm.containsKey(c)){       //如果不包含这个key
                hm.put(c,1);
                }else{                      //如果包含key的话就每次加1存进来
                    hm.put(c,hm.get(c)+1);
                }
            }*/
        //三元运算符的写法
        hm.put(c, !hm.containsKey(c) ? 1 : hm.get(c)+1);
        }
        //进行打印结果
       for (Character key:hm.keySet()){
           System.out.println(key+"--->"+hm.get(key));
       }

    }
}
