package d_thread_test.tickettest;

/**
 * @author kinoz
 * @Date 2022/4/27 - 19:50
 * @apiNote 通过继承Thread实现的火车站卖票案例
 * 存在线程安全问题:会出现错票，重票的问题
 * 原因:一条线程还没有执行完，另外一条线进来了，同时操作共享数据
 * 解决方法:使用线程同步锁(lockBasic包下)
 */
public class ThreadUnsafe extends Thread{
    private static int all_ticket = 100;
    @Override
    public void run() {
        while (true){
            if (all_ticket <= 0){
                break;
            }
            //使用sleep会增大出现错票和重票问题
            /*try {
                sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }*/
            System.out.println(getName()+"卖出票号为["+ all_ticket+"]");
            all_ticket--;
        }
    }

    public ThreadUnsafe(String name) {
        super(name);
    }
}

