package regex;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class RegexPredicateExample {
    public static void main(String[] args) {

        Predicate<String> emailFilter = Pattern
                .compile("^(.+)@google.com$")
                .asPredicate();
        // Apply predicate filter
        // Input list
        List<String> emails = Arrays.asList("alex@example.com", "bob@yahoo.com",
                "cat@google.com", "david@example.com");
        List<String> desiredEmails = emails
                .stream()
                .filter(emailFilter)
                .toList();

        // Now perform desired operation
        desiredEmails.forEach(System.out::println);
    }
}
