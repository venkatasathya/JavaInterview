package immutable;

public class StudentTest {

    public static void main(String[] args) {
        Address address = new Address("tpt", "517501");
        Student student=new Student(1,"sathya",address );
        System.out.println(student);
        Address newAddress = student.getAddress();
        newAddress.setCity("blr");
        newAddress.setPinCode("560099");
        System.out.println(student);
    }
}
