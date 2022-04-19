package synchronizedss;

public class SynchronizedBasic {
    public static void main(String[] args) {
        //打印会出现输出不符问题
        final demo dm = new demo();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.pirnt1();
                }
            }
        }.start();
/*-----------------------------------------------*/
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.pirnt2();
                }
            }
        }.start();

    }
}

class demo{
    Lock suo =new Lock();
    public void pirnt1(){
        //锁可以用任意对象来设置
        synchronized (suo) {
            System.out.print("机");
            System.out.print("器");
            System.out.print("人");
            System.out.println();
        }
    }
    public void pirnt2(){
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
