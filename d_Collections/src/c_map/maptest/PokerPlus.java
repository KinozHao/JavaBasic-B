package c_map.maptest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeSet;

public class PokerPlus {
    public static void main(String[] args) {
        System.out.println("���ֶ�����:");
        //����һ���˿���
        String [] num={"3","4","5","6","7","8","9","10","J","Q","K","A","2"};
        String [] color={"����","÷��","����","����"};

        //����HashMap���ϴ���ƺͶ�Ӧ�������� ArrayList���ϴ��������
        HashMap<Integer,String> hm=new HashMap<>();
        ArrayList<Integer> list=new ArrayList<>();
        int index=0;    //����һ��������0��ʼ

        //for��ǿǶ��ѭ�� �����ƺͶ�Ӧ��ɫ
        for (String s1 : num){
            for (String s2 : color){
                hm.put(index,s2.concat(s1));    //ƴ�Ӻõ����ݺ���������HashMap��
                list.add(index);                //��������ӽ�ȥ
                index++;                        //ÿ������
            }
        }
        //��Ӵ�С��
        hm.put(index,"King");
        list.add(index);        //��Ӵ�������
        index++;                //��ΪҪ���С������˵��Ҫ����һ��
        hm.put(index,"Queen");
        list.add(index);        //���С������

        //ϴ��    shuffle�������˳��
        Collections.shuffle(list);

        //����   TreeSet�������õ�
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
        lookpoker(hm,Jack,"������");
        lookpoker(hm,Alisa,"�߷Ƿ�");
        lookpoker(hm,Me,"��");
        lookpoker(hm,Dipai,"����");

    }
    /*
    * ����
    * 1 ����ֵ����Ϊvoid
    * 2 �����б�HashMap TreeSet String name
    * */
    public static void lookpoker(HashMap<Integer,String> hm,TreeSet<Integer> ts,String name){
        System.out.println(name+"������:");
        for (Integer i : ts){
            System.out.print(hm.get(i) +" ");
        }
        System.out.println();
    }
}
