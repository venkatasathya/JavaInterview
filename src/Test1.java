import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("No", "One", null);
        List<Optional<Boolean>> collect = strings.stream().map(val -> Optional.ofNullable(val != null)).collect(Collectors.toList());
        System.out.println(collect);
    }
}
