package immutable;

final public class Student {
 final private int id;
 final private String name;

 final private Address address;

    public Address getAddress() {
        return new Address(address);
    }

    public Student(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }


    @Override
    public String toString() {
        return "Student[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", address=" + address +
                ']';
    }

    public int getId() {
        return id;
    }


    public String getName() {
        return name;
    }

}
