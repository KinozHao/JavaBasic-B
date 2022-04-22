package FileClass.Features;

import java.io.File;
import java.io.IOException;

public class MakeFeatures {
    public static void main(String[] args) throws IOException {
        File a=new File("Go.txt");  //创建一个txt类型的文件
        System.out.println(a.createNewFile());

        File b=new File("Kinoz");   //创建一个文件夹
        System.out.println(b.mkdir());

        File c=new File("铠甲勇士\\第一季");   //创建文件夹 如果父文件夹不存在,会帮你创建出来
        System.out.println(c.mkdirs());
    }
}
