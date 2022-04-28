package d_thetest.tickettest;

/**
 * @author kinoz
 * @date 2022/4/15 - 12:43
 * @apiNote 继承Thread写法测试
 */
public class PiaoTest {
    public static void main(String[] args) {
        tTest1();
    }

    //未使用synchronized前
    public static void tTest1(){
        new ThreadUnsafe("上海虹桥:").start();
        new ThreadUnsafe("北京西站:").start();
        new ThreadUnsafe("重庆北站:").start();
        new ThreadUnsafe("日喀则站:").start();
    }

    public static void rTest1(){
        //三条线程用的是一个对象，所以ticket变量无需static
        RunnableUnsafe rkt = new RunnableUnsafe();

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


}
