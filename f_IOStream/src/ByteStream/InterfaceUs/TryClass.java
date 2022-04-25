package ByteStream.InterfaceUs;

import java.io.File;
import java.io.IOException;

public class TryClass implements PictureSecret {
    public static void main(String[] args) throws IOException {
        File s=new File("c.txt");
        System.out.println("Judge is true or false:<"+s.createNewFile()+">");
        PictureSecret.method();
    }
}
