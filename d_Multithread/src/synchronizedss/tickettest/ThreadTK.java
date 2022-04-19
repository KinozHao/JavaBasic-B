package synchronizedss.tickettest;
//火车票案例 Thread实现

import sun.security.krb5.internal.Ticket;

class ThreadTK extends Thread{
    //一共有100张票
    private static int ticket = 100;
    @Override
    public void run() {
        while (true) {
                synchronized (Ticket.class) {
                if (ticket <= 0) {
                    break;
                }
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(getName() + "..这是第" + ticket-- + "号票");
            }
        }
    }

}
