package programs;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WordCount {
    public static void main(String[] args) {
        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
        Optional<String> s = Optional.of(wordsList.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)))
                .entrySet().stream().max(Comparator.comparing(Map.Entry::getValue))
                .map(Map.Entry::getKey).get());
        System.out.println(s);

       // System.out.println("S"+s.get());
                              /*  wordsList.stream()
                                .map(String::length)
                                .sorted(Comparator.reverseOrder()).forEach(System.out::println);*/

        wordsList.stream()
                .sorted((s1, s2) -> s2.length() - s1.length())
                .forEach(System.out::println);


        Map<Integer, Integer> collect = wordsList.stream().map(String::length)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.summingInt(e -> 1)));
        collect.entrySet().stream().forEach(System.out::println);



    }

    void m1(){
        List<String> wordsList = Arrays.asList("hello", "bye", "ciao", "bye", "ciao");
        wordsList.stream().sorted((s1, s2) -> s1.length() - s2.length()).forEach(System.out::println);
        System.out.println();
    }
}
