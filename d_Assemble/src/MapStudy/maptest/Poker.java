package MapStudy.maptest;

import java.util.ArrayList;
import java.util.Collections;

public class Poker {
    public static void main(String[] args) {
        //����һ���˿���
        String [] num={"A","2","3","4","5","6","7","8","9","10","J","Q","K"};
        String [] color={"����","÷��","����","����"};

        //ƴ�ӻ�ɫ
        ArrayList<String> pokers=new ArrayList<>();
        for (String s1 : num){
            for (String s2 : color){
                pokers.add(s1.concat(s2));
            }
        }
        pokers.add("����");
        pokers.add("С��");
        System.out.println(pokers.size());  //ȷ��һ���������Բ���
        //ϴ��
        Collections.shuffle(pokers);
        System.out.println(pokers);

        ArrayList<String> Jack = new ArrayList<>();
        ArrayList<String> Alisa = new ArrayList<>();
        ArrayList<String> Me = new ArrayList<>();
        ArrayList<String> Cho = new ArrayList<>();

        //����
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
        //����
        System.out.println(Jack);
        System.out.println(Alisa);
        System.out.println(Me);
        System.out.println(Cho);
    }
}
