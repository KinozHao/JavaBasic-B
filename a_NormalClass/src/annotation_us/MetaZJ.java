package annotation_us;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 * @author kinoz
 * @Date 2022/5/13 - 22:25
 * @apiNote Ԫע��(MetaAnnotation)�������ʹ��
 */

@MyAnnotation("Ԫע����")
@MyAnnotation("�ɸ�����Repeatable")
public class MetaZJ {
    @Test
    //�������ǰ�˽ⰸ��
    public void ReflexTest(){
        //��������MetaAnnotation Inherited��ʹ��
        Class Y = Ano.class;
        Annotation[] fatherAno = Y.getAnnotations();
        for (int i = 0; i < fatherAno.length; i++) {
            System.out.println(fatherAno[i]);
        }

    }
}
//1.����������Ԫע���ʹ��
//2.ͬʱʹ����1.8����������ע��
class Ano<@AnnotationEight("TYPE_PARAMETER����") T> extends MetaZJ{

    public void show() throws @AnnotationEight("����sleep���жϵ��쳣") InterruptedException {
        ArrayList<@AnnotationEight("TYPE_USE����") String> arr = new ArrayList<>();
        int num = (@AnnotationEight("TYPE_USE����") int)10L;
        Thread.sleep(1000);
    }
}