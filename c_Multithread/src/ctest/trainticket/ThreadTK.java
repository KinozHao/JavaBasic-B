package ctest.trainticket;
//火车票案例 Thread实现

class ThreadTK extends Thread{
    //一共有100张票
    private static int all_ticket = 100;
    @Override
    public void run() {
        while (true) {
                synchronized (ThreadTK.class) {
                if (all_ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "..这是第" + all_ticket-- + "号票");
            }
        }
    }

}
