package Map.Exercise;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerPlus {
    public static void main(String[] args) {
        System.out.println("欢乐斗地主:");
        //创建一副扑克牌
        String [] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String [] color={"方块","梅花","心形","黑桃"};

        //创建HashMap集合存放牌和对应的索引数 ArrayList集合存放索引数
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int index=0;    //定义一个索引从0开始

        //for增强嵌套循环 存入牌和对应花色
        for (String s1 : num){
            for (String s2 : color){
                hm.put(index,s2.concat(s1));    //拼接好的数据和索引存入HashMap中
                list.add(index);                //把索引添加进去
                index++;                        //每次自增
            }
        }
        //添加大小王
        hm.put(index,"King");
        list.add(index);        //添加大王索引
        index++;                //因为要添加小王所以说还要自增一次
        hm.put(index,"Queen");
        list.add(index);        //添加小王索引

        //洗牌    shuffle随机打乱顺序
        Collections.shuffle(list);

        //发牌   TreeSet是排序用的
        TreeSet<Integer> Jack=new TreeSet<>();
        TreeSet<Integer> Alisa=new TreeSet<>();
        TreeSet<Integer> Me=new TreeSet<>();
        TreeSet<Integer> Dipai=new TreeSet<>();

        for (int i = 0; i < list.size(); i++) {
            if (i >= list.size()-3){
                Dipai.add(list.get(i));
            }else if (i % 3 == 0){
                Jack.add(list.get(i));
            }else if (i % 3 == 1){
                Alisa.add(list.get(i));
            }else {
                Me.add(list.get(i));
            }
        }
        lookpoker(hm,Jack,"成周周");
        lookpoker(hm,Alisa,"高非凡");
        lookpoker(hm,Me,"我");
        lookpoker(hm,Dipai,"底牌");

    }
    /*
    * 看牌
    * 1 返回值类型为void
    * 2 参数列表HashMap TreeSet String name
    * */
    public static void lookpoker(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.println(name+"的牌是:");
        for (Integer i : ts){
            System.out.print(hm.get(i) +" ");
        }
        System.out.println();
    }
}
