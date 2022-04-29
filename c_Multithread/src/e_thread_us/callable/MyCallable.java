package e_thread_us.callable;

import java.util.concurrent.Callable;

/**
 * @author kinoz
 * @Date 2022/4/28 - 14:22
 * @apiNote
 */
class MyCallable implements Callable<Integer> {
    private int num;
    //��num���ڵ�����ͷ���
    public MyCallable(int num) {
        this.num = num;
    }

    @Override
    public Integer call() throws Exception {
        //��ͷ���
        int sum =0;
        for (int i = 0; i <= num; i++) {
            sum +=i;
        }
        return sum;
    }
}
