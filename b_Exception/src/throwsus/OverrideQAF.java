package throwsus;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * @author kinoz
 * @date 2022/4/22 - 10:42
 * @apiNote �쳣����дʱ������
 */
public class OverrideQAF {
    @Test
    public void Test(){
        OverrideQAF oqf = new OverrideQAF();
        oqf.method2(new Subclass());
    }

    //�������쳣�ȸ���󣬴˹��̽��޷�����
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
    //������д����ķ����׳����쳣���ܱȸ���Ĵ�
    //����ͻᱨ�������
    @Override
    public void method() throws FileNotFoundException{
        System.out.println("hh");
    }

}
