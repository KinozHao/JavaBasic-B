package b_synchronized_basic.syncblock;


/**
 * @author kinoz
 * @Date 2022/4/15
 * @apiNote 火车片案例 runnable接口实现
 * synchronized关键词的使用
 * 同步代码块体现
 * */
public class RunnableSafeA implements Runnable{
    public static void main(String[] args) {
        RunnableSafeA rkt = new RunnableSafeA();
        //把实现runnable类作为对象传入Thread再开启线程
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
    }

    //共享数据:100张票
    private int ticket =100;
    //当为实现runnable接口时，锁对象不能放在run方法里(若放进去就是每人一把锁不满足共享数据)
    final Object obj = new Object();
    @Override
    public void run() {
        while (true) {
            //同步代码块
            //方式一:synchronized (obj) {
            //方式二:this代表当前对象
            synchronized (this){
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(5);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "->销售票号:" + ticket--);
            }
        }
    }
}


