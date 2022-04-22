package MapStudy.HashMapStudy;

import java.util.HashMap;

public class HashMapKeys {
    public static void main(String[] args) {
        HashMap<String, Hero> to=new HashMap<>();
        to.put("Num1",new Hero("Acer"));
        to.put("Num2",new Hero("Timo"));
        System.out.println(to.get("Num1"));
        System.out.println(to.get("Num2"));
    }
}
