package threadstatus;
//加入线程
public class Thread_Join {
    public static void main(String[] args) {
        final Thread t1=new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(getName()+"...CTO");
                }
            }
        };

        Thread t2=new Thread(){ //匿名内部类在使用它所在方法中的局部变量的时候必须用final修饰
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    if (i == 2){
                        try {
//                            t1.join();
                            t1.join(1); //插队指定的时间,过了指定的时间后,两线程交替执行
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println(getName()+"...Career");
                }
            }
        };

        t1.start();
        t2.start();
    }
}
