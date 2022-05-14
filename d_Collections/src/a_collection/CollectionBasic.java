package a_collection;

import org.junit.Test;

import java.util.*;

/** @apiNote Collection�ӿ���Ϊ���Ϲ淶
 * ֱ�Ӽ̳����Ľӿ�������(List Set)
 * ʵ��List�ӿڵĳ�����(LinkedList ArrayList Vector)
 * ʵ��Set�ӿڵĳ�����(HashSet TreeSet)
* */
public class CollectionBasic {
    @Test
    public void methodOne(){
        //����������������(��̬��ʼ��)
        int [] ints = {1,2,3,4,5};
        System.out.println(Arrays.toString(ints));

        //����������������(��̬��ʼ��)
        StudentView[] arr = new StudentView[5];
        //���������������Ԫ��
        arr[0] =new StudentView("Ross",9);
        arr[1] =new StudentView("Jack",11);
        arr[2] =new StudentView("Folk",19);

        //�������ѧ������
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    @Test
    public void methodTwo() {
        //��̬����
        Collection cls = new ArrayList();
        cls.add(new StudentView("Ross",9));
        cls.add(new StudentView("Jam",9));
        cls.add(new StudentView("Walt",9));

        //ת��Ϊ����
        Object[] obj = cls.toArray();

        //�������ѧ������
        for (int i = 0; i < obj.length; i++) {
            System.out.println(obj[i]);
        }
    }
}

