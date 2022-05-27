package z_tools;

import org.junit.Test;

import java.util.*;

//和Arrays一样Collections作为一个工具类(它们都是单列模式的体现)
public class CollectionsTools {
    @Test
    @CollectionNote("Collections排序方法")
    public void SortMethod() {
        ArrayList<String> data=new ArrayList<>();
        data.add("a");
        data.add("c");
        data.add("g");
        data.add("d");
        data.add("5");
        Collections.sort(data); //排序 默认自然排序
        System.out.println(data);
        Collections.shuffle(data);  //打乱集合元素
        System.out.println(data);
        ArrayList<String> dataB=new ArrayList<>();
        dataB.add("a");
        dataB.add("c");
        Collections.swap(dataB,0,1); //交换指定索引位置
        System.out.println(dataB);
    }

    @Test
    @CollectionNote("Collections查找方法")
    public void binarySearch() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
        //1.获取al集合的长度，通过Arrays工具类存放在一个新的集合中
        List list = Arrays.asList(new Object[al.size()]);
        //2.通过copy方法赋值集合1全部元素到集合2
        Collections.copy(list,al);
        System.out.println(list);

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
        int c = Collections.frequency(al, "c"); //相同元素出现的次数
        System.out.println(c);
    }
    @Test
    @CollectionNote("synchronized线程安全的方法")
    public void synchronizedMethod(){
        ArrayList arr = new ArrayList();
        Collection arr2 = new LinkedList();
        List list = Collections.synchronizedList(arr);
        Collection col = Collections.synchronizedCollection(arr2);
        HashMap map = new HashMap();
        Map newmap = Collections.synchronizedMap(map);
    }
}
