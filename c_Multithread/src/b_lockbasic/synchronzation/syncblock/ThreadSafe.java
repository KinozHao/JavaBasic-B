package b_lockbasic.synchronzation.syncblock;

/**
 * @author kinoz
 * @Date 2022/4/28 - 15:28
 * @apiNote 火车票案例 继承Thread
 * Synchronized关键词的使用
 * 同步代码块体现
 */
public class ThreadSafe extends Thread{
    public static void main(String[] args) {
        new ThreadSafe("一号窗口").start();
        new ThreadSafe("二号窗口").start();
        new ThreadSafe("三号窗口").start();
        new ThreadSafe("四号窗口").start();
    }

    //共享数据:100张票
    private static int all_ticket = 100;
    //当为继承Thread时，任意锁需要static否则就是每个线程一把锁(不满足共享数据)
    final static Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            //使用同步锁
            //方式一
            //synchronized (obj) {
            //方式二
            synchronized (ThreadSafe.class){
                //票小于时直接跳出
                if (all_ticket <= 0) {
                    break;
                }
                try {
                    sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName()+"-->卖出票号为["+ all_ticket+"]");
                //每销售一张，递减一次
                all_ticket--;
            }
        }
    }
    //用于设置线程的名称
    public ThreadSafe(String name) {
        super(name);
    }
}
