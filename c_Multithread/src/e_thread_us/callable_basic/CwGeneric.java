package e_thread_us.callable_basic;

import java.util.concurrent.Callable;

/**
 * @author kinoz
 * @Date 2022/4/28 - 14:22
 * @apiNote ʵ��callable�ӿ� jdk1.5����
 */
class CwGeneric implements Callable<Integer> {
    private int num;
    //��num���ڵ�����ͷ���
    public CwGeneric(int num) {
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
