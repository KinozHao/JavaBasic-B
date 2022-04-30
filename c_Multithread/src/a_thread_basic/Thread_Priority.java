package a_thread_basic;
/**
 * @author kinoz
 * @Date 2022/4/26 - 19:18
 * @apiNote 线程优先继priority的体现
 * 即使设置MAX_PRIORITY还是会被抢到执行权
 */
public class Thread_Priority {
    public static void main(String[] args) {
        Thread t1 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 10; s++) {
                    setName("t1");
                    System.out.println(getName()+": 第一条线程");
                }
            }
        };
        Thread t2 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 10; s++) {
                    setName("t2");
                    System.out.println(getName()+": 第二条线程");
                }
            }
        };

        //最高优先级
        t1.setPriority(Thread.MAX_PRIORITY);
        //最低优先继
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();

        //获取当前级别数
        System.out.println("t1线程优先度: "+t1.getPriority());
        System.out.println("t2线程优先度: "+t2.getPriority());
    }
}
