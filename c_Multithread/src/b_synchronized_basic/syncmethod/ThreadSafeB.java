package b_synchronized_basic.syncmethod;

/**
 * @author kinoz
 * @Date 2022/4/29 - 15:04
 * @apiNote 同步方法体现 继承Thread类
 */
public class ThreadSafeB extends Thread {
    public static void main(String[] args) {
        ThreadSafeB tsb1 = new ThreadSafeB("北京北站");
        ThreadSafeB tsb2 = new ThreadSafeB("南京站");
        ThreadSafeB tsb3 = new ThreadSafeB("南昌站");
        ThreadSafeB tsb4 = new ThreadSafeB("东北站");
        tsb1.start();tsb3.start();
        tsb2.start();tsb4.start();
    }
    private static int ticket = 100;
    @Override
    public void run() {
        for (;;) {
            sMethod();
        }
    }

    private static synchronized void sMethod(){ //同步监视器:当前类
    //private synchronized void sMethod(){    //同步监视器:this 但this不是单一的(存在多个对象tsb1,tsb2,tsb3,tsb4)
        if (ticket >0){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"->销售票号:["+ticket+"]");
            ticket --;
        }
    }

    public ThreadSafeB(String name) {
        super(name);
    }
}
