package c_map;

import java.util.Comparator;
import java.util.TreeMap;
//TreeMap���ϼ���Studentֵ��String��һ������

public class TreeMapBasic {
    public static void main(String[] args) {
        Object();
        Key();
    }

    private static void Key() {
        //�Ƚϼ�
        TreeMap<MapData,String> tm=new TreeMap<>(new Comparator<MapData>() {
            @Override
            public int compare(MapData s1, MapData s2) {
                int num=s1.getName().compareTo(s2.getName());
                return num == 0 ? s1.getAge() - s2.getAge() : num;
            }
        });
        tm.put(new MapData("Aniy",20),"Chicago");
        tm.put(new MapData("Fiki",30),"Las Veges");
        tm.put(new MapData("Nani",70),"Matins City");
    }

    private static void Object() {  //���ն����������
        TreeMap<MapData,String> tm=new TreeMap<>();
        tm.put(new MapData("Aniy",20),"Chicago");
        tm.put(new MapData("Fiki",30),"Las Veges");
        tm.put(new MapData("Nani",70),"Matins City");
        System.out.println(tm);
    }
}
