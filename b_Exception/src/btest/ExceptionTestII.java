package btest;

import java.util.Scanner;

/**
 * @author kinoz
 * @date 2022/4/22 - 18:43
 * @apiNote �쳣�ܺ�С��ϰ�ж����������Ƿ���� �������ϸ�����Ӧ���쳣����
 */
public class ExceptionTestII {
    public static void main(String[] args) {
        //1.¼������
        Scanner sc = new Scanner(System.in);
        System.out.println("�����һ������:");
        String str1 = sc.nextLine();
        System.out.println("����ڶ�������:");
        String str2 = sc.nextLine();

        try {
            //2.��������ת��
            int num1 = Integer.parseInt(str1);
            int num2 = Integer.parseInt(str2);
            int result = ecmMETHOD(num1,num2);
            System.out.println(result);
            //3.�����ڲ�����������쳣
        } catch (NumberFormatException e) {
            System.out.println("�������Ͳ�һ��");
        } catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("ȱ�������в���");
        } catch (ArithmeticException e3){
            System.out.println("��0");
        } catch (EcmException e4){
            //�Ѿ�throw���쳣��ֻ��ͨ��getMessage������ȡ��ӡ��Ϣ����
            System.out.println(e4.getMessage());
        }
    }
    public static int ecmMETHOD(int i,int j) throws EcmException{
        if (i<0 || j<0){
            //�Զ����쳣
            throw new EcmException("���ӻ��ĸΪ0");
        }
        return i / j;
    }
}
