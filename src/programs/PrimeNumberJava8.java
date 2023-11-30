package programs;


import java.util.stream.IntStream;

public class PrimeNumberJava8 {
    public static void main(String[] args) {
        

        IntStream.range(2,100).filter(PrimeNumberJava8::isPrime).forEach(System.out::println);
    }
     static Boolean isPrime(int number){
        return number>1 && IntStream.rangeClosed(2,number/2).noneMatch(i -> number % i == 0);
    }
}
