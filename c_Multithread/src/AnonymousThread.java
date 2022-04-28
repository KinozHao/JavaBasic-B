import org.w3c.dom.ls.LSOutput;

//匿名内部类实现线程的两种方法
public class AnonymousThread {
    public static void main(String[] args) {
        Thread thread1 = new Thread(){           //继承Thread方法
            @Override
            public void run() { //重写run方法
                setName("第一个线程: ");
                for (int i = 0; i < 100; i++) { //传参数
                    System.out.println("Hello Jams");
                }
            }
        };

        //判断当前线程是否存活，返回为boolean类型
        System.out.println("第一个线程是否存活："+thread1.isAlive());

        //把Runnable当作参数写在Thread里面是为了使用start方法
        new Thread(new Runnable() {
            @Override
            public void run() {         //重写run方法
                for (int s = 0; s < 200; s++) { //传参数
                    System.out.println("Hello Mr lee");
                }
            }
        }).start();

        //lambda表达式写法[不算是实现Runnable接口]
        new Thread(()->{
            for (int i = 0; i < 10; i++) {
                System.out.println("hello lambda！");
            }
        }).start();
    }
}
