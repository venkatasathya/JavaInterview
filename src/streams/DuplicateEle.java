package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Arrays.asList;

public class DuplicateEle {

    public static void main(String[] args) {

        List<String> cars = new ArrayList<>(
                List.of(
                        "Mercedes",
                        "Toyota",
                        "Nissan",
                        "Volkswagen",
                        "Ford",
                        "Maclaren",
                        "Mercedes",
                        "Nissan",
                        "Ford"
                )
        );

        List<String> collect = cars.stream().distinct().collect(Collectors.toList());

        System.out.println(collect);
    }
}
