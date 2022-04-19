package string_us.stringOverview;

public class Demo1_StringOverview {
    public static void main(String[] args) {
        String str="Jack";      //Jack可以看作一个字符串对象
        str="Tom";              //当把Tom赋值给str,原来的Jack就成了垃圾
        System.out.println(str.toString());//String重写了toString方法返回的是该对象本身
    }
}
