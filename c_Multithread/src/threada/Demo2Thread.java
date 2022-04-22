package threada;

public class Demo2Thread {
    public static void main(String[] args) {
        MyTD mt =new MyTD();        //创建自定义类对象
        Thread tr=new Thread(mt);   //因为Runnable是实现的不是继承所以要写一个Thread对象用来开启线程
        tr.start();                 //开启线程

        for (int j = 0; j < 4000; j++) {
            System.out.println("PHP not liked everything");
        }
    }
}
class MyTD implements Runnable{     //定义一个类实现Runnable

    @Override
    public void run() {             //创建run方法
        for (int i = 0; i < 2000; i++) {    //打印的参数
            System.out.println("Java first at world");
        }
    }
}