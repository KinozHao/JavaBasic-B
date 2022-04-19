package Map.HashMap;

import java.util.HashMap;

public class HashMapOverview {
    public static void main(String[] args) {
        HashMap<String,String> in=new HashMap<>();
        in.put("abc","Acer");       //前面为键 后面为值
        in.put("mon","pown");
        in.put("cce","Ater");
        in.put("cce","Pros");       //key是唯一的,不可以重复的
        // 如果添加了新的元素到Map中会导致旧元素被覆盖  只留下最后的元素
        System.out.println(in.get("cce"));
    }
}
