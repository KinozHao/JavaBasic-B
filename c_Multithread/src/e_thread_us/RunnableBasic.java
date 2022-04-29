package e_thread_us;

/**
 * @author kinoz
 * @create 2022/4/26 - 19:18
 * @apiNote 实现多线程的方式2:实现Runnable接口
 */

//1:实现Runnable接口
class RunnableBasic implements Runnable{

    @Override
    //2:重写run方法
    public void run() {
        for (int i = 0; i < 2000; i++) {
            System.out.println("Java first at world");
        }
    }

    public static void main(String[] args) {
        //3:创建自定义类对象
        RunnableBasic rbc = new RunnableBasic();

        /*4:因为Runnable是实现的不是继承
        需要Thread的start方法来开启线程*/
        Thread tr = new Thread(rbc);
        //5:开启线程
        tr.start();

        //匿名写法
        //new Thread(rbc).start();

        //main线程执行的事务
        for (int j = 0; j < 50; j++) {
            System.out.println("PHP是世界上最好的语言");
        }
    }
}