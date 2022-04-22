package threadb.tmethod;
//休眠线程的应用
public class Demo3_Sleep {
    public static void main(String[] args) throws InterruptedException {
//        Normal();
        WithThread();

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

    private static void Normal() throws InterruptedException {  //sleep的异常
        int i = 20;
        while (i >= 0) {
            Thread.sleep(1000);     //间隔1秒
            System.out.println("倒计时"+i+"秒");
            i--;
        }
    }
}
