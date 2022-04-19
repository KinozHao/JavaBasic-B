package array_us;
//数组高级二分查找代码实现以及注意事项
public class BobbleSort3 {
    public static void main(String[] args) {
        int [] arr={22,33,44,55,66,77};
        System.out.println(getindex(arr,22));
        System.out.println(getindex(arr,44));
        System.out.println(getindex(arr,88));
    }
    /*
    * 返回值类型int
    * 参数类型 ing  [] arr int value
    * */
    public static int getindex(int [] arr,int value){
        int min=0;
        int max=arr.length-1;
        int mid=(min+max) /2;
        while (arr[mid] != value){  //当中间值不等于要查找的值的时候,就开始循环查找
            if(arr[mid]<value) {    //当中间值小于了要找的值的时候
                min = mid + 1;      //最小的索引改变
            }else if (arr[mid]>value){  //当中间的值大于要找的值的时候
                max= mid - 1;           //最大的索引改变
            }
                mid=(min+max) /2;      //无论最大的还是最小的改变,中间的索引都会随之改变

            if (min>max){               //如果最小索引大于最大索引直接返回-1
                return -1;
            }
        }
        return mid;
    }
}