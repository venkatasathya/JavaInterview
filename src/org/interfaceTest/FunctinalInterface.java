package org.interfaceTest;
@FunctionalInterface
public interface FunctinalInterface{
    void getData();

    default int getPhoneNumber() {
        return 0;
    }

    static int getId() {
        return 0;
    }

}
