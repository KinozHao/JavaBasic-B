package array_us.bobblesort;

/**
 * @author kinoz
 * @Date 2022/4/29 - 18:49
 * @apiNote 经典冒泡排序
 */
public class ClassicMP {
    public static void main(String[] args) {
        //新建一个数组
        int [] arr ={12,4,26,92,24,652,63,52};
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(" ["+ arr[i] +"] ");
        }

    }
}
