package string_us.stringGetfunction;

public class intervieQFA {
    public static void main(String[] args) {
        String s="woaiheima";
        s.substring(4);
        System.out.println(s);
        //attention:千万不要以为打印的是heima
        //因为substring会产生一个新的字符串,需要将新的字符串记录
    }
}
