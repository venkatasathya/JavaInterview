package streams;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ReverseStringUsingStreams {
    public static void main(String[] args) {
        String str="Ammu Sathya 123";
        //each Char
        char[] chars = str.toCharArray();
        List<Character> collect = IntStream.range(0, chars.length)
                .mapToObj(i -> chars[(chars.length - 1) - i]).collect(Collectors.toList());
        System.out.println(collect);


        //Words Reverse
        String[] s = str.split(" ");
        List<String> collect1 = IntStream.range(0, s.length)
                .mapToObj(i -> s[(s.length - 1) - i]).collect(Collectors.toList());
        System.out.println(collect1);

    }
}
