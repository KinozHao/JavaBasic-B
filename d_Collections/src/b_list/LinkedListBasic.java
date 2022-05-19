package b_list;

import z_tools.CollTraver;

import java.util.LinkedList;

public class LinkedListBasic {
    public static void main(String[] args) {
        //带有first和last的方法为LinkedList特有方法
        LinkedList<LolView> elements = new LinkedList<>();
        elements.addFirst(new LolView("艾欧尼亚"));
        elements.addLast(new LolView("扭曲丛林"));
        elements.addFirst(new LolView("德玛西亚"));
        LLTraver(elements);

        //获取头/尾元素
        System.out.println(elements.getFirst());
        System.out.println(elements.getLast());

        //取出头/尾元素
        System.out.println(elements.removeFirst());
        System.out.println(elements.removeLast());

    }

    private static void LLTraver(LinkedList<LolView> data) {
        /**
         * CollTraver provide kinds of travers method
        * @see CollTraver
        * */
        CollTraver.IteratorTravers(data);
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