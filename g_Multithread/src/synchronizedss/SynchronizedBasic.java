package synchronizedss;

public class SynchronizedBasic {
    public static void main(String[] args) {
        //��ӡ����������������
        final demo dm = new demo();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.pirnt1();
                }
            }
        }.start();
/*-----------------------------------------------*/
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.pirnt2();
                }
            }
        }.start();

    }
}

class demo{
    Lock suo =new Lock();
    public void pirnt1(){
        //���������������������
        synchronized (suo) {
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }
    public void pirnt2(){
        //���������������� ��Ϊ����������ͬһ������
        synchronized (new Lock()) {
            System.out.print("ڤ");
            System.out.print("��");
            System.out.print("��");
            System.out.print("��");
            System.out.println();
        }
    }
}
