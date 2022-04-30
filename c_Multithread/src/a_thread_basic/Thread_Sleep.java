package a_thread_basic;
//休眠线程的应用
public class Thread_Sleep {
    public static void main(String[] args) throws InterruptedException {
        hourMeter();
        //WithThread();

    }

    //sleep方法本事存在异常，需要抛异常
    private static void hourMeter() throws InterruptedException {
        int i = 20;
        while (i >= 0) {
            Thread.sleep(1000);     //间隔1秒
            System.out.println("倒计时"+i+"秒");
            i--;
        }
    }

    private static void WithThread() {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName()+"....AA");
                }
            }
        }.start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int s = 0; s < 20; s++) {
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName()+"....BB");
                }
            }
        }).start();
    }
}
