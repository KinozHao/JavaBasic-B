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
        list.add("小米");
        list.add("华为");
        list.add("谷歌");
        list.add("三星");
        System.out.println(list);
        printArraylist(list);
    }
    public static void printArraylist(ArrayList<String>list){
        //{小米@华为@谷歌@三星}
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
