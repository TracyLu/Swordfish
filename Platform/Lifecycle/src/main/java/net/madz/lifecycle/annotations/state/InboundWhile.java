package net.madz.lifecycle.annotations.state;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface InboundWhile {

    Class<?> relation();

    Class<?>[] on();
}
