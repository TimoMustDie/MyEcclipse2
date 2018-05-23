package MyAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(value= {ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
public @interface myAnnotation {
	String color() default "red";
	String value();
	int[] attr() default{1,2,3};
	MataAnnotation mataAnnotation() default @MataAnnotation("aaa");
}
