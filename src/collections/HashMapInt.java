package collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Objects;

class Customer {

    String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return age == customer.age && Objects.equals(name, customer.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    int age;

    Customer(String name,int age)

    {

        this.name=name;

        this.age=age;

    }

    public static void main(String[] args) {

        Customer c1= new Customer("John",20);

        Customer c2= new Customer("John",20);

        HashSet<Customer> customerSet=new HashSet<>();

        customerSet.add(c1);

        customerSet.add(c2);

        System.out.println(customerSet.size());

    }

}