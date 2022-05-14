package z_tools;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
//��Arraysһ��Collections��Ϊһ��������(���Ƕ��ǵ���ģʽ������)
public class CollectionsTools {
    @Test
    @CollectionNote("Collections���ҷ���")
    public void binarySearch() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
    }
    @Test
    @CollectionNote("Collections���򷽷�")
    public void SortMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");al.add("g");
        al.add("e");al.add("c");
        System.out.println(al); //��ʼ
        Collections.sort(al);   //����
        System.out.println(al); //�����
    }
    @Test
    @CollectionNote("һЩ�����ĳ��÷���")
    public void OtherMethod() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.max(al));    //max����Ԫ��
        System.out.println(Collections.min(al));    //min��С��Ԫ��
        Collections.reverse(al);                    //���鷴ת
        System.out.println(al);
        Collections.shuffle(al);                    //��������ı�λ��
        System.out.println(al);
    }
}
