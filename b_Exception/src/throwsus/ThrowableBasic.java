package throwsus;
/** @apiNote
 * Throwable本身是一个接口，它的实现类
 * error和exception是开发中常用的异常类
 * 它的内部也定义了一些常用方法去供实现类去调用
 * */
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
