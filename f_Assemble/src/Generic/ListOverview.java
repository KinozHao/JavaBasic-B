package Generic;

import java.util.ArrayList;

public class ListOverview {
    public static void main(String[] args) {
        java.util.List heros=new ArrayList();     //引用声明接口写为List
        heros.add(new LegendOfLegens("Acer"));  //添加一个自定义对象到集合中
        System.out.println(heros);
    }
}
