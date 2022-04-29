package c_lock_basic;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @apiNote 火车片案例 runnable接口实现
 * ReentrantLock类的使用(仅适用于runnable)
 * @author kinoz
 * @Date 2022/4/15
 * */
public class ReentrantLockSafe implements Runnable{
    public static void main(String[] args) {
        ReentrantLockSafe rkt = new ReentrantLockSafe();
        Thread t1 = new Thread(rkt);
        Thread t2 = new Thread(rkt);
        Thread t3 = new Thread(rkt);
        t1.setName("首尔仁川机场:");
        t2.setName("东京羽田机场:");
        t3.setName("上海浦东机场:");
        t1.start();
        t2.start();
        t3.start();

    }

    private int all_ticket =100;

    private ReentrantLock lock =new ReentrantLock();

    @Override
    public void run() {
        while (true){

            try {
                //手动上锁
                lock.lock();
                if (all_ticket <= 0){
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName()+" 这是第"+ all_ticket-- +"号票");

            } finally {
                //手动释放锁
                lock.unlock();
            }
        }
    }
}
