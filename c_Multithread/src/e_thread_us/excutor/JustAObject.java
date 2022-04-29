package e_thread_us.excutor;


class JustAObject implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"..."+i);
        }
    }

    public static void main(String[] args) {

        JustAObject jao =new JustAObject();
        Thread tr =new Thread(jao);
        tr.start();
    }
}
