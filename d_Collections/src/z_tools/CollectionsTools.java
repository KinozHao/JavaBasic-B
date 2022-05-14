package z_tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
//和Arrays一样Collections作为一个工具类(它们都是单列模式的体现)
public class CollectionsTools {
    @Test
    @CollectionNote("Collections查找方法")
    public void binarySearch() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
    }
    @Test
    @CollectionNote("Collections排序方法")
    public void SortMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");al.add("g");
        al.add("e");al.add("c");
        System.out.println(al); //初始
        Collections.sort(al);   //排序
        System.out.println(al); //排序后
    }
    @Test
    @CollectionNote("一些其他的常用方法")
    public void OtherMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.max(al));    //max最大大元素
        System.out.println(Collections.min(al));    //min最小的元素
        Collections.reverse(al);                    //数组反转
        System.out.println(al);
        Collections.shuffle(al);                    //数组随机改变位置
        System.out.println(al);
    }
}
