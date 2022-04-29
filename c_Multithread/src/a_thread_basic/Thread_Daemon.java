package a_thread_basic;
//守护线程
public class Thread_Daemon {
    public static void main(String[] args) {
        Thread tr1 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + "...北极");
                }
            }
        };
        Thread tr2 = new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + "...南极");
                }
            }
        };
        tr1.start();
        tr2.setDaemon(true);   //当传入true就意味着设置为守护线程
        tr2.start();
    }
}
