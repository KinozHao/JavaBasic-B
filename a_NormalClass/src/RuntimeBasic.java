import java.io.IOException;
/**
 * @author kinoz
 * @Date 2022/4/26 - 21:18
 * @apiNote  Runtime的方法可实现PC的dos命令
 * Runtime类是饿汉式，需要通过getRuntime获取使用
 */
public class RuntimeBasic {
    public static void main(String[] args) throws IOException {
        Runtime r = Runtime.getRuntime();
//        r.exec("shutdown -s -t 300");     //规定多长时间后关闭计算机
        r.exec("shutdown -a");     //取消关闭指令
    }
}
