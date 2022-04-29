package e_thread_us.callable;

import java.util.concurrent.*;
/*Callable接口只适用于少量代码
当代码比较复杂的情况下，不去使用Callable接口
有返回值需要抛异常*/
public class CallableUs {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //线程池创建
        ExecutorService e = Executors.newFixedThreadPool(2);
        //两个线程放在池子里面
        Future<Integer> f1 = e.submit(new MyCallable(100));
        Future<Integer> f2 = e.submit(new MyCallable(50));

        //get方法获取值
        System.out.println("第一个callable:"+f1.get());
        System.out.println("第二个callable:"+f2.get());

        //线程池结束
        e.shutdown();
    }
}
