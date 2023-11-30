package designPatterns;

import java.io.Serializable;

class SingleTonDesignPattern implements Cloneable, Serializable {
    private SingleTonDesignPattern(){
        if(instance!=null){
            throw new IllegalStateException("Object creation is restricted using reflection API");
        }
    }


    private static SingleTonDesignPattern instance=null;

    Object readResolve(){
        return instance;
    }

    public static SingleTonDesignPattern getInstance(){
        synchronized (SingleTonDesignPattern.class) {
            if (instance == null) {
                instance = new SingleTonDesignPattern();
            }
        }
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
       throw new CloneNotSupportedException();
    }
}
