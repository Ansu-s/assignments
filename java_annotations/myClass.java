import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

@MyAnnotation

public class myClass {
  //  @SuppressWarnings("unused")
  @MyAnnotation
  public void showme() {
    System.out.println("hello");
  }


  public void mymthod() {
    System.out.println("hello method1");
  }


  @runImmediately (runTimes = 2)
  public void mymthod1() {
    System.out.println("hello method1");
  }

  public void mymthod2() {
    System.out.println("hello method2");
  }

  @runImmediately
  void shownumber(){
    System.out.println(6+10);
  }

}
