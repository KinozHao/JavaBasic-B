package array_us;
//数组类型转换为String类型
public class ArrayToString {
    public static void main(String[] args) {
        int [] arr={1,3,5,7,8};     //定义数组
        System.out.println(Method(arr));
    }
    /*
    * 返回值类型 String
    * 参数列表 int[] arr
    * */
    public static String Method(int [] arr){
        StringBuffer sb=new StringBuffer(); //StringBuffer缓冲区
        sb.append("[");                     //添加[字符
        for (int i = 0; i < arr.length; i++) {  //数组遍历
//            sb.append(arr[i]+", ");
            if (i==arr.length-1){           //判断是否相符合 末尾是]还是,
                sb.append(arr[i]).append("]");
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        return sb.toString();               //返回StringBuffer缓冲区
    }

}