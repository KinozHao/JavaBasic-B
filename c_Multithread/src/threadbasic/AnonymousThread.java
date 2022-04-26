package threadbasic;

//匿名内部类实现线程的两种方法
public class AnonymousThread {
    public static void main(String[] args) {
        new Thread(){           //继承Thread方法
            @Override
            public void run() { //重写run方法
                for (int i = 0; i < 100; i++) { //传参数
                    System.out.println("Hello Jams");
                }
            }
        //开启线程
        }.start();

        //把Runnable当作参数写在Thread里面是为了使用start方法
        new Thread(new Runnable() {
            @Override
            public void run() {         //重写run方法
                for (int s = 0; s < 200; s++) { //传参数
                    System.out.println("Hello Mr lee");
                }
            }
        }).start();
    }
}
