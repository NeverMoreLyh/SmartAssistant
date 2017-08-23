package cn.sunline.assistant.annotation;

public @interface Table {
	String id() default "";
	String name() default "";
}
