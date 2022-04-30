package trycatch_us;

/** @apiNote jdk1.7������
1. ����д���catchֻ��Ҫ�ڶ���쳣�м�� | ����ʵ�ְ�������쳣
2. ǰ�ڲ��Ƽ�����д���׻���������һ���쳣��Ӧһ��catch��
3. ���ڸ�������д��:
4. ��׿,�ͻ��˿���,�����쳣һ����try{}catch(Exception e){}
5. EE������������,һ�㶼���õײ㿪��,�ӵײ�������
*/
public class NewFeatures {
    public static void main(String[] args) {
        int a=10;
        int b=0;
        int [] arr={11,22,33};

        try {
            System.out.println(a/b);
            System.out.println(arr[5]);
        //}catch (Exception e){       //�����쳣�ĸ������Exception
        }catch (ArithmeticException  | ArrayIndexOutOfBoundsException E){
            System.out.println("Software error");
        }finally {
            System.out.println("�߼�����һ�����⣬���ٴμ�����");
        }
    }
}
