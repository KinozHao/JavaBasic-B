package annotation_us;

import org.junit.Test;

import java.util.ArrayList;

/**
 * @author kinoz
 * @Date 2022/5/13 - 19:07
 * @apiNote ע��(Annotation)�������ʹ��
 */

public class ZJBasic implements Message{
    public static void main(String[] args) {
        int a = 19;
    }
    //@MyAnnotation("a") ע����Target�����˲�����������METHOD
    //��ʾ��Ԫ����
    @Test
    public void method(){
    }
    @Override
    public void OldMes() {

        @SuppressWarnings("unused")
        int num = 10;
        //��ʾ�˱���û��ʹ��
        @SuppressWarnings({"unused","rawtypes"})
        ArrayList alt = new ArrayList();
    }
}

interface Message{
    //��ʾ������ʱ
    @Deprecated
    void OldMes();
}
