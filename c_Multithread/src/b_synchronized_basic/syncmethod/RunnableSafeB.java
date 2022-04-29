package b_synchronized_basic.syncmethod;


/**
 * @author kinoz
 * @Date 2022/4/29 - 14:45
 * @apiNote 同步方法体现 runnable接口
 */
public class RunnableSafeB implements Runnable{
    public static void main(String[] args) {
        //三条线程用的是一个对象，所以ticket变量无需static
        RunnableSafeB rkt = new RunnableSafeB();

        Thread tr1 = new Thread(rkt);
        tr1.setName("沈阳站");
        tr1.start();

        Thread tr2 =  new Thread(rkt);
        tr2.setName("洛阳站");
        tr2.start();

        Thread tr3 = new Thread(rkt);
        tr3.setName("北京站");
        tr3.start();
    }
    private int ticket = 100;
    @Override
    public void run() {
        for (;;) {
            syncMethod();
        }
    }
    //同步方法的使用
    private synchronized void syncMethod(){ //同步监视器:即this
        if (ticket > 0) {
            System.out.println(Thread.currentThread().getName()+"->销售票号:["+ticket+"]");
            ticket --;
        }
    }
}
