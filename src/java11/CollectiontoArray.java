package java11;

import java.util.List;

public class CollectiontoArray {
    public static void main(String[] args) {
        List<String> list = List.of("foo", "bar", "baz");
        Object objects = list.toArray();

        System.out.println(objects);

    }
}
