package b_byte;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class StreamException {
    public static void main(String[] args) throws IOException {
//        ExceptionJDK6();
        ExceptiongJDK7();
        /*File s=new File("b.txt");
        System.out.println(s.createNewFile());*/
    }

    private static void ExceptiongJDK7() throws IOException {
        try(    //close没有写 因为自动调用了close方法 可以查看输出或者输入流的源码
                FileInputStream fis =new FileInputStream("a.txt");
                FileOutputStream fos=new FileOutputStream("b.txt");
                myclass s=new myclass();    //自定义类可以输出因为实现了AutoCloseable接口
        ){
            int go;
            while ((go = fis.read()) != -1){
                fos.write(go);
            }
        }
    }

    private static void ExceptionJDK6() throws IOException {
        FileInputStream FIS =null;  //必须要有一个参数否则流没法关闭
        FileOutputStream FOS =null;
        try {
          new FileInputStream("xxx.txt");   //读取文件
          new FileOutputStream("copy.txt");

            int b;
            while ((b = FIS.read()) != -1) {
                FOS.write(b);
            }
        }finally {
            try {       //这样做的目的就是如果出问题尽量能关一个是一个
                if (FIS != null)
                    FIS.close();
            }finally {
                if (FOS != null)
                    FOS.close();
            }
        }
    }
}
class myclass implements AutoCloseable{

    public void close() {
        System.out.println("Myself method closed");
    }
}