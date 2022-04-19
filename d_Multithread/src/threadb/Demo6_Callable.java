package threadb;

import java.util.concurrent.*;
/*代码复杂一般不用
callable方法只做了解即可 有返回值可以throwException*/
public class Demo6_Callable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService e =Executors.newFixedThreadPool(2); //线程池创建
        Future<Integer> f1 = e.submit(new Mycallable(100));    //两个线程放在池子里面
        Future<Integer> f2 = e.submit(new Mycallable(50));     //并且抛出异常

        System.out.println(f1.get());                               //get方法获取值
        System.out.println(f2.get());

        e.shutdown();                                           //线程池结束
    }
}
class Mycallable implements Callable<Integer>{
    private int num;        //定义一个自变量

    public Mycallable(int num) {    //有参构造
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        int sum =0;                 //求和方法
        for (int i = 0; i <= num; i++) {
            sum +=i;
        }

        return sum;
    }
}
