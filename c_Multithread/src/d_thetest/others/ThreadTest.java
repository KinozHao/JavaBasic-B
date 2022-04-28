package d_thetest.others;

/**
 * @author kinoz
 * @Date 2022/4/27 - 16:08
 * @apiNote 两个分线程，一个遍历100内的偶数，另外一个遍历奇数
 * 匿名对象的使用
 */
public class ThreadTest {
    public static void main(String[] args) {
        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 == 0){
                        System.out.println(currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    if (i % 2 != 0){
                        System.out.println(currentThread().getName()+":"+i);
                    }
                }
            }
        }.start();
    }
}
