package b_list.ArrayList_us;
/*
    public boolean add(E e):�򼯺ϵ������Ԫ��,���������ͺͷ���һ��.
    public E get��int index):�Ӽ��ϵ��л�ȡԪ��,�������������,����ֵ�Ƕ�Ӧλ�õ�Ԫ��.
    public E remove(int index):�Ӽ��ϵ���ɾ��Ԫ��,�������������,����ֵ�Ǳ�ɾ����Ԫ��.
    public Int size(): ��ȡ���ϵĳߴ糤��,����ֵ�Ǽ����а�����Ԫ�ظ�����
*/
import java.util.ArrayList;

public class AlMethod {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();
        System.out.println(list);//printf now nothing just[]
        //add element to the array
        boolean success=list.add("Apple");//boolean determination the element T/F
        System.out.println(list);
        System.out.println("Is the element's ture:"+success);
        //�Ӽ����л��Ԫ����get,����ֵ��o��ʼ
        list.add("Honor");
        list.add("Huawei");
        list.add("Oneplus");
        list.add("Mi");
        System.out.println(list);   //��ӡ�������еļ��ϲ���
        String name=list.get(2);    //���������˼����еĵڶ�������
        System.out.println("The second is:"+name);  //���������˵ڶ���Ԫ��
        //�Ӽ�����ɾ��Ԫ����remove,����ֵ�Ǵ�0��ʼ
        String remove=list.remove(3);       //ɾ��������Ԫ��
        System.out.println("We remove the"+remove); //��ӡɾ���ĵ�����Ԫ����ʲô
        System.out.println(list);           //�Ƴ�������Ԫ�غ�ļ���
        //��ȡ���ϵĳ���ע:����ֵ�Ǵ�0��ʼ�����Գ���Ϊ4
        int num=list.size();            //�ѳ��ȸ�ֵ��num
        System.out.println("The arrays size:"+num);        //��ӡ����ֵ
    }
}
