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
        try(    //closeû��д ��Ϊ�Զ�������close���� ���Բ鿴���������������Դ��
                FileInputStream fis =new FileInputStream("a.txt");
                FileOutputStream fos=new FileOutputStream("b.txt");
                myclass s=new myclass();    //�Զ�������������Ϊʵ����AutoCloseable�ӿ�
        ){
            int go;
            while ((go = fis.read()) != -1){
                fos.write(go);
            }
        }
    }

    private static void ExceptionJDK6() throws IOException {
        FileInputStream FIS =null;  //����Ҫ��һ������������û���ر�
        FileOutputStream FOS =null;
        try {
          new FileInputStream("xxx.txt");   //��ȡ�ļ�
          new FileOutputStream("copy.txt");

            int b;
            while ((b = FIS.read()) != -1) {
                FOS.write(b);
            }
        }finally {
            try {       //��������Ŀ�ľ�����������⾡���ܹ�һ����һ��
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