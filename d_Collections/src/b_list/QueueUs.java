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
        System.out.println("ȡ����һ��Ԫ�غ�Ķ���");
        System.out.println(in);
        System.out.println("�鿴��һ��Ԫ��");  //�鿴�����ᵼ�µ�һ��Ԫ�ر�ɾ��
        System.out.println(in.peek());
    }
}
