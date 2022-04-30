package e_thread_us.callable_basic;

import java.util.concurrent.*;
/*Callable接口只适用于少量代码
当代码比较复杂的情况下，不去使用Callable接口
有返回值需要抛异常*/
public class CallableTest {
    public static void main(String[] args) {
        normalCallable();
        //withGeneric();
    }

    //不使用泛型
    public static void normalCallable(){
        //3 实例化Callable对象
        CallableBasic callableBasic = new CallableBasic();

        //4 实例化FutureTask对象 把callable对象传入FutureTask构造器
        FutureTask futureTask = new FutureTask(callableBasic);

        //5 传入futureTask对象，并调用start方法开启线程
        new Thread(futureTask).start();
        //匿名写法
        //new Thread(new FutureTask(callableBasic)).start();

        //6 get方法用于获取cal方法的返回值(根据需求提供)
        try {
            //回调方法 get()的返回值相当于FutureTask中参数callable实现类重写的call方法的值
            Object sum = futureTask.get();
            System.out.println("总和为:"+sum);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //使用泛型
    public static void withGeneric(){
        //线程池创建
        ExecutorService e = Executors.newFixedThreadPool(2);
        //两个线程放在池子里面
        Future<Integer> f1 = e.submit(new CwGeneric(100));
        Future<Integer> f2 = e.submit(new CwGeneric(50));

        try {
            //get方法获取值
            System.out.println("第一个callable:"+f1.get());
            System.out.println("第二个callable:"+f2.get());
        } catch (Exception ec){
            ec.printStackTrace();
        }

        //线程池结束
        e.shutdown();
    }
}
