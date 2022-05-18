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
        //��ȡָ��Ԫ��
        System.out.println(arrayList.get(2));
        System.out.println(arrayList);
        //ָ��Ԫ���״γ��ֻ�ĩβ��������ֵ(���ظ���)
        System.out.println(arrayList.indexOf(2262));
        System.out.println(arrayList.lastIndexOf(2262));
        //ָ���������Ԫ��
        arrayList.add(0,000);
        System.out.println(arrayList);
        List<Integer> param = Arrays.asList(6, 6);
        //���param���ϵ�ָ������λ��
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
        //����ͷ������β[����ҿ�]
        System.out.println(elements.subList(1,3));
        //�Ƴ�ָ������Ԫ��
        elements.remove(2);
        //�޸�ָ������Ԫ��
        elements.set(0,666);
        System.out.println(elements);
    }

    @Test
    @CollectionNote("LinkedList���з���")
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
