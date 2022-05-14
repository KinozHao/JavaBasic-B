package annotation_us;

import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.ElementType.MODULE;

/**
 * @author kinoz
 * @Date 2022/5/13 - 21:53
 * @apiNote 类型注解的使用
 * jdk1.8后新增了TYPE_PARAMETER和TYPE_USE
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE,TYPE_PARAMETER,TYPE_USE})
public @interface AnnotationEight {
    String value();
}
