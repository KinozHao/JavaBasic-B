package b_lockbasic.synchronzation;

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
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
    }

    private int all_ticket =100;

    private ReentrantLock reentrantLock =new ReentrantLock();

    @Override
    public void run() {
        while (true){
            //开始执行前进行上锁
            reentrantLock.lock();
            if (all_ticket <= 0){
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"..这是第"+ all_ticket-- +"号票");
            //运行完毕解锁
            reentrantLock.unlock();
        }
    }
}
