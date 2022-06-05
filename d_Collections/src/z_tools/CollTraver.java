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

    //通配符的使用 表示此遍历方法可以遍历任意泛型的数据
    public static void IteratorTravers(Collection<?> c){
        //迭代器初始化调用collection下的iterator方法
        Iterator<?> ddq = c.iterator();
        //判断是否还有下一个元素
        while (ddq.hasNext()){
            /*//next让指针下移，下移以后集合位置上的元素返回
            System.out.println(ddq.next()+" ");*/
            //通配符用Object类接收
            Object obj = ddq.next();
            System.out.println(obj);
        }
    }

    public static void ForeachTravers(Collection<?> c){
        //2:foreach 底层依然是通过迭代器实现
        for (Object obj:c){
            System.out.print(obj+" ");
        }
        System.out.println();

    }
    //若使用普通for形参不可为Collection类型，因为get方法为实例类特有的
    public static void ForTravers(ArrayList<?> c){
        //3:normal for
        for (int i = 0; i < c.size(); i++) {
            System.out.println(c.get(i));
        }
    }

    @Test
    //remove mean's remove element rarelyUse。
    public void  removeMethod(){
        ArrayList alt = new ArrayList();
        alt.add("98");
        alt.add(2);
        alt.add("333");
        //1.使用remove删除指定元素
        Iterator ir = alt.iterator();
        while (ir.hasNext()){
            //调用next方法前不可调用remove
            Object obj = ir.next();
            if ("333".equals(obj)){
                ir.remove();
            }
            if ("98".equals(obj)){
                ir.remove();
            }
        }
        //2.重新遍历集合
        for (Object obj:alt){
            System.out.print(obj);
        }
    }
}
