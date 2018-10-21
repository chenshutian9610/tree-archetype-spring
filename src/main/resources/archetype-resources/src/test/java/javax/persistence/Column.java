package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author er_dong_chen
 * @date 18-10-20
 *
 * 添加了 comment 和 defaultValue
 */

@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Column {
    String name() default "";

    boolean unique() default false;

    boolean nullable() default true;

    boolean insertable() default true;

    boolean updatable() default true;

    String columnDefinition() default "";

    String table() default "";

    int length() default 30;

    int precision() default 0;

    int scale() default 0;

    /* modify here */
    String comment() default "";

    String defaultValue() default "null";   //  defaultValue 值为 null 时不会被识别

}