package e_thread_us.callable_basic;

import java.util.concurrent.Callable;

/**
 * @author kinoz
 * @Date 2022/4/30 - 17:05
 * @apiNote jdk1.5���� callable�ӿ�ʵ��
 */
//1 ʵ��callable�ӿ�
public class CallableBasic implements Callable {
    //2 ��дcall����
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100 ;i++) {
            if (i % 2 == 0){
                System.out.println(i);
                //1-100�ܺ�
                sum += i;
            }
        }
        //sumΪint���� �Զ������Ϊinteger integer����object������ �ʲ��ᱨ��
        return sum;
    }
}
