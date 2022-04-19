package array_us;
import java.util.Arrays;

public class ArraysOverview {

    public static void main(String[] args) {
        int [] arr={22,55,44,77,33};
        System.out.println(Arrays.toString(arr));       //数组转换字符串

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));       //数组排序

        int [] arr2={22,33,44,55,66};                   //数组的索引值
        System.out.println(Arrays.binarySearch(arr2,44));
        System.out.println(Arrays.binarySearch(arr2,66 ));
        System.out.println(Arrays.binarySearch(arr2,77));
    }
}
