package b_list.ArrayList_us;

import java.util.ArrayList;

public class AITravers {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        list.add("宋小宝");
        list.add("王虎");
        list.add("小沈阳");
        list.add("赵本山");
        //The arrayList traversing
        for (int b = 0; b < list.size(); b++) {
            System.out.println(list.get(b));
        }
    }
}
//顺便延伸一下数组的遍历
class array{
    public void method(){
        int []num={10,40,80,25,36};
        for (int k = 0; k < num.length; k++) {
            System.out.println(num[k]);
        }
    }
}
