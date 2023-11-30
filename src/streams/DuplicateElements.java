package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class DuplicateElements {

    public static void main(String[] args) {
        String value= "ssaatthhyya";
        List<String> collect = Arrays.stream(value.split(""))
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .filter(x -> x.getValue() == 1)
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        System.out.println(collect);
    }
}
