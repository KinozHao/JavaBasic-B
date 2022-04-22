package synchronizedss.tickettest;

import java.util.concurrent.locks.ReentrantLock;
/**
 * @apiNote 火车片案例 runnable接口实现
 * 使用ReentrantLock锁
 * @author kinoz
 * @Date 2022/4/15
 * */
class RunnableTK2 implements Runnable{
    private int tiks=100;
    private ReentrantLock rLock =new ReentrantLock();
    @Override
    public void run() {
        while (true){
            rLock.lock();
            if (tiks <= 0){
                break;
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"..这是第"+tiks-- +"号票");
            rLock.unlock();
        }
    }
}
