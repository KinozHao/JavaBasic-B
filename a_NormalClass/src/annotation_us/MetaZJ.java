package annotation_us;

import org.junit.Test;

import java.lang.annotation.Annotation;
import java.util.ArrayList;

/**
 * @author kinoz
 * @Date 2022/5/13 - 22:25
 * @apiNote 元注解(MetaAnnotation)的理解与使用
 */

@MyAnnotation("元注解类")
@MyAnnotation("可复用性Repeatable")
public class MetaZJ {
    @Test
    //反射的提前了解案例
    public void ReflexTest(){
        //用于体现MetaAnnotation Inherited的使用
        Class Y = Ano.class;
        Annotation[] fatherAno = Y.getAnnotations();
        for (int i = 0; i < fatherAno.length; i++) {
            System.out.println(fatherAno[i]);
        }

    }
}
//1.此类体现了元注解的使用
//2.同时使用了1.8新特征类型注解
class Ano<@AnnotationEight("TYPE_PARAMETER体现") T> extends MetaZJ{

    public void show() throws @AnnotationEight("关于sleep被中断的异常") InterruptedException {
        ArrayList<@AnnotationEight("TYPE_USE体现") String> arr = new ArrayList<>();
        int num = (@AnnotationEight("TYPE_USE体现") int)10L;
        Thread.sleep(1000);
    }
}