//基本数据类型包装类 进制转换
public class BaseView {
    public static void main(String[] args) {
        MaxMin();
        BaseChange();
    }


    private static void MaxMin() {
        System.out.println(Integer.MAX_VALUE); //输出int类型最大的数
        System.out.println(Integer.MIN_VALUE); //输出int类型最小的数字
    }

    private static void BaseChange(){
        System.out.println("2进制"+Integer.toBinaryString(60));
        System.out.println("8进制"+Integer.toOctalString(60));
        System.out.println("16进制"+Integer.toHexString(60));
    }
}
