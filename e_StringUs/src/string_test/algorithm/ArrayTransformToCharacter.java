package string_test.algorithm;
/*
* 需求:把数组中的数据按照指定个格式拼接成一个字符串
* 列举:int[] arr={1,2,4};
* 输出结果:"[1,2,3]"
*
* 分析:
* 需要定义一个字符串"]"
* 遍历数组获取每一个元素
* 用字符串中的元素和数组中的元素进行拼接
* */
public class ArrayTransformToCharacter {
    public static void main(String[] args) {
        int [] arr={5,10,15};
        String str="[";
        for (int i = 0; i < arr.length; i++) {
            if(i == arr.length-1) {
                str = str + arr[i] + "]";
            }else{
                str = str + arr[i]+",";
            }
        }
        System.out.println(str);
    }
}
