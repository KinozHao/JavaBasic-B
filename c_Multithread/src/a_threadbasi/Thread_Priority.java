package a_threadbasi;
/**
 * @author kinoz
 * @Date 2022/4/26 - 19:18
 * @apiNote 线程优先继方法的使用
 * 把一个线程即使设置了最高的MAX_PRIORITY
 * 并不代表它执行完了，才会执行另外一个线程
 * 中间还是会出现交互的情况
 * setPriority getPriority
 */
public class Thread_Priority {
    public static void main(String[] args) {
        Thread t1 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 10; s++) {
                    System.out.println(getName()+": 第一条线程");
                }
            }
        };
        Thread t2 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 10; s++) {
                    System.out.println(getName()+": 第二条线程");
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
        System.out.println("t1线程优先度: "+t1.getPriority());
        System.out.println("t2线程优先度: "+t2.getPriority());
    }
}
