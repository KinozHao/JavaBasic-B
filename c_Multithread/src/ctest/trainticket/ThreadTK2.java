package ctest.trainticket;

/**
 * @author kinoz
 * @Date 2022/4/27 - 19:50
 * @apiNote Thread买票案例，线程不安全的
 */
public class ThreadTK2 extends Thread{
    private static int all_ticket = 100;
    @Override
    public void run() {
        while (true){
            if (all_ticket <= 0){
                break;
            }

           all_ticket--;

            System.out.println(getName()+"卖出票号为["+ all_ticket+"]");
        }
    }

    public ThreadTK2(String name) {
        super(name);
    }
}
