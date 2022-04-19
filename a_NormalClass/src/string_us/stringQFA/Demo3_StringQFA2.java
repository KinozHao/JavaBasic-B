package string_us.stringQFA;
//QFA: String  s1=new String("Oneplus")创建了几个对象?
//Answer:Make 2 Object
//Once at the Constant|pool(常量池) Once at the stack(堆)
public class Demo3_StringQFA2 {
    public static void main(String[] args) {
        String  s1=new String("Oneplus");
        System.out.println(s1);
    }
}
