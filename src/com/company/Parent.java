package com.company;

public class Parent {
    Object add(Object obj)throws NullPointerException{
        System.out.println("Parent");
        return "Parent";
    }
}

class Child extends Parent{
    String add(String str)throws NullPointerException{
        System.out.println("Child");
        return "Child";
    }

    public static void main(String[] args) {
        Parent ch= new Child();
        ch.add(null);
        Child child=new Child();
        child.add(null);
        Parent parent=new Parent();
        parent.add(null);
    }

}
