package c_character;

import java.io.FileWriter;
import java.io.IOException;

public class Demo2FileWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fw=new FileWriter("yyy.txt");
        fw.write("ÄãºÃÖÐ¹ú");

        fw.close();
    }
}
