package streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class SecondSmallestElement {

    public static void main(String[] args) {
        Integer integer = Stream.of(7, 7, 7, 7, 7)
                .distinct()
                .sorted(Comparator.reverseOrder())
                .skip(1)
                .findFirst()
                .orElseThrow(() -> new IllegalArgumentException("array does't have second values"));

        System.out.println(integer);
    }
}
