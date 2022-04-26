package ckeyword;


public class SynBasic {
    final static Lock lock = new Lock();

    public static void main(String[] args) {
        //打印会出现输出不符问题
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    oneMethod();
                }
            }
        }.start();


        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 500; i++) {
                    twoMethod();
                }
            }
        }.start();

    }

    public static void oneMethod(){
        //锁可以用任意对象来设置
        synchronized (lock) {
            System.out.print("机");
            System.out.print("器");
            System.out.print("人");
            System.out.println();
        }
    }
    public static void twoMethod(){
        //锁不能用匿名对象 因为匿名对象不是同一个对象
        synchronized (new Lock()) {
            System.out.print("冥");
            System.out.print("王");
            System.out.print("星");
            System.out.print("球");
            System.out.println();
        }
    }
}
//用于作为一个锁
class Lock{

}