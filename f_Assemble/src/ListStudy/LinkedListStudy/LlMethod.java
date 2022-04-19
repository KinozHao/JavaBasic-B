package ListStudy.LinkedListStudy;

import java.util.Iterator;
import java.util.LinkedList;

public class LlMethod {
    public static void main(String[] args) {
        LinkedList<LOL> in=new LinkedList<>();
        in.addFirst(new LOL("Acer"));       //最前面添加对象
        in.addLast(new LOL("d"));           //最后面添加对象
        in.addFirst(new LOL("Pro"));
        Method(in);
        System.out.println();

        System.out.println(in.getFirst());      //得到开头对象
        System.out.println(in.getLast());       //得到结尾对象

        //取出会导致对象被删除
        System.out.println(in.removeFirst());   //取出
        System.out.println(in.removeLast());    //取出

        Iterator Go=in.iterator();              //取出会导致对象删除
        while (Go.hasNext()){
            System.out.println(Go.next());
        }
    }

    private static void Method(LinkedList<LOL> in) {        //三种方法的遍历
        for (int i = 0; i < in.size(); i++) {       //普通的for
            System.out.print(in.get(i)+" ");
        }

        System.out.println();
        Iterator Go=in.iterator();      //Generic
        while (Go.hasNext()){
            System.out.print(Go.next()+" ");
        }

        System.out.println();           //for增强
        for (LOL H:in){
            System.out.print(H+" ");
        }
    }
}
