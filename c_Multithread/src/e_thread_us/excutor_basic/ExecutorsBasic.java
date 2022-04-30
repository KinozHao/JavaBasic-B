package e_thread_us.excutor_basic;


import java.util.concurrent.*;

/**
 * @autor kinoz
 * @date 28/April/2022
 * @apiNote Executors是一个工具类(类似Arrays)
 * ExecutorService和Executors是接口
 */
public class ExecutorsBasic {
    public static void main(String[] args) {
        //提供指定数量的线程池
        ExecutorService poor = Executors.newFixedThreadPool(2);
        //ExecutorsService作为接口提供的方法优先
        //通过getClass可以获取它的实现类
        System.out.println(poor.getClass());
        //进行强转后可以调用ThreadPoolExecutor里面的具体方法
        ThreadPoolExecutor realPoor = (ThreadPoolExecutor)poor;


        //存放单条线程
        ExecutorService poor2 = Executors.newSingleThreadExecutor();

        poor.execute(new BubbleThread());//适用于runnable

        //FutureTask Sum = new FutureTask(new SumThread());
        poor.submit(new FutureTask(new SumThread()));//适用于callable

        poor.shutdown();
    }
}
