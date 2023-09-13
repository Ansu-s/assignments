import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class execute {

    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
    //    @MyAnnotation

        myClass iobj = new myClass();
        for (Method mth : iobj.getClass().getDeclaredMethods())
        {
            if (mth.isAnnotationPresent(runImmediately.class)){
                runImmediately runObj = mth.getAnnotation(runImmediately.class);
               for (int i=0;i< runObj.runTimes();i++){
                mth.invoke(iobj);
            }}
        }
    }

}
