package string_test;

import java.util.Scanner;

/*����
ģ���½����,�����λ���,����ʾ���м���
�û�������������Զ���
*/
/*˼·����
    1:ģ���½��Ҫ�õ�����¼��:Scanner
    2:�����λ�����õ�forѭ��
    3:�ж������ȥ���ַ����Ƿ���ͬ���õ�equals����
    4:��Ϊ����¼�����ַ���������nextLine����,��Ҫ��nextInt����
    5:����ʾ�м���,��Ҫ�õ��ж�,i
 */
public class UserSignIn {
    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter you name:");
        String userName = sc.nextLine();
        System.out.print("Please enter you password");
        String password = sc.nextLine();

        if ("Admin".equals(userName) && "786813".equals(password)){
            System.out.println("Welcome  <"+userName+">  Sign in");
            break;
        }else {
            if (i == 2) {
                System.out.println("You have no chance Try tomorrow");
            } else {
                System.out.println("��������д��� �㻹ʣ��" + (2 - i) + " ����");
            }
            }
        }
    }
}
