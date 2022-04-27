package ctest.trainticket;
//火车票案例 Thread实现

class ThreadTK extends Thread{
    //一共有100张票
    private static int all_ticket = 100;
    @Override
    public void run() {
        while (true) {
            synchronized (ThreadTK.class) {
                //票小于时直接跳出
                if (all_ticket <= 0) {
                    break;
                }
                //每销售一张，递减一次
                all_ticket--;

                System.out.println(getName() + "这是第" + all_ticket + "号票");
            }
        }
    }

    public ThreadTK(String name) {
        super(name);
    }
}
