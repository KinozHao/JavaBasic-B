//�����������Ͱ�װ�� ����ת��
public class BaseView {
    public static void main(String[] args) {
        MaxMin();
        BaseChange();
    }


    private static void MaxMin() {
        System.out.println(Integer.MAX_VALUE); //���int����������
        System.out.println(Integer.MIN_VALUE); //���int������С������
    }

    private static void BaseChange(){
        System.out.println("2����"+Integer.toBinaryString(60));
        System.out.println("8����"+Integer.toOctalString(60));
        System.out.println("16����"+Integer.toHexString(60));
    }
}
