package d_generics.generic_test;

import org.junit.Test;

import java.util.*;

/**
 * @author kinoz
 * @Date 2022/5/27 - 14:12
 * @apiNote ʹ�÷����Ż�TreeMap������
 */
public class TreeSetPlus {
    @Test
    //��Ȼ����
    public void ComparableMethod() {
        TreeMap<Datas,String> tree = new TreeMap<>();
        tree.put(new Datas("cniy",20),"Chicago");
        tree.put(new Datas("aiki",30),"Las Veges");
        tree.put(new Datas("dani",70),"Matins City");

        //travers map
        Set<Datas> mapData = tree.keySet();
        Iterator<Datas> iterator = mapData.iterator();
        while (iterator.hasNext()){
            Datas key = iterator.next();
            String value = tree.get(key);
            System.out.println(key+"->"+value);
        }

    }
    @Test
    //��������[���������������]
    //�Ѿ�ʹ�÷���ȷ������������ ������������ת����ǿת
    public void ComparatorMethod() {
        Comparator<Datas> cumBJ = new Comparator<>() {
            @Override
            public int compare(Datas s1, Datas s2) {
                return Integer.compare(s1.getAge(),s2.getAge());
                /*int num=s1.getName().compareTo(s2.getName());
                return num == 0 ? s1.getAge() - s2.getAge() : num;*/
            }
        };
        TreeMap<Datas,String> tree = new TreeMap<>(cumBJ);
        tree.put(new Datas("Aniy",20),"Chicago");
        tree.put(new Datas("Fiki",30),"Las Veges");
        tree.put(new Datas("Bani",10),"Matins City");

        //travers map us entrySet
        Set<Map.Entry<Datas, String>> entries = tree.entrySet();
        Iterator<Map.Entry<Datas, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Datas, String> t = iterator.next();
            System.out.println(t.getKey()+t.getValue());
        }
    }
}
