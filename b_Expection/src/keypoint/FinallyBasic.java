package keypoint;

public class FinallyBasic {
    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1, 234, 35};
        try {
            System.out.println(arr[5]);
//            System.exit(0);   �������������Ͳ������finally���� ֱ�ӽ���jvm
        } catch (Exception e) {
            e.printStackTrace();
            return ;
        } finally {
            while (true){
                Thread.sleep(1000);
                System.out.println("���Ӻ�ţ�� ����ִ��");   //finally�µľ��ӱ���ִ�г����������
            }
        }
    }
}
