package annotation_us;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author kinoz
 * @Date 2022/5/13 - 19:25
 * @apiNote ͨ��Ԫע�����������Ƕ����ע��
 * Repeatable��ʾ��ע��Ϊ�ɸ��õ�
 */
@Inherited
@Repeatable(MyAnnotationII.class)
@Target({TYPE, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //default����ָ��Ĭ��ֵ
    String value() default "MetaInterface";
}
