package ArrayTest;

import java.util.Comparator;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class InsertArrayIndex {
    public static void main(String[] args) {
        int values[]={3,4,5,6,7,8,9};
       // int values2=values[values.length+1];
        Comparable cm;
        Comparator ct;
        Consumer<Integer> predicate= (a)->System.out.println("Printing :"+a);
        predicate.accept(23);

    }
}
