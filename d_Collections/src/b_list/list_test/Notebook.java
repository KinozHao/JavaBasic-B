package b_list.list_test;


import java.util.ArrayList;
import java.util.Random;

public class Notebook {
    public static void main(String[] args) {
        ArrayList<Integer> big=new ArrayList<>();
        Random s=new Random();
        for (int i = 0; i < 20; i++) {
            int num=s.nextInt(50)+1;
            big.add(num);
        }
        ArrayList<Integer> result=getslist(big);
        System.out.println("ALL OF THIS:"+result.size());
        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }
    }
    public static ArrayList<Integer> getslist(ArrayList<Integer> big){
        ArrayList<Integer> xiao=new ArrayList<>();
        for (int i = 0; i < big.size(); i++) {
            int num=big.get(i);     //把big集合的数组赋值给num
            if(num%2 ==0){
                xiao.add(num);
            }
        }
        return xiao;
    }
}