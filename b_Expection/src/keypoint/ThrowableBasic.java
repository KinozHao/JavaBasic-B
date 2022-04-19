package keypoint;

public class ThrowableBasic {
    public static void main(String[] args) {
        int [] arr={12,34,54,64};
        try {
            System.out.println(arr[4]);
            System.out.println(1/0);
        } catch (Exception e) {
            System.out.println(e.getMessage());   //异常信息
            System.out.println(e);               //异常类名和异常信息
            e.fillInStackTrace();   //异常类名信息和异常信息出现的位置
        }
    }
}
