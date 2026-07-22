package FILM.Annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE, ElementType.METHOD}) //Specifies where an annotation can be used.
@Retention(RetentionPolicy.RUNTIME) //Specifies how long an annotation exists.
@interface ImportantBlock {
    String name();

    int times() default 1;

    int age();
}
