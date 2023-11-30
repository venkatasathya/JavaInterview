package designPatterns;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonTest {
    public static void main(String[] args) throws CloneNotSupportedException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
       SingleTonDesignPattern singleTonDesignPattern=SingleTonDesignPattern.getInstance();
        System.out.println("HashCode for instance 1 "+singleTonDesignPattern.hashCode());

        SingleTonDesignPattern instance = SingleTonDesignPattern.getInstance();
        System.out.println("HashCode for instance 2 "+instance.hashCode());

        try {
            SingleTonDesignPattern clone = (SingleTonDesignPattern)instance.clone();
            System.out.println("clone hashCode :"+clone.hashCode());
        }catch (Exception ex){
            System.out.println(ex.getMessage());
        }


        //Reflection call

      /*  SingleTonDesignPattern singleTonDesignPattern1=null;
        Constructor[] constructors= SingleTonDesignPattern.class.getDeclaredConstructors();
        for (Constructor constructor:constructors) {
            constructor.setAccessible(true);
            singleTonDesignPattern1 = (SingleTonDesignPattern) constructor.newInstance();
        }
        System.out.println("reflection hashCode :"+singleTonDesignPattern1.hashCode());*/

        //Serilization
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("singleton.ser"));
        out.writeObject(instance);
        out.close();

        ObjectInput in = new ObjectInputStream(new FileInputStream("singleton.ser"));
        SingleTonDesignPattern instanceSeralization =(SingleTonDesignPattern) in.readObject();
        System.out.println("Serilization hashcode "+instanceSeralization.hashCode());


    }
}
