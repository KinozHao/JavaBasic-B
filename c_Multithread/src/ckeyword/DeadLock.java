package ckeyword;

public class DeadLock {
    private static String k1="筷子左";
    private static String k2="筷子右";

    public static void main(String[] args) {
        //线程A
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    synchronized (k1) {
                        System.out.println("获取" + k1 + "wait" + k2);
                        synchronized (k2) {
                            System.out.println("获取" + k2 + "wait" + k1);
                        }
                    }
                }
            }
        }.start();


        //线程B
        new Thread(() -> {
            while (true) {
                synchronized (k2) {
                    System.out.println("获取" + k2 + "wait" + k1);
                    synchronized (k1) {
                        System.out.println("获取" + k1+ "wait" + k2);
                    }
                }
            }
        }).start();
    }
}
