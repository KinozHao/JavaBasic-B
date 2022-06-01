package b_io_basic;

import java.lang.annotation.Documented;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author kinoz
 * @Date 2022/6/1 - 22:19
 * @apiNote This Annotation is about some IO Suggestions
 * @Location JSEI Collage Jiangsu Province
 */
@Documented
@Target({TYPE,FIELD, METHOD, PARAMETER, CONSTRUCTOR,
        LOCAL_VARIABLE, ANNOTATION_TYPE,
        PACKAGE, TYPE_PARAMETER, TYPE_USE, MODULE})
public @interface IOAnnotation {
    String value();
}
