package string_buffer_us;
//String和Stringbuffer都作为参数传递时候的区别
public class Parameterpassing {
    public static void main(String[] args) {
        String s="heima";
        System.out.println(s);
        change(s);
        System.out.println(s);  //String一旦赋值不会轻易改变

        System.out.println("================");

        StringBuffer sb=new StringBuffer("jifeng");
        System.out.println(sb);
        change(sb);
        System.out.println(sb);
    }

    private static void change(StringBuffer sb) {

        sb.append("xiaozu");    //两个引用指向同一个对象
    }

    public static void change(String s) {

        s+="jifeng";
    }
}
