package programs;

import java.util.Comparator;

final class ImmutableClass  {
    private final int id;
    private final  String name;

    public int getId() {
        return id;
    }



    public String getName() {
        return name;
    }



    public String getAddress() {
        return address;
    }



    private String address;

    public ImmutableClass(int id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


}

public class CustomImmutableClass {
    public static void main(String[] args) {
        ImmutableClass st= new ImmutableClass(1,"Sathya","India");
        System.out.println(st.getAddress());



    }
}
