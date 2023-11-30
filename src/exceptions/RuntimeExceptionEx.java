package exceptions;

import java.io.FileNotFoundException;

class Parent{
    public void m1()throws FileNotFoundException {

    }
}
public class RuntimeExceptionEx extends Parent {
    @Override
    public void m1() {

    }
}
