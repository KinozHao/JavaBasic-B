package b_list;

import org.junit.Test;
import java.util.ArrayList;

public class TraversElementAL {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("ÀŒ–°±¶");
        list.add("Õıª¢");
        list.add("–°…Ú—Ù");
        for (Object obj : list){
            System.out.print(obj+" ");
        }
    }
    @Test
    public void SzTransform(){
        int []num={10,40,80,25,36};
        for (int i : num) {
            System.out.print(i+" ");
        }
    }
}
