package streams;

import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class HighestValueStream {
    public static void main(String[] args) {
        Stream<Integer> integerStream = Stream.of(1, 2, 3, 4, 5, 6, 7, 8);
        Integer integer = integerStream
                .sorted(Comparator.reverseOrder())
                .limit(2)
                .skip(1)
                .findFirst()
                .get();
        System.out.println(integer);
    }
}
