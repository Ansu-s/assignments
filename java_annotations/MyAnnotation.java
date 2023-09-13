import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target({ElementType.LOCAL_VARIABLE, ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
public @interface MyAnnotation{

}