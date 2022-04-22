package threadb;

public class Demo5_TXT {
    public static void main(String[] args) {
        txts t =new txts();         //创建txts对象
        Thread tr =new Thread(t);   //创建tr对象是为了调用Thread的start方法
        tr.start();

    }
}
class txts implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }
}
