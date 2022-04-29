package c_lock_basic;
//两个线程间的通讯
public class NotifyBasic {
    public static void main(String[] args) {
        final mntf m =new mntf();
        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        m.pirnt1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    try {
                        m.pirnt2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
class mntf{
    private int A =1;
    public void pirnt1() throws InterruptedException {
        synchronized (this) {
            if (A != 1){
                this.wait();    //当前线程等待
            }
            System.out.print("机");
            System.out.print("器");
            System.out.print("人");
            System.out.println();
            A =2;
            this.notify();      //随机召唤单个等待的线程
        }
    }
    public void pirnt2() throws InterruptedException {
        synchronized (this) {
            if (A != 2){
                this.wait();
            }
            System.out.print("M");
            System.out.print("W");
            System.out.print("X");
            System.out.print("Q");
            System.out.println();
            A = 1;
            this.notify();
        }
    }
}
