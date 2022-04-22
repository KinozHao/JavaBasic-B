package GenericStudy;
import java.util.ArrayList;
import java.util.List;
/** @apiNote
 * 没有泛型的弊端
 * 如果你要存储了10个英雄
 * 存放1个武器的时候就很麻烦
 * 武器还需要进行强转才可以使用
 * 时间长了可能记不清楚是什么类型的对象了
 * */
public class GenericBasic {
        public static void main(String[] args) {
            WithGeneric();
            NoneGeneric();
        }

    private static void NoneGeneric() {

        List all = new ArrayList();
        all.add(new LolView("剑圣"));
        all.add("剑圣长刀");
        System.out.println(all);

    }

    private static void WithGeneric() {
        //规定了泛型类型为LOLView就只能写里面规定的参数
        List<LolView> lol = new ArrayList<>();
        lol.add(new LolView("提莫","毒液竹管"));
        //lol.add("大砍刀");
        System.out.println(lol);
    }
}
