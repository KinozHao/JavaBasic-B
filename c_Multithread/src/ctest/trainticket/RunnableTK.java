package ctest.trainticket;

/**
 * @apiNote 火车片案例 runnable接口实现
 * 使用synchronized
 * @author kinoz
 * @Date 2022/4/15
 * */
class RunnableTK implements Runnable{
    private int ticket =100;
    @Override
    public void run() {
        while (true) {
            synchronized (this) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "..这是第" + ticket-- + "号票");
            }
        }
    }
}

