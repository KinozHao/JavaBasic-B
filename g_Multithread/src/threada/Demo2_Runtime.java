package threada;

import java.io.IOException;

public class Demo2_Runtime {
    public static void main(String[] args) throws IOException {
        Runtime r =Runtime.getRuntime();
//        r.exec("shutdown -s -t 300");     //规定多长时间后关闭计算机
        r.exec("shutdown -a");     //取消关闭指令
    }
}
