package CollectionStudy;

import java.util.ArrayList;
import java.util.Collections;

public class CollectionsMethod {
    public static void main(String[] args) {
        SortMethod();
        binarySearch();
        OtherMethod();
    }

    private static void OtherMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(Collections.max(al));    //max����Ԫ��
        System.out.println(Collections.min(al));    //min��С��Ԫ��
        Collections.reverse(al);                    //���鷴ת
        System.out.println(al);
        Collections.shuffle(al);                    //��������ı�λ��
        System.out.println(al);
    }

    private static void binarySearch() {    //���ҷ���
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
    }

    private static void SortMethod() {      //���򷽷�
        ArrayList<String> al=new ArrayList<>();
        al.add("a");
        al.add("c");
        al.add("g");
        al.add("e");
        al.add("c");
        System.out.println(al); //��ʼ
        Collections.sort(al);   //����
        System.out.println(al); //�����
    }
}
