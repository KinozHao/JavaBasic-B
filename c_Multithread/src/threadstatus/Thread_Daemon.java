package threadstatus;
//守护线程
public class Thread_Daemon {
    public static void main(String[] args) {
        Thread THREADA=new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + ".....A");
                }
            }
        };
        Thread THREADA2=new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 2; i++) {
                    System.out.println(getName() + ".....Bb");
                }
            }
        };
        THREADA.start();
        THREADA2.setDaemon(true);   //当传入true就意味着设置为守护线程
        THREADA2.start();
    }
}
