package a_collection;

import z_tools.CollectionNote;
import java.util.ArrayList;
import java.util.Collection;
//Collection�ӿ�ʵ������Ӷ���ʱ��Ҫ����Ӷ���������ȥ��дequals()

@CollectionNote("Collection�ӿ�ͨ�õķ���")
public class CollectionFF_A {
    public static void main(String[] args) {
        SomeMethodA();
        System.out.println("*****************");
        AddMethod();
    }

    private static void SomeMethodA(){
        Collection s = new ArrayList();
        s.add("ho");
        s.add("oooo");
        s.add("ello");
        s.add(new StudentView("Tom",20));
        //ɾ������ָ���ַ�
        s.remove("oooo");
        //�ж��Ƿ����
        System.out.println(s.contains(new StudentView("Tom",20)));
        //�ж��Ƿ�Ϊ���ַ���
        System.out.println(s.isEmpty());
        //�ж��ַ�����
        System.out.println(s.size());
        //�����������Ԫ��
        System.out.println(s);
        //��ռ���Ԫ��
        s.clear();
    }

    private static void AddMethod() {
        //��̬����:new������Ҫʹ��ʵ����
        Collection s = new ArrayList();
        //��ʹ�÷��͵�����£����Ͽ��Դ��������������
        boolean b1 = s.add("hello world");
        boolean b2 = s.add(true);
        //������List�Ŀ��ظ���,ͬʱ�����Զ�װ��
        boolean b3 = s.add(100);
        boolean b4 = s.add(100);
        boolean b5 = s.add(new StudentView("�߷Ƿ�",17));
        System.out.println(b4);
        System.out.println(b3);
        //�����������Ԫ��
        System.out.println(s);
    }
}
