package CollectionStudy;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        SortMethod();
        binarySearch();
        OtherMethod();
    }

    private static void OtherMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(Collections.max(al));    //max最大大元素
        System.out.println(Collections.min(al));    //min最小的元素
        Collections.reverse(al);                    //数组反转
        System.out.println(al);
        Collections.shuffle(al);                    //数组随机改变位置
        System.out.println(al);
    }

    private static void binarySearch() {    //查找方法
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
    }

    private static void SortMethod() {      //排序方法
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(al); //初始
        Collections.sort(al);   //排序
        System.out.println(al); //排序后
    }
}
