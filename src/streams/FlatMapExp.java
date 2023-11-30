package streams;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapExp {
    public static void main(String[] args) {

        List<Student> students = List.of(new Student(1, "Lavish",
                        new Location(1, "BLR", "KA")),
                new Student(2, "Yokshi",
                        new Location(2, "TPT", "AP")));
        List<Student> collect = students.stream().filter(s -> null != s.getLocation())
                .toList();
        System.out.println(collect);
       collect.forEach(System.out::println);

    }
}
