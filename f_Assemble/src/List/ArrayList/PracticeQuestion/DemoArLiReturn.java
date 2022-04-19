package List.ArrayList.PracticeQuestion;

import java.util.ArrayList;
import java.util.Random;

/*
Question:
Make a Big ArrayList to save 20 pcs Random Nums,and than filter alla the
even elements,Ant Take the even elements to the Small ArrayList
Thought:
1:New a Big ArrayList,For using to save the int num:<Integer>
2:If's random num Just using:Random and the nextInt
3:circle 20 pcs,Send the Random num to the big ArrayList:For circle add method
4:definition a method It for filter(Shaixuan)
Filter means:According the bigArrayList,Filter's we needed element.and get
the smallArrayList
Three elements:
NUM1:Return Types(ArrayList SmallList)[We are not sure the element nums]
NUM2:Method Name(According yourself)here using:getSmallList
NUM3:Parameter List(CanShu LieBiao) (ArrayList BigList)[Here have 20 random nums]
5:Judge(if)is it even?:(num%2==0)
6:If is even num take it to SmallArrayList else just do nothing
 */
class DemoListReturn {
    public static void main(String[] args) {
        ArrayList<Integer> biglist=new ArrayList<>();   //Make a biglist first
        Random r=new Random();  //Random numbers is name:r
        for (int i = 0; i < 20; i++) { //Circle 20 pcs
            int num=r.nextInt(100)+1;   //The Random numbers have parameter
            biglist.add(num);             //Add the Random numbers to the biglist
        }
        ArrayList<Integer> result =getSmallist(biglist);
        System.out.println("All of the even num have:"+result.size()+" pcs");
        for (int k = 0; k < result.size(); k++) {
            System.out.println(result.get(k));
        }
    }
    //This method receive Biglist Parameter
    //Return smalllist result
    public static ArrayList<Integer> getSmallist(ArrayList<Integer> biglist){
        //New a set to save the even nums
        ArrayList<Integer> smalllist=new ArrayList<>();
        //Check the biglist num us the if Judege is even nums or not
        for (int i = 0; i < biglist.size(); i++) {
            int num2 = biglist.get(i);
            //If is even nums just add to the smalllist
            if (num2 % 2 == 0) {
                smalllist.add(num2);
            }//If not do nothing
        }
        return smalllist;       //return the Parameter
    }
}
