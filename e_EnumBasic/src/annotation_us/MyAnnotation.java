package annotation_us;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author kinoz
 * @Date 2022/5/13 - 19:25
 * @apiNote 通过元注解来修饰我们定义的注解
 * Repeatable表示此注解为可复用的
 */
@Inherited
@Repeatable(MyAnnotationII.class)
@Target({TYPE, FIELD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    //default用于指定默认值
    String value() default "MetaInterface";
}
