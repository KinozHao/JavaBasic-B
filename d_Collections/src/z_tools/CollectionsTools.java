package z_tools;

import org.junit.Test;

import java.util.*;

//��Arraysһ��Collections��Ϊһ��������(���Ƕ��ǵ���ģʽ������)
public class CollectionsTools {
    @Test
    @CollectionNote("Collections���򷽷�")
    public void SortMethod() {
        ArrayList<String> data=new ArrayList<>();
        data.add("a");
        data.add("c");
        data.add("g");
        data.add("d");
        data.add("5");
        Collections.sort(data); //���� Ĭ����Ȼ����
        System.out.println(data);
        Collections.shuffle(data);  //���Ҽ���Ԫ��
        System.out.println(data);
        ArrayList<String> dataB=new ArrayList<>();
        dataB.add("a");
        dataB.add("c");
        Collections.swap(dataB,0,1); //����ָ������λ��
        System.out.println(dataB);
    }

    @Test
    @CollectionNote("Collections���ҷ���")
    public void binarySearch() {
        ArrayList<String> al=new ArrayList<>();
        al.add("a");al.add("c");
        al.add("g");al.add("e");al.add("c");
        System.out.println(Collections.binarySearch(al,"g"));
        //1.��ȡal���ϵĳ��ȣ�ͨ��Arrays����������һ���µļ�����
        List list = Arrays.asList(new Object[al.size()]);
        //2.ͨ��copy������ֵ����1ȫ��Ԫ�ص�����2
        Collections.copy(list,al);
        System.out.println(list);

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
        int c = Collections.frequency(al, "c"); //��ͬԪ�س��ֵĴ���
        System.out.println(c);
    }
    @Test
    @CollectionNote("synchronized�̰߳�ȫ�ķ���")
    public void synchronizedMethod(){
        ArrayList arr = new ArrayList();
        Collection arr2 = new LinkedList();
        List list = Collections.synchronizedList(arr);
        Collection col = Collections.synchronizedCollection(arr2);
        HashMap map = new HashMap();
        Map newmap = Collections.synchronizedMap(map);
    }
}
