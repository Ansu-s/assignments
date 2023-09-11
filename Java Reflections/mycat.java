public class mycat {
    private String name ;
    private static int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static int getAge() {
        return age;
    }

    public static void setAge(int age) {
        mycat.age = age;
    }
 public mycat(String name, int age)
 {
     System.out.println("Happy  cat");
 }
public void call(){
        System.out.println("Hello public cat");
    }
    private void privatecall(){
        System.out.println("Hello private cat");
    }
    public static void static_call(){
        System.out.println("Hello public static cat");
    }
    private static  void  private_static_call(){
        System.out.println("Hello private static cat");
    }
    @Override
    public String toString() {
        return "mycat{" +
                "name='" + name + '\'' +
                '}';
    }


}
