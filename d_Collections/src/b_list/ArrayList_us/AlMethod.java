package b_list.ArrayList_us;
/*
    public boolean add(E e):向集合当中添加元素,参数的类型和泛型一致.
    public E get（int index):从集合当中获取元素,参数是索引编号,返回值是对应位置的元素.
    public E remove(int index):从集合当中删除元素,参数是索引编号,返回值是被删掉的元素.
    public Int size(): 获取集合的尺寸长度,返回值是集合中包含的元素个数。
*/
import java.util.ArrayList;

public class AlMethod {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//printf now nothing just[]
        //add element to the array
        boolean success=list.add("Apple");//boolean determination the element T/F
        System.out.println(list);
        System.out.println("Is the element's ture:"+success);
        //从集合中获得元素是get,索引值从o开始
        list.add("Honor");
        list.add("Huawei");
        list.add("Oneplus");
        list.add("Mi");
        System.out.println(list);   //打印的是所有的集合参数
        String name=list.get(2);    //单独调用了集合中的第二个参数
        System.out.println("The second is:"+name);  //单独调用了第二个元素
        //从集合中删除元素是remove,索引值是从0开始
        String remove=list.remove(3);       //删除第三个元素
        System.out.println("We remove the"+remove); //打印删除的第三个元素是什么
        System.out.println(list);           //移除第三个元素后的集合
        //获取集合的长度注:索引值是从0开始的所以长度为4
        int num=list.size();            //把长度赋值给num
        System.out.println("The arrays size:"+num);        //打印长度值
    }
}
