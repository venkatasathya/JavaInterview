package collections;

import java.util.Arrays;
import java.util.List;

public class ArrayListToArray {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("in", "di", "a");
        String[] objects = (String[]) strings.toArray();
        Object obj;
    }
}
