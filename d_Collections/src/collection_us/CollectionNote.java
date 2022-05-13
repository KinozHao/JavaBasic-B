package collection_us;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import static java.lang.annotation.ElementType.*;

/**
 * @author kinoz
 * @Date 2022/5/13 - 22:45
 * @apiNote This CollectionNote Annotation is for record collections learn note
 * it replace basic note,when you used it more can improve your reading ability
 * @Location JSEI COLLAGE JIANGSU PROVENCE CHINA
 * @since 11
 */
@Documented
@Target({TYPE,FIELD, METHOD, PARAMETER, CONSTRUCTOR,
        LOCAL_VARIABLE, ANNOTATION_TYPE,
        PACKAGE, TYPE_PARAMETER, TYPE_USE, MODULE})
@Retention(RetentionPolicy.RUNTIME)
public @interface CollectionNote {
    String value();


}
