package b_list.ArrayList_us;

import java.util.ArrayList;

public class AITravers {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("��С��");
        list.add("����");
        list.add("С����");
        list.add("�Ա�ɽ");
        //The arrayList traversing
        for (int b = 0; b < list.size(); b++) {
            System.out.println(list.get(b));
        }
    }
}
//˳������һ������ı���
class array{
    public void method(){
        int []num={10,40,80,25,36};
        for (int k = 0; k < num.length; k++) {
            System.out.println(num[k]);
        }
    }
}
