package b_lockbasic;
/**
 * @autor kinoz
 * @date 28/April/2022
 * @apiNote Executors是一个类，相当于一个线程池
 * ExecutorService是一个接口，继承了Executors类
 */

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorsUs {
    public static void main(String[] args) {
        //创建线程池存放型参数条线程数
        ExecutorService poor = Executors.newFixedThreadPool(2);
        //此方法用于存放单条线程
        ExecutorService poor2 = Executors.newSingleThreadExecutor();
        //submit方法用于把线程放进池子
        poor.submit(new JustAObject());
        poor.submit(new JustAObject());

        poor.shutdown();
    }
}
