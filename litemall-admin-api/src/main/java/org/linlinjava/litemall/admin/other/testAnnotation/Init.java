package org.linlinjava.litemall.admin.other.testAnnotation;
import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @author lijiongfei
 * @Title: Init
 * @ProjectName litemall
 * @Description: TODO
 * @date 2019/1/1617:23
 */
@Documented
@Inherited
@Target({ ElementType.FIELD, ElementType.METHOD })
@Retention(RetentionPolicy.RUNTIME)
public @interface Init
{
    public String value() default "";
}