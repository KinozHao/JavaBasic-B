package b_io_basic;

import org.junit.Test;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 * 字符流(节点流)
 * @author kinoz
 * @Date 2022/5/31 - 15:20
 * @apiNote Reader和Writer的使用
 * @see FileReader
 * @see FileWriter
 */
public class FileRWBasic {
    @Test
   public void Reader_Test() {
        FileReader fr = null;
        try {
            //1:提供File对象
            File file = new File("accessData.txt");
            //2:提供流对象对File操纵
            fr = new FileReader(file);

            //3.数据的读入
            //read()返回读入的一个字符，如果读取完毕，返回-1
            int data = fr.read();
            while (data != -1) {
                System.out.print((char) data);
                data = fr.read();
            }
        }catch (IOException E){
            E.printStackTrace();
        }finally {
            //4.流的释放操作
            try {
                fr.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }

    @Test
    public void Reader_Improve(){
        FileReader fr = null;
        try {
            //1.提供file对象
            File file = new File("accessData.txt");
            //2.提供流对file对象进行操纵
            fr = new FileReader(file);

            //3.cbuf用于流每次读取字符的数量
            char[] cbuf = new char[5];
            //len用于累计
            int len;
            while ((len = fr.read(cbuf)) != -1){
                //错误写法会多打印值
                /*for (int i = 0; i < cbuf.length; i++) {
                    System.out.println(cbuf[i]);
                }*/
                for (int i = 0; i < len; i++) {
                    //System.out.print(cbuf[i]);
                }
                //写法二 使用String的构造器
                String s = new String(cbuf, 0, len);
                System.out.print(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //4.关闭流
                if (fr != null)
                fr.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }

    /*
    * 写入操作若文件不存在会默认把文件创建出来
    * 若文件存在，构造器append参数为true就是追加
    * 若为false就是覆盖原有数据
    * */
    @Test
    public void Writer_Test() throws IOException {
        File file = new File(   "accessData.txt");
        //append参数为true添加数据 为false覆盖原有数据
        FileWriter fw =new FileWriter(file,true);
        fw.write("zh:这是一个txt类型的文件\n");
        fw.write("en:this is a file end with .txt\n");
        fw.close();
    }
}
