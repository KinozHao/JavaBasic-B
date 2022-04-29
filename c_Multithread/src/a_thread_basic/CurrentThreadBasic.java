package a_thread_basic;
//currentThread方法，用于获取当前正在执行的线程

public class CurrentThreadBasic {
    public static void main(String[] args) {
        Thread td1 = new Thread(){
            @Override
            public void run() {
                System.out.println(getName() + ": 继承Thread的线程");
            }
        };
        td1.setName("线程1");
        td1.start();

        Thread td2 = new Thread(new Runnable(){
            @Override
            public void run() {
                //获取当前正在执行的线程
                //Thread.currentThread();
                System.out.println(Thread.currentThread().getName() + ": 实现Runnable的线程");
            }
        });
        td2.setName("线程2");
        td2.start();

        Thread.currentThread().setName("当前正在执行的线程:");
        System.out.println(Thread.currentThread().getName());
    }
}
