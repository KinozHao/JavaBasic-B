package e_thread_us.excutor_basic;

import java.util.concurrent.Callable;

/**
 * @author kinoz
 * @Date 2022/4/30 - 18:46
 * @apiNote 此线程用于计算1-100的和
 */

class SumThread implements Callable {

    @Override
    public Object call() throws Exception {
        int num = 0;
        for (int i = 0; i <= 100; i++) {
            num += i;
        }
        System.out.println(Thread.currentThread().getName()+"总和为: "+num);
        return null;
    }
}
