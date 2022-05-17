package z_tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @apiNote The class provide three collection travers method.
 * Let it make as singleton,just provide one method let other class us.
 * Attention:iterator just with collection is useful.
 * If you want travers Map,you need another method to implement it.
 * @see Iterator
 * @see java.util.List
 * @since 1.8
 * @author kinoz
 * */
@CollectionNote("Iterator use|foreach use")
public class CollTraver {
    //For JunitTest don't private constructor
    public CollTraver(){

    }

    private final static CollTraver ibc = new CollTraver();

    public CollTraver getIbc(){
        return ibc;
    }

    public static void IteratorTravers(Collection c){
        //��������ʼ������collection�µ�iterator����
        Iterator ddq = c.iterator();
        //�ж��Ƿ�����һ��Ԫ��
        while (ddq.hasNext()){
            //next��ָ�����ƣ������Ժ󼯺�λ���ϵ�Ԫ�ط���
            System.out.println(ddq.next());
        }
    }

    public static void ForeachTravers(Collection c){
        //2:foreach �ײ���Ȼ��ͨ��������ʵ��
        for (Object obj:c){
            System.out.print(obj+" ");
        }

    }
    public static void ForTravers(Collection c){
        Iterator ddq = c.iterator();
        for (int i = 0; i < c.size(); i++) {
            System.out.println(ddq.next());
        }
    }

    @Test
    //remove mean's remove element rarelyUse��
    public void  removeMethod(){
        ArrayList alt = new ArrayList();
        alt.add("98");
        alt.add(2);
        alt.add("333");
        //1.ʹ��removeɾ��ָ��Ԫ��
        Iterator ir = alt.iterator();
        while (ir.hasNext()){
            //����next����ǰ���ɵ���remove
            Object obj = ir.next();
            if ("333".equals(obj)){
                ir.remove();
            }
            if ("98".equals(obj)){
                ir.remove();
            }
        }
        //2.���±�������
        for (Object obj:alt){
            System.out.print(obj);
        }
    }
}
