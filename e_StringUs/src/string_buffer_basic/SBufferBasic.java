package string_buffer_basic;

/**
 * @author kinoz
 * @Date 2022/5/4 - 19:58
 * @apiNote StringBuffer�ǿɱ��
 */
public class SBufferBasic {
    public static void main(String[] args) {
        timeMethod();
        String s="BlackHouse";

        System.out.println(s);
        s+="Class";
        //Stringһ����ֵ�������׸ı�
        System.out.println(s);

        System.out.println("=======================");

        StringBuffer sb = new StringBuffer("Bee");
        System.out.println(sb);
        sb.append("Club");
        //��������ָ��ͬһ������
        System.out.println(sb);
    }

    public static void timeMethod(){
        //Returns the current value of the running Java Virtual Machine's
        //high-resolution time source, in nanoseconds.
        long time = System.currentTimeMillis();
        System.out.println("��:"+time+"����");
    }
}
