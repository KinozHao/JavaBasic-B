package threadb.tmethod;
//礼让线程
public class Demo6_Yield {
    public static void main(String[] args) {
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0){
                Thread.yield();
            }
            System.out.println(getName()+"...."+i);
        }
    }
}
