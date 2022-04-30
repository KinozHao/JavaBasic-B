package e_thread_us.excutor_basic;

/**
 * @author kinoz
 * @Date 2022/4/30 - 18:46
 * @apiNote 此线程用于实现冒泡排序算法
 */
public class BubbleThread implements Runnable{
    @Override
    public void run() {
        int [] arr = {1,423,565,123,64,121,5231,676,2};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]) {
                    exchangeMethod(arr, i, j);
                }

            }
        }
        System.out.print(Thread.currentThread().getName() + "冒泡排序算法:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ["+arr[i]+"] ");
        }
    }
    protected void exchangeMethod(int [] arr,int i ,int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;
    }
}
