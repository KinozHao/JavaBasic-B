package b_list;

import org.junit.Test;
import z_tools.CollectionNote;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/18 - 21:59
 * @apiNote
 */
public class ListMethod {
    @Test
    public void MethodA(){
        ArrayList<Integer> arrayList = new ArrayList();
        arrayList.add(2262);
        arrayList.add(6343);
        arrayList.add(1342);
        //获取指定元素
        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
        //指定元素首次出现或末尾出现索引值(可重复性)
        System.out.println(arrayList.indexOf(2262));
        System.out.println(arrayList.lastIndexOf(2262));
        //指定索引添加元素
        arrayList.add(0,000);
        System.out.println(arrayList);
        List<Integer> param = Arrays.asList(6, 6);
        //添加param集合到指定索引位置
        arrayList.addAll(0,param);
        System.out.println(arrayList);
    }
    @Test
    public void MethodB(){
        ArrayList<Integer>  elements = new ArrayList();
        elements.add(2262);
        elements.add(6343);
        elements.add(1342);
        elements.add(14422);
        elements.add(9742342);
        Iterator<Integer> iterator = elements.iterator();
        //包括头不包括尾[左闭右开]
        System.out.println(elements.subList(1,3));
        //移除指定索引元素
        elements.remove(2);
        //修改指定索引元素
        elements.set(0,666);
        System.out.println(elements);
    }

    @Test
    @CollectionNote("LinkedList独有方法")
    public void Others(){
        LinkedList<Integer> List = new LinkedList();
        List.add(2262);
        List.add(6343);
        List.add(1342);
        List.addFirst(666);
        List.addLast(888);
        System.out.println(List.getFirst());
        System.out.println(List.getLast());
        System.out.println(List.removeFirst());
        System.out.println(List.removeLast());

    }
}
