package CharacterStream;

public class Demo7Wrap {
    public static void main(String[] args) {
        HMstudent hms=new HMstudent(new kinoz());
        hms.code();
    }
}
interface code{
    public void code();
}
//װ�����ģʽ�ĺô��� ����Բ�ǿ,��װ�ε���仯��װ����ı仯�޹�
class kinoz implements code{

    @Override
    public void code() {
        System.out.println("javase");
        System.out.println("javaweb");
    }
}
class HMstudent implements code{
    //��ȡ��װ���������
    private kinoz k;

    //�ڹ��췽���г�ʼ��װ����Ķ���
    public HMstudent(kinoz k) {
        this.k = k;
    }

    //��ԭ�ж���Ĺ��ܽ�������
    @Override
    public void code() {
        k.code();
        System.out.println("AI");
        System.out.println("Python");
        System.out.println("...");
    }
}