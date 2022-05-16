package b_list;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        LinkedList<LolView> elements = new LinkedList<>();
        elements.addFirst(new LolView("艾欧尼亚"));       //最前面添加对象
        elements.addLast(new LolView("扭曲丛林"));           //最后面添加对象
        elements.addFirst(new LolView("德玛西亚"));
        Method(elements);

        //获取头/尾元素
        System.out.println(elements.getFirst());
        System.out.println(elements.getLast());

        //取出头/尾元素
        System.out.println(elements.removeFirst());
        System.out.println(elements.removeLast());

    }

    private static void Method(LinkedList<LolView> in) {
        /*//1.Normal for
        for (int i = 0; i < in.size(); i++) {
            System.out.print(in.get(i)+" ");
        }
        System.out.println();

        //2.PlusVersion for
        System.out.println();
        for (LOL H:in){
            System.out.print(H+" ");
        }*/

        //3.Generic
        Iterator iterator = in.iterator();
        while (iterator.hasNext()){
            System.out.print(iterator.next()+" ");
        }
        System.out.println();

    }
}
class LolView {
    public String name;

    public LolView(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}