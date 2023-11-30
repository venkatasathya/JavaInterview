package streams;

import java.util.Arrays;

public class CommonArrays {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,55,6,1};
        int arr2[]={2,3,4,5,1};
        Arrays.stream(arr)
                .distinct()
                .filter(num->Arrays.stream(arr2).anyMatch(arry2->arry2==num))
                .forEach(System.out::println);
    }
}
