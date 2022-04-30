package d_thread_test.ticket;

/**
 * @author kinoz
 * @Date 2022/4/28 - 13:07
 * @apiNote 火车片案例 runnable接口实现 线程不安全
 */
public class RunnableUnsafe implements Runnable{
    private int ticket = 100;
    @Override
    public void run() {
        while (true) {
            if (ticket <= 0) {
                break;
            }

            System.out.println(Thread.currentThread().getName()+"->销售票号:["+ticket+"]");
            ticket --;
        }
    }
}
