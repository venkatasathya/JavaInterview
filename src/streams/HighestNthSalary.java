package streams;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HighestNthSalary {

    public static void main(String[] args) {
        Map<String,Integer> empDetails=new HashMap<>();
        empDetails.put("anil",10000);
        empDetails.put("suri",20000);
        empDetails.put("Shanku",10000);
        empDetails.put("Thula",30000);
        empDetails.put("Namka",35000);
        empDetails.put("Chararu",10000);

        Map.Entry<Integer, List<String>> integerListEntry = empDetails.entrySet().stream()
                .collect(Collectors.groupingBy(Map.Entry::getValue,
                        Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
                .entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
                .toList().get(2);
        System.out.println(integerListEntry);
    }
}
