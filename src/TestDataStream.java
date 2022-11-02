 interface TestDataStream {
    int getInt();
    String getString();
    Long getLong();
    Float getFloat();
}
abstract class TestAbstract{
    int getInt() {
        System.out.println("TestAbstract");
        return 0;
    }

    String getString() {
        return null;
    }

    Long getLong() {
        return null;
    }

    Float getFloat() {
        return null;
    }
}
class TestData extends TestAbstract implements TestDataStream{

    @Override
    public int getInt() {
        return 0;
    }

    @Override
    public String getString() {
        return null;
    }

    @Override
    public Long getLong() {
        return null;
    }

    @Override
    public Float getFloat() {
        return null;
    }

    public static void main(String[] args) {
        TestAbstract ab= new TestData();
        ab.getInt();
        System.out.println(ab.getInt());
    }
}
