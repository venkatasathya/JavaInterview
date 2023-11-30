package ArrayTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ReverseArrayInPlace {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        for(int i=0;i< array.length/2;i++){
            int j=array[i];
            array[i]=array[array.length-i-1];
            array[array.length-i-1]=j;
        }
        System.out.println(Arrays.toString(array));
        HashMap hashMap;


       Predicate<String> validate= s->s.equalsIgnoreCase("sathya");
    Function<Integer,Integer> function= (s)->s*s;
        System.out.println(function.apply(23));
        System.out.println(validate.test("Sathya"));
    }
}
