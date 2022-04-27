package ckeyword;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class Demo3_Reentrantlock {
    public static void main(String[] args) {
        Printer pr =new Printer();
        //执行线程进行输出
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        pr.pirnt1();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        pr.pirnt2();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
        new Thread(){
            @Override
            public void run() {
                while (true) {
                    try {
                        pr.pirnt3();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }.start();
    }
}

class Printer{
    private int A =1;
    private ReentrantLock r =new ReentrantLock();
    private Condition c1 =r.newCondition();
    private Condition c2 =r.newCondition();
    private Condition c3 =r.newCondition();
    public void pirnt1() throws InterruptedException {

        r.lock();               //加上锁
            if (A != 1){     //while循环是判断循环,每次都会判断标记
                c1.await();   //当前线程等待
            }
            System.out.print("R");
            System.out.print("B");
            System.out.print("T");
            System.out.println();
            A =2;
                c2.signal();
        r.unlock();             //释放锁
    }
    public void pirnt2() throws InterruptedException {
        r.lock();               //上锁
            if (A != 2){
                c2.await();
            }
            System.out.print("M");
            System.out.print("W");
            System.out.print("X");
            System.out.print("Q");
            System.out.println();
            A = 3;
                c3.signal();
        r.unlock();             //释放锁
    }
    public void pirnt3() throws InterruptedException {
        r.lock();
        if (A != 3){
                c3.await();
            }
            System.out.print("D");
            System.out.print("E");
            System.out.print("A");
            System.out.print("D");
            System.out.println();
            A = 1;
                c1.signal();
        r.unlock();
    }
}
