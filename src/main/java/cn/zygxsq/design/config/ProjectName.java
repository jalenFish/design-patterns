package cn.zygxsq.design.config;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * Created by yjl on 2020/7/27.
 */
@Documented
@Retention(RUNTIME)
@Target({ElementType.TYPE})
public @interface ProjectName {
    String name() default "";
}
