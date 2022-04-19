package integers;
//包装类Integer的概述是运用
public class IntergerMethod {
    public static void main(String[] args) {
        MaxAndMin();
        Construction();
    }

    private static void Construction() {
        Integer i1=new Integer(100);
        System.out.println(i1);
        Integer s2=new Integer("100");
//        Integer s3=new Integer("abc");  //NumberFormatException 数字格式异常 里面只能存放数字
//        System.out.println(s3);
        System.out.println(s2);
    }

    private static void MaxAndMin() {
        System.out.println(Integer.MAX_VALUE); //输出int类型最大的数
        System.out.println(Integer.MIN_VALUE); //输出int类型最小的数字
    }
}
