package b_set;

import z_tools.CollTraver;

import java.util.Collection;
import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
//TreeSet类的具体使用
public class TreeSetBasic {
    public static void main(String[] args) {
        //自然排序
        Set datas = new TreeSet();
        datas.add(new SetData("Jack",20));
        datas.add(new SetData("Aicci",20));
        datas.add(new SetData("Long",20));
        datas.add(new SetData("Long",36));
        CollTraver.IteratorTravers(datas);

        //定制排序
        Comparator CusCompare = new Comparator() {
            @Override
            public int compare(Object o1, Object o2) {
                if (o1 instanceof SetData && o2 instanceof SetData){
                    SetData sda = (SetData)o1;
                    SetData sdb = (SetData)o2;
                    return Integer.compare(sda.getAge(),sdb.getAge());
                }else {
                    throw new RuntimeException("类型不符");
                }
            }
        };
        TreeSet<SetData> treeData = new TreeSet<>(CusCompare);
        treeData.add(new SetData("Jack",54));
        treeData.add(new SetData("Aicci",32));
        treeData.add(new SetData("Long",94));
        treeData.add(new SetData("Long",6));
        //我们自定义的排序类
        CollTraver.IteratorTravers(treeData);
    }
}