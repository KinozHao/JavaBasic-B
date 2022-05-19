package b_list.list_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/*
Question:
1.A Collection param save 20 pcs RandomNums
2.Just filter even elements
3.Another Collection param save the even elements
 */
class ReturnTest {
    public static void main(String[] args) {
        ArrayList<Integer> BigList=new ArrayList();
        Random random=new Random();

        //RandomNumCircle1-100 Just Obtain 20pcs
        for (int i = 0; i < 20; i++) {
            BigList.add(random.nextInt(100)+1);
        }


        ArrayList<Integer> result = RandomEvenNum(BigList);
        System.out.println("Total EvenNum: "+result.size());
        for (int j = 0; j < result.size(); j++) {
            System.out.println(result.get(j));
        }
    }

    //extract even nums for BigList
    public static ArrayList<Integer> RandomEvenNum(ArrayList<Integer> BList){

        ArrayList<Integer> SmallList=new ArrayList<>();

        //Check the BList num us the if Judge is even nums or not
        for (int i = 0; i < BList.size(); i++) {
            int num2 = BList.get(i);
            //If is even nums just add to the SmallList
            if (num2 % 2 == 0) {
                SmallList.add(num2);
            }
        }
        return SmallList;
    }
}
