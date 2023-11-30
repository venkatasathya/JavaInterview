package streams;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseArrayInStreams {
    public static void main(String[] args) {
        int[] num ={23,34,33,55,66};
        IntStream.range(0,num.length/2).forEach(
                i->{
                    int temp=num[i];
                    num[i]=num[num.length-i-1];
                    num[num.length-i-1]=temp;
                }

        );
        System.out.println(Arrays.toString(num));

    }
}
