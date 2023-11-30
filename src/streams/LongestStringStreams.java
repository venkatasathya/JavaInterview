package streams;

import java.util.Comparator;
import java.util.stream.Stream;

public class LongestStringStreams {
    public static void main(String[] args) {
        Stream.of("india","Austrila","Mahesh")
                .sorted(Comparator.comparing(String::length).reversed())
                .forEach(System.out::println);
    }
}
