package b_list;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class QueueUs {
    public static void main(String[] args) {
        Queue<LolView> in = new LinkedList<>();
        in.offer(new LolView("ace"));
        in.offer(new LolView("efg"));
        in.offer(new LolView("gor"));
        System.out.println(in.getClass());

        System.out.println(in);

        System.out.println(in.poll());
        System.out.println("取出第一个元素后的队列");
        System.out.println(in);
        System.out.println("查看第一个元素");  //查看并不会导致第一个元素被删除
        System.out.println(in.peek());
    }
}
