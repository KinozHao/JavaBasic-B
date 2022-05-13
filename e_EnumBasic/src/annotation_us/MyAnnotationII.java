package annotation_us;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.MODULE;

/**
 * @author kinoz
 * @Date 2022/5/13 - 21:18
 * @apiNote 作为MyAnnotation的Repeatable中的class参数
 */
@Inherited
@Target({TYPE, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotationII {
    MyAnnotation[] value();
}
