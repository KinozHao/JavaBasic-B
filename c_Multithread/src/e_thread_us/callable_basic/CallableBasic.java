package e_thread_us.callable_basic;

import java.util.concurrent.Callable;

/**
 * @author kinoz
 * @Date 2022/4/30 - 17:05
 * @apiNote jdk1.5新增 callable接口实现
 */
//1 实现callable接口
public class CallableBasic implements Callable {
    //2 重写call方法
    @Override
    public Object call() throws Exception {
        int sum = 0;
        for (int i = 1; i <= 100 ;i++) {
            if (i % 2 == 0){
                System.out.println(i);
                //1-100总和
                sum += i;
            }
        }
        //sum为int类型 自动封箱成为integer integer又是object的子类 故不会报错
        return sum;
    }
}
