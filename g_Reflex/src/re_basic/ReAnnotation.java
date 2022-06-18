package re_basic;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;

/**
 * @author kinoz
 * @Date 2022/6/18 - 16:40
 * @apiNote This annotation for reflex get
 */
@Documented
//which type can us this annotation
@Target({TYPE,FIELD, METHOD, PARAMETER, CONSTRUCTOR,
        LOCAL_VARIABLE, ANNOTATION_TYPE,
        PACKAGE, TYPE_PARAMETER, TYPE_USE, MODULE})
//This annotation's life circle
@Retention(RetentionPolicy.RUNTIME)
public @interface ReAnnotation {
    String value() default "hello";
}
