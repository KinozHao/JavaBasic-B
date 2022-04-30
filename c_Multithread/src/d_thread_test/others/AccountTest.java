package d_thread_test.others;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @author kinoz
 * @Date 2022/4/30 - 14:22
 * @apiNote 客户类练习 synchronized关键词和lock的使用
 */
public class AccountTest {

    public static void main(String[] args) {
        //新建账户对象
        Account account = new Account(0);
        //两个客户分别获取账户对象，并进行存钱操作
        Customer c1 = new Customer(account);
        Customer c2 = new Customer(account);
        Thread tr1 = new Thread(c1);
        Thread tr2 = new Thread(c2);
        tr1.setName("刘建国");
        tr2.setName("刘小儿");
        tr1.start();
        tr2.start();


    }
}

class Account{
    //账户初始金额
    private int balance;

    public Account(int balance) {
        this.balance = balance;
    }
    //锁的应用(true表示公平锁)
    ReentrantLock lock = new ReentrantLock(true);

    //存钱方法 线程不安全 通过lock来保证安全
    public void deposit(double depositNum){
        lock.lock();
        if (depositNum > 0){
            balance += depositNum;
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+":存入成功 账户总余额:"+balance+"$");
        }
        lock.unlock();

    }

}

class Customer implements Runnable{
    //此时账户就作为共享独享出现
    private Account acct;

    //可能会用构造器造多个对象
    public Customer(Account acct) {
        this.acct = acct;
    }

    @Override
    //分三次存钱
    public void run() {
        for (int i = 0; i < 3; i++) {
            acct.deposit(1000);
        }
    }
}
