package string_buffer_basic;
/*
* 开发中建议使用SBuffer或SBuilder来造字符串，可变，提高效率
* */
public class SBufferGzq {
    public static void main(String[] args) {
        //源码分析:底层创建了一个16位的char[]
        StringBuffer sb = new StringBuffer();

        System.out.println(sb.length());    //容器中的字符个数,实际值
        System.out.println(sb.capacity());  //容器的初始容量,理论值

        StringBuffer sb2 = new StringBuffer(10);
        System.out.println(sb2.length());
        System.out.println(sb2.capacity());

        StringBuffer sb3=new StringBuffer("jifeng");
        //扩容问题:添加的数据索引超过底层数据默认长度
        //默认扩容为原来容量二倍+2,同时把原有数组元素复制到新的数组中
        sb3.append("sdfwsawadsdw");
        System.out.println(sb3.length());       //实际字符的个数
        System.out.println(sb3.capacity());     //字符串的length+初始容量
    }
}
