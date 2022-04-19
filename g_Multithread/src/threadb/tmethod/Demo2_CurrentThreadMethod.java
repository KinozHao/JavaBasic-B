package threadb.tmethod;

public class Demo2_CurrentThreadMethod {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + "...Thread");
            }
        }.start();

        new Thread(new Runnable(){
            @Override
            public void run() {
                //Thread.currentThread()获取当前正在执行的线程
                System.out.println(Thread.currentThread().getName() + "...Runnable");
            }
        }).start();

        Thread.currentThread().setName("Main Thread is here");
        System.out.println(Thread.currentThread().getName());
    }
}
