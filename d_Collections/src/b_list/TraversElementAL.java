package b_list;

import org.junit.Test;
import java.util.ArrayList;

public class TraversElementAL {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("ËÎĞ¡±¦");
        list.add("Íõ»¢");
        list.add("Ğ¡ÉòÑô");
        for (int b = 0; b < list.size(); b++) {
            System.out.print(list.get(b)+"¡¤");
        }
    }
    @Test
    public void SzTransform(){
        int []num={10,40,80,25,36};
        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
