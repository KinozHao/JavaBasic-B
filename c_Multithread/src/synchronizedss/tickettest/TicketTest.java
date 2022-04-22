package synchronizedss.tickettest;
/**
 * @author kinoz
 * @date 2022/4/15 - 12:43
 * @apiNote
 */
public class TicketTest {
    public static void main(String[] args) {
        //tTest1();
        //rTest1();
        rTest2();
    }

    //继承Thread写法
    public static void tTest1(){
        //直接调用Thread的方法
        new ThreadTK().start();
        new ThreadTK().start();
        new ThreadTK().start();
        new ThreadTK().start();
    }

    //实现runnable接口，synchronized锁
    public static void rTest1(){
        RunnableTK rkt = new RunnableTK();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
        //多次启动一个线程是非法的,特别是当线程结束执行后,不能再重新启动
        /*Thread tr = new Thread(rkt);
        tr.start();
        tr.start();
        tr.start();
        tr.start();*/
    }
    //实现runnable接口，reentrantLock锁
    public static void rTest2(){
        RunnableTK2 rkt = new RunnableTK2();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
        new Thread(rkt).start();
    }
}
