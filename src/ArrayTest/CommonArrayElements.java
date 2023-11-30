package ArrayTest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonArrayElements {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> integers1 = Arrays.asList(2, 3, 4,9);
        List<Integer> collect = integers.stream()
                .filter(integers1::contains)
                .collect(Collectors.toList());
        System.out.println(collect);
    }
}
