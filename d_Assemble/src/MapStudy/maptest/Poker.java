package MapStudy.maptest;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //创建一副扑克牌
        String [] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String [] color={"方块","梅花","心形","黑桃"};

        //拼接花色
        ArrayList<String> pokers=new ArrayList<>();
        for (String s1 : num){
            for (String s2 : color){
                pokers.add(s1.concat(s2));
            }
        }
        pokers.add("大王");
        pokers.add("小王");
        System.out.println(pokers.size());  //确认一下牌数量对不对
        //洗牌
        Collections.shuffle(pokers);
        System.out.println(pokers);

        ArrayList<String> Jack = new ArrayList<>();
        ArrayList<String> Alisa = new ArrayList<>();
        ArrayList<String> Me = new ArrayList<>();
        ArrayList<String> Cho = new ArrayList<>();

        //发牌
        for (int i = 0; i < pokers.size(); i++) {
            if (i >= pokers.size() -3){
                Cho.add(pokers.get(i));
            }else if (i % 3 == 0){
                Jack.add(pokers.get(i));
            }else if (i % 3 == 1){
                Alisa.add(pokers.get(i));
            }else {
                Me.add(pokers.get(i));
            }
        }
        //看牌
        System.out.println(Jack);
        System.out.println(Alisa);
        System.out.println(Me);
        System.out.println(Cho);
    }
}
