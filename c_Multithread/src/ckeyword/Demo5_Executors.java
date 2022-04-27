package ckeyword;
//线程池的概述
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Demo5_Executors {
    public static void main(String[] args) {
        ExecutorService poor = Executors.newFixedThreadPool(2); //创建线程池存放多条
        ExecutorService poor2 = Executors.newSingleThreadExecutor();    //这个只可以存放单条
        poor.submit(new txts());    //这个操作是把线程放到池子里面
        poor.submit(new txts());

        poor.shutdown();
    }
}
