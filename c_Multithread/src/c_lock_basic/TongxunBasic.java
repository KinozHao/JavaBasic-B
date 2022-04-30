package c_lock_basic;


/**
 * @author kinoz
 * @Date 2022/4/30 - 14:52
 * @apiNote
 */
class Nums implements Runnable {
    private int num = 1;
    @Override
    public void run() {
        for (;;){
            synchronized (this) {
                notifyAll();
                if (num <= 100){
                    System.out.println(Thread.currentThread().getName()+": "+num);
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    num++;

                    try {
                        //让当前线程进入堵塞
                        wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }else {
                    break;
                }
            }
        }
    }
}
class Number extends Thread{
    //继承Thread同样方式会出现死锁
    private static int num = 1;
    @Override
    public void run() {
        numMethod();
    }
    public synchronized void numMethod(){
        for (;;){
            notifyAll();
            if (num <= 100){
                System.out.println(getName()+": "+num);
                num++;

                try {
                    //让当前线程进入堵塞
                    wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                break;
            }
        }
    }
}
public class TongxunBasic {
    public static void main(String[] args) {
        //usRunnable();
        usThread();

    }
    public static void usThread(){
        Number nbr1 = new Number();
        Number nbr2 = new Number();
        nbr1.start();
        nbr2.start();
    }
    public static void usRunnable() {
        Nums nums = new Nums();
        Thread t1= new Thread(nums);
        Thread t2= new Thread(nums);
        t1.start();
        t2.start();
    }

}
