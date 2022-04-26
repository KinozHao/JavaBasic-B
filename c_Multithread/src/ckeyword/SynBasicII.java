package ckeyword;

public class SynBasicII {
    public static void main(String[] args) {
        final Syn dm = new Syn();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.iMethod();
                }
            }
        }.start();
/*-----------------------------------------------*/
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    dm.iiMethod();
                }
            }
        }.start();

    }
}


class Syn {
    Lock suo = new Lock();
    /*
    * 非静态的同步方法的锁对象是什么? 是this
    * 静态的同步方法的锁对象是? 是该类的字节码对象*/

    //同步方法只需要在方法上加synchronized关键词即可
    public synchronized void iMethod(){
            System.out.print("机");
            System.out.print("器");
            System.out.print("人");
            System.out.println();
    }

    //锁不能用匿名对象 因为匿名对象不是同一个对象
    public void iiMethod(){
        synchronized (Syn.class) {
            System.out.print("冥");
            System.out.print("王");
            System.out.print("星");
            System.out.print("球");
            System.out.println();
        }
    }
}
