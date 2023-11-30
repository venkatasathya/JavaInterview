package optional;

import java.util.Collections;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class OptionalEx {
    public static void main(String[] args) {
        Stream<String> india = Stream.of("India", "", null, "TPT");
        Stream<String> stringStream = Optional.of(india).get();
        System.out.println(stringStream.distinct());

        "Catus".chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet().stream()
                .filter(entry->entry.getValue()==1)
                .findFirst()
                .ifPresent(System.out::println);
    }
}
