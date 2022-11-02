package overloading;

public class OverloadingReturnTypes {
    public static void main(String[] args) {
        OverloadingReturnTypes overloadingReturnTypes=new OverloadingReturnTypes();
        overloadingReturnTypes.print(0.4);
    }
   /* //public void print(Integer i) {
        System.out.println("Integer");
    }*/

    public void print(Object i) {
        System.out.println("Object");
    }
    public void print(String i) {
        System.out.println("String");
    }

   /* public void print(long i) {
        System.out.println("long");
    }*/
}
