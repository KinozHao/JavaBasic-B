package GenericStudy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Traversing {
    public static void main(String[] args) {
        System.out.println("forѭ������");
        forCircle();
        System.out.println();
        System.out.println("iterator����");
        Iterator();
        System.out.println();
        System.out.println("for��ǿ�汾����");
        PlusForCircle();
        System.out.println();

    }

    //1:Iterator��hasNext��next������
    private static void Iterator() {
        List<Integer> INN=new ArrayList<>();
        INN.add(1);
        INN.add(2);
        INN.add(3);
        Iterator num= INN.iterator();
        while (num.hasNext()){
            System.out.print(num.next()+" ");
        }
    }
    //2:��ǿ��forѭ������
    private static void PlusForCircle() {
        List<Integer> Go=new ArrayList<>();
        Go.add(1);
        Go.add(2);
        Go.add(3);
        for (Integer num:Go){
            System.out.print(num+" ");
        }
    }
    //3:forѭ������
    private static void forCircle() {
        List<Integer> in=new ArrayList<>();
        in.add(1);
        in.add(2);
        in.add(3);
        for (int i = 0; i < in.size(); i++) {
            System.out.print(in.get(i)+" ");
        }
    }
}
