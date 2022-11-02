package overloading;

public class TestOverloading {
    public static void main(String[] args) {
    TestOverloading test =new TestOverloading();
    test.p1(null);
    }
    void p1(Object obj){
        System.out.println("Object");
    }

    void p1(String str){
        System.out.println("String class");
    }
}
