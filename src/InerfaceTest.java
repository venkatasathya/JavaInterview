class A1{
    int a=10;
}
class A2 extends A1{
    int a=11;
}

public class InerfaceTest {

    public static void main(String[] args) {
        A2 a2=new A2();
        int a = a2.a;
        System.out.println(a2.a);
    }


}
