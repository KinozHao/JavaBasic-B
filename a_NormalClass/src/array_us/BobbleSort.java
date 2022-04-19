package array_us;

public class BobbleSort {
    public static void main(String[] args) {
        int [] arr={10,43,53,312,64,1};
        array(arr); //调用排序方法
        printf(arr);    //打印冒泡排序过后的元素
    }
    /*
    * 冒泡排序:
    * 1返回值类型 void
    * 2参数列表 int[] arr
    * */
    public static void array(int [] arr){
        //外循环   只需要比较arr.length-1即可
        for (int i = 0; i <arr.length-1 ; i++) {
        //内循环   -1是为了防止索引越界 -i是为了提高效率
            for (int j = 0; j <arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                    //换位操作
                    swaps(arr,i,j);
                }
            }
        }
    }
    /*
    * 换位操作
    * 1:返回值类型void
    * 2:参数列表 int [] arr,i,j
    * */
    protected static void swaps(int [] arr,int i,int j){
        int tmep = arr[j];
        arr[j]=arr[j+1];
        arr[j+1]=tmep;
    }
    /*
    * 打印数组
    * 1返回值类型void
    * 2参数列表 int[] arr
    * */
    public static void printf(int [] arr){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
