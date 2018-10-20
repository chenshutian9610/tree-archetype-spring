package javax.persistence;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author er_dong_chen
 * @date 18-10-20
 *
 * length 默认为 255，被修改为 30
 * 添加了一个 comment，用于表中字段的描述
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

}

