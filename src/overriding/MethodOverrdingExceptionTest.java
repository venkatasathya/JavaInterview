package overriding;

import java.io.IOException;

public class MethodOverrdingExceptionTest {

}
class A{

    public void method() throws IOException
    {

    }
}
class B extends A{

    public void method() /*throws Exception*/
    {

    }
}