package iterator_us;

import java.util.ArrayList;
import java.util.Collection;
//ArrayList��ת��
public class ConvertTest {
    public static void main(String[] args) {
        SetToArrayS();
        System.out.println("-------");
        SetToArray();
        System.out.println();
        System.out.println("-------");
        UserVariable();
        System.out.println("-------");
        SetToCharacter();
    }

    private static void SetToArray() {
        Collection cl = new ArrayList();
        cl.add("h");
        cl.add("b");
        cl.add("c");
        Object [] arr=cl.toArray();     //����ת��Ϊ����
        for (int i = 0; i < arr.length; i++) {
            System.out.print("["+arr[i]+"]");
        }
    }


    //������ֵΪһ������
    private static void UserVariable() {
        //1�Զ������ �Լ�����һ����洢�Լ��Ķ���
        ArrayList ar = new ArrayList();
        ar.add(new StudentParam("��С��",32));
        ar.add(new StudentParam("�����",15));
        ar.add(new StudentParam("�ܶ�λ",13));

        //2����ת��Ϊ����
        Object [] obj = ar.toArray();

        for (int i = 0; i < obj.length; i++) {
            /*//3ֱ�Ӵ�ӡ��ͨ����д����toString�����ж�Ԫ���Ƿ���ӳɹ�
            System.out.println(obj[i]);*/
            StudentParam s = (StudentParam) obj[i]; //����ת��(ǿת)
            System.out.println("����:"+s.name+" ����:"+s.age);
        }
    }


    private static void SetToArrayS() {
        //����ת��Ϊ���� ��addΪString����
        ArrayList<String> s = new ArrayList<>();
        s.add("�ַ���1");
        s.add("�ַ���2");
        s.add("�ַ���3");

        Object [] obj = s.toArray();

        for (int i = 0; i < obj.length; i++) {
            System.out.print("����ת����"+ obj[i]+" ");
        }
        System.out.println();//����


    }

    private static void SetToCharacter(){
        ArrayList<String> s = new ArrayList<>();
        s.add("�ַ���1");
        s.add("�ַ���2");
        s.add("�ַ���3");

        Object [] obj = s.toArray();
        //����ת��Ϊ�ַ���
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < obj.length; i++) {
            sb.append(obj[i]);
        }
        System.out.println();//����
        sb.append("�ַ���");
        System.out.println("����ת��Ϊ�ַ���:"+sb);
    }
}
