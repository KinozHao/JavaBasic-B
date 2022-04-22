package ListStudy.ArrayListStudy.PracticeQuestion;

import java.util.ArrayList;
import java.util.Random;

/*
Question:
Make six random number add to ArrayList without Traversing the ArrayList

Thought:
1 We need six number,Make a ArrayList first <Integer>
2 How to make six number? Just using the Random Key Word
3 Cycle 6's get 6 random number:for cycle
4 We need transfer in the cycle:r.nextInt(int n) ectnumis:33, 0~32 overall+1 is the 1~33
5 Add the number to the ArrayList: add
6 Traversing the ArrayList
 */
public class DemoArrayListRandom {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        Random r=new Random();
        for (int i = 0; i < 6; i++) {
            int num=r.nextInt(33)+1;
            list.add(num);
            System.out.println(num);
        }
        //Traversing
        for (int a = 0; a < list.size(); a++) {
            System.out.println(list.get(a));
        }
    }
}
