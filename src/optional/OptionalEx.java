package optional;

import java.util.Optional;
import java.util.stream.Stream;

public class OptionalEx {
    public static void main(String[] args) {
        Stream<String> india = Stream.of("India", "", null, "TPT");
        Optional<Stream<String>> india1 = Optional.of(india);
        System.out.println(india1.get());
    }
}
