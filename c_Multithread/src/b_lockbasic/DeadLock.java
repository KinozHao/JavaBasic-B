package b_lockbasic;
/**
 * @autor kinoz
 * @date 28/April/2022
 * @apiNote 死锁案例的演示，两条线程不停去争夺统一资源
 * 都不罢休，最后陷入一种僵持的状态，程序不会自动通知
 */
public class DeadLock {
    //全局常量
    private static final String TOOLS_LEFT="筷子左";
    private static final String TOOLS_RIGHT ="筷子右";

    public static void main(String[] args) {
        //线程A
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (TOOLS_LEFT) {
                        System.out.println("获取" + TOOLS_LEFT + "wait" + TOOLS_RIGHT);
                        synchronized (TOOLS_RIGHT) {
                            System.out.println("获取" + TOOLS_RIGHT + "wait" + TOOLS_LEFT);
                        }
                    }
                }
            }
        }.start();


        //线程B lambda表达式的使用
        new Thread(() -> {
            while (true) {
                synchronized (TOOLS_RIGHT) {
                    System.out.println("获取" + TOOLS_RIGHT + "wait" + TOOLS_LEFT);
                    synchronized (TOOLS_LEFT) {
                        System.out.println("获取" + TOOLS_LEFT+ "wait" + TOOLS_RIGHT);
                    }
                }
            }
        }).start();
    }
}
