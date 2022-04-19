package List.LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class LlQueueMethod {
    public static void main(String[] args) {
        List<LOL> an=new LinkedList<>();

        Queue<LOL> in=new LinkedList<>();
        in.offer(new LOL("ace"));
        in.offer(new LOL("efg"));
        in.offer(new LOL("gor"));

        System.out.println(in);

        System.out.println(in.poll());
        System.out.println("取出第一个元素后的队列");
        System.out.println(in);
        System.out.println("查看第一个元素");  //查看并不会导致第一个元素被删除
        System.out.println(in.peek());
    }
}
