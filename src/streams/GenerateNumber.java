package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class GenerateNumber {
    public static void main(String[] args) {
        Stream.generate(Math::random).limit(4);

    }
}
