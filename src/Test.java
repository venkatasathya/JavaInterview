import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(70, 80, 50, 80, 40, 70, 88, 10, 30, 70, 30);
        //Collections.reverse(integers);
        try (Stream<Map.Entry<Integer, Long>> sorted = integers.stream()
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))) {
            sorted.forEach(System.out::println);
        }

        List<Integer> collect = integers.stream()
                                .filter(val -> String.valueOf(val).startsWith("8"))
                                .collect(Collectors.toList());
        System.out.println(collect);
        //collect.entrySet().stream().sorted(Comparator.comparing(Map.Entry::getValue).reversed()).forEach(System.out::println);



    }
}
