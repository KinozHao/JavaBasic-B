package threada;

public class Demo1Thread {
    public static void main(String[] args) {
        MyThread mt =new MyThread();    //创建Thread类的子类对象
        mt.start();                     //开启线程
        for (int j = 0; j < 3000; j++) {
            System.out.println("United State");
        }
    }
}
class MyThread extends Thread{      //1继承Thread
    @Override                       //重写run方法
    public void run() {
        for (int i = 0; i < 4000; i++) {    //run方法里面写输出内容
            System.out.println("China");
        }
    }
}