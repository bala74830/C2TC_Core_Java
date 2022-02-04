package TNS;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;


	@Retention(RetentionPolicy.RUNTIME)
	public @interface SmartPhone {
	
	String Android_version() default"Pie";
	int snapdragon() default 888;
	}
	


