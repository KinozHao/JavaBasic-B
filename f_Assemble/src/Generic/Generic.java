package Generic;

import java.util.ArrayList;
import java.util.List;

public class Generic {
        public static void main(String[] args) {
            WithGeneric();
            NoneGeneric();
        }

    private static void NoneGeneric() {
        /*没有泛型的弊端 如果你要存储了10个英雄 存放1个武器的时候就很麻烦 武器还需要进行强转才可以使用
        时间长了可能记不清楚是什么类型的对象了*/
        List all=new ArrayList();
        all.add(new LegendOfLegens("Acer"));
        all.add("多伦宝剑");
        System.out.println(all);
    }

    private static void WithGeneric() {
        List<LegendOfLegens> lol=new ArrayList<>();
        lol.add(new LegendOfLegens("Timo"));
        // lol.add(1);   无效的添加 因为泛型中已经指定了 这个集合只能添加LengendOfLegens对象的数据
        System.out.println(lol);
    }
}
