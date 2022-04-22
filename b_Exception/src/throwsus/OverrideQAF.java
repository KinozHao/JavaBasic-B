package throwsus;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/22 - 10:42
 * @apiNote 异常在重写时的问题
 */
public class OverrideQAF {
    @Test
    public void Test(){
        OverrideQAF oqf = new OverrideQAF();
        oqf.method2(new Subclass());
    }

    //若子类异常比父类大，此过程将无法进行
    public void method2(OverrideQAF o){
        try {
            o.method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void method() throws IOException{

    }
}

class Subclass extends OverrideQAF{
    //子类重写父类的方法抛出的异常不能比父类的大
    //否则就会报编译错误
    @Override
    public void method() throws FileNotFoundException{
        System.out.println("hh");
    }

}
