package streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class JavaStreamsExample {
    public static void main(String[] args) {

        List<Employee> collect = Arrays.stream(arrayOfEmps).sequential().filter(employee -> employee.getV() > 100000.0).collect(Collectors.toList());
        System.out.println(Optional.ofNullable(collect).isPresent());
        if(Optional.ofNullable(collect).isPresent()) collect.forEach(System.out::println);
    }

    private static Employee[] arrayOfEmps = {
            new Employee(1, "Jeff Bezos", 100000.0),
            new Employee(2, "Bill Gates", 200000.0),
            new Employee(3, "Mark Zuckerberg", 300000.0)
    };
}
