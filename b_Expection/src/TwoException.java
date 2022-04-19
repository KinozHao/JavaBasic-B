import java.io.FileInputStream;

//编译时异常和运行异常的区别
public class TwoException {
    public static void main(String[] args) {
        try {
            FileInputStream fis=new FileInputStream("GPS.fps");
        }catch (Exception e){
            System.out.println("error");
        }

    }
}
