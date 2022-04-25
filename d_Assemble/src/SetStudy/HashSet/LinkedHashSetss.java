package SetStudy.HashSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
/** @apiNote LinkedHashSet的特点
    底层为链表实现 set集合中唯一一个能保证怎么存就怎么取的集合对象
    为HashSet的子类,所以保证了元素的唯一,与HashSet原理一样
*/
public class LinkedHashSetss {
    public static void main(String[] args) {
        HashSet<String> s = new LinkedHashSet<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        s.add("g");

        System.out.println(s);
    }
}


