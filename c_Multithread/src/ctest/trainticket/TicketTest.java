package ctest.trainticket;
/**
 * @author kinoz
 * @date 2022/4/15 - 12:43
 * @apiNote
 */
public class TicketTest {
    public static void main(String[] args) {
        //tTest1();
        tTest2();
        //rTest1();
        //rTest2();
    }

    //继承Thread写法
    public static void tTest1(){
        new ThreadTK2("上海虹桥:").start();
        new ThreadTK2("北京西站:").start();
        new ThreadTK2("重庆北站:").start();
        new ThreadTK2("日喀则站:").start();
    }

    //使用synchronized解决线程安全
    public static void tTest2(){
        new ThreadTK("一号窗口").start();
        new ThreadTK("二号窗口").start();
        new ThreadTK("三号窗口").start();
        new ThreadTK("四号窗口").start();
    }

    //实现runnable接口，synchronized解决安全问题
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
