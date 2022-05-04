package string_buffer_basic;
/**
 * @author kinoz
 * @Date 2022/5/4 - 19:52
 * @apiNote һ��StringBuffer���÷���
 * ��������û���κ�����ʱ�� ���κεķ������� ��ʾStringIndexOutOfBoundsException
 */
public class SB_Method {
    public static void main(String[] args) {
        System.out.println("���-------------");
        add();
        System.out.println("ɾ��-------------");
        remove();
        System.out.println("�޸�-------------");
        alter();
        System.out.println("��ȡ-------------");
        substring();
    }

    private static void alter() {
        StringBuffer sb = new StringBuffer("haoguobin");
        sb.setCharAt(0,'K');    //�޸�ָ��λ���ַ�
        sb.setCharAt(1,'I');
        sb.setCharAt(2,'G');
        System.out.println("�޸�ָ��λ���ַ����"+sb);

        sb.replace(3,5,"kk");   //�滻ָ��λ���ַ����ַ���
        System.out.println("�滻ָ���ַ��������ַ����"+sb);

        System.out.println("�ַ�����ת���:"+sb.reverse());
    }

    private static void remove() {
        StringBuffer sb=new StringBuffer("china");

        sb.delete(0,1);     //ָ����Χɾ��
        System.out.println("ɾ��ָ��λ�ý��"+sb);

        sb.deleteCharAt(3); //ָ��λ��ɾ��
        System.out.println("ɾ��ָ��λ�ý��"+sb);

        sb.delete(0,sb.length());   //��ջ�����
        System.out.println("��ջ������Ľ��:"+sb);
    }

    private static void add() {
        StringBuffer sb=new StringBuffer(); //����һ���ַ���������
        sb.append("abcdefj");       //��ĩβ����ַ���
        System.out.println("append����ӽ��Ϊ"+sb);

        sb.insert(2,"124"); //��ָ��λ�ò����ַ���
        System.out.println("insert����ӽ��Ϊ"+sb);
    }

    public static void substring() {
        //����ֵ���Ͳ�����StringBuffer���� ����String����
        StringBuffer sb=new StringBuffer("jifeng");

        String s=sb.substring(2);       //��ȡfeng ������2��ʼ
        System.out.println(s);

        String s2=sb.substring(0,2);       //��ȡji ������0��ʼ������2 ������������β
        System.out.println(s2);

        System.out.println(sb);            //�������ı�
    }
}
