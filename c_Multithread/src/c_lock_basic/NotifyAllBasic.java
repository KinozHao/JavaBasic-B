package c_lock_basic;

public class NotifyAllBasic {
    public static void main(String[] args) {
        final mntf2 m =new mntf2();
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
                        m.pirnt3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();

    }
}
class mntf2{
    private int A =1;
    public void pirnt1() throws InterruptedException {
        synchronized (this) {
            while (A != 1){     //while循环是判断循环,每次都会判断标记
                this.wait();    //当前线程等待
            }
            System.out.print("上杉");
            System.out.println();
            A =2;
            this.notifyAll();      //随机召唤单个等待的线程
        }
    }
    public void pirnt2() throws InterruptedException {
        synchronized (this) {
            while (A != 2){
                this.wait();
            }
            System.out.print("奔腾");
            System.out.println();
            A = 3;
            this.notifyAll();
        }
    }
    public void pirnt3() throws InterruptedException {
        synchronized (this) {
            while (A != 3){
                this.wait();
            }
            System.out.print("辉瑞");
            System.out.println();
            A = 1;
            this.notifyAll();
        }
    }
}
