package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class WordCount {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
        Optional<String> s = Optional.of(wordsList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1))).entrySet().stream().max(Comparator.comparing(Map.Entry::getValue)).map(Map.Entry::getKey).get());

        System.out.println("S"+s.get());
                                wordsList.stream()
                                .map(String::length)
                                .sorted(Comparator.reverseOrder()).forEach(System.out::println);


    }
}
