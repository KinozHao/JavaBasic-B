package a_thread_basic;
//礼让线程
public class Thread_Yield {
    public static void main(String[] args) {
        //加入yield方法使得两条线程交互执行
        new MyThread().start();
        new MyThread().start();
    }
}
class MyThread extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0){
                MyThread.yield();
            }
            System.out.println(getName()+"...."+i);
        }
    }


}
