package overriding;

public class MethodOverloadingExample {

    public static void main(String[] args) {
        new MethodOverloadingExample().methodTest( 1);
    }

    public void methodTest(Object object)
    {
        System.out.println("Calling object method");
    }
   public void methodTest(int integer)
    {
        System.out.println("Calling integer method");
    }
}
