package u_test;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Scanner;
/** @apiNote
��ĿҪ��:
1. ����¼��int��������,��������Ƹ�ʽ
2. ����������ʾ,������¼���BigInteger����
3. �����С������ʾ,������¼�������
4. ����������ַ�����ʾ,������¼�������
*/
public class ExceptionTest {
    public static void main(String[] args) {

        //1.����¼������
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter a normal num:");
        while (true) {
            //2.����line���ڴ����������
            String line =sc.nextLine();
            try {
                //3.String����ת��Ϊint����
                int num = Integer.parseInt(line);
                //4.�Զ����䣬��numͨ��Integer�ķ�����Ϊ������
                //����ȷ��Ϊ��ת��Ϊint���͵������
                System.out.println(Integer.toBinaryString(num));
                break;
            } catch (Exception e) {
                //5.���������ֽ����ж�
                try {
                    //5.1�������ֹ��󣬸�����ʾ
                    /* BigInteger���ڲ�����������Ҳ����ת�����ơ�
                     * �������������ݳ�������������ͳ���long��������ݾ��޷�װ�롣
                     * ��ʱҪʹ��BigInteger����в�������Щ�����������ַ�������ʽ���롣
                     * */
                    new BigInteger(line);
                    System.out.println("enter error,you inter's " +
                            "num too big insert again:");
                }catch (Exception e1){
                    //5.2�������ֲ���������������ʾ
                    try {
                        new BigDecimal(line);
                        System.out.println("enter error,you " +
                                "inter's a double or float " +
                                "types num,try again num:");
                    //5.3����Ŀ��ܲ������ݣ�������ʾ
                    } catch (Exception e2) {
                        System.out.println("enter error,you " +
                                "inter's mays not a num,try " +
                                "again num:");

                    }
                }
            }
        }
    }
}
