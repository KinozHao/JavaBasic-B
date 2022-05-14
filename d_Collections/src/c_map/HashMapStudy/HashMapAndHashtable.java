package c_map.HashMapStudy;
//HashMap和Hashtable的区别
import java.util.HashMap;
import java.util.Hashtable;

public class HashMapAndHashtable {
    public static void main(String[] args) {

        HashMap<String,Integer> hm=new HashMap<>();
        hm.put(null,11);
        hm.put("good",null);
        System.out.println(hm);

        Hashtable<String,Integer> ht=new Hashtable<>();
        ht.put(null,11);
        ht.put("1",null);
        System.out.println(ht);
    }
}
