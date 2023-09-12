import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class catReflection {
    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException {
        mycat obj = new mycat("leo",6);
        // System.out.println(obj.toString());
       Field[] catfield = obj.getClass().getDeclaredFields();

        for (Field fd:catfield)
        {
            String  str = fd.getName();
            System.out.println(str);
        }
        for (Field fd1:catfield)
        { if(fd1.getName().equals("name"))
        {
            fd1.setAccessible(true);
            fd1.set(obj,"Ansu's cat");
        }
        System.out.println(obj.getName());
    }
        // Method calling
        Method[] catMethod = obj.getClass().getDeclaredMethods();
        for (Method meth:catMethod)
        {
            System.out.println(meth.getName());
        }
        //System.out.println(catMethod);
        Method[] catMethod1 = obj.getClass().getDeclaredMethods();
        for (Method meth:catMethod1) {
            if (meth.getName().equals("call")) {
              meth.invoke(obj);
                //  System.out.println(meth.getName());
            }
        }
        for (Method meth1:catMethod1) {
            if (meth1.getName().equals("privatecall")) {
                meth1.setAccessible(true);
                meth1.invoke(obj);
                //  System.out.println(meth.getName());
            }
        }

        for (Method meth1:catMethod1) {
            if (meth1.getName().equals("static_call")) {
                meth1.setAccessible(true);
                meth1.invoke(null);
                //  System.out.println(meth.getName());
            }


        }

}}
