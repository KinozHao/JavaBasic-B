package threadstatus;
//线程优先级
public class Thread_Priority {
    public static void main(String[] args) {
        Thread t1 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 1000; s++) {
                    System.out.println(getName()+"China number one");
                }
            }
        };
        Thread t2 =new Thread(){
            @Override
            public void run() {
                for (int s = 0; s < 1000; s++) {
                    System.out.println(getName()+"POLARIS");
                }
            }
        };

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.start();
        t2.start();
    }
}
