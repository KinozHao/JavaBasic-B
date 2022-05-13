package GenericStudy;

import java.util.ArrayList;
import java.util.List;

public class ListBasic {
    public static void main(String[] args) {
        //List本身是一个接口 只能通过它的实例类去造对象
        List list = new ArrayList();

        //添加一个自定义对象到集合中
        list.add(new LolView("艾伦","寒冰箭"));

        System.out.println(list);
    }
}
