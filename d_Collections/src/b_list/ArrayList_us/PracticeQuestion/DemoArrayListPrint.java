package b_list.ArrayList_us.PracticeQuestion;

import java.util.ArrayList;
/*
Question:
Make a Arraylist Method for the customer design(ArrayList Type fot the num)
using"{}"circle the Arraylist,using the "@" separate the element
Ect:{element@element@element}
 */
public class DemoArrayListPrint {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("С��");
        list.add("��Ϊ");
        list.add("�ȸ�");
        list.add("����");
        System.out.println(list);
        printArraylist(list);
    }
    public static void printArraylist(ArrayList<String>list){
        //{С��@��Ϊ@�ȸ�@����}
        System.out.print("{");
        for (int king = 0; king < list.size(); king++) {
            String name=list.get(king);
            if (king==list.size()-1) {
                System.out.println(name + "}");
            }else{
        System.out.print(name+"@");
            }
        }
    }
}
