package programs;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumber {
    public static void main(String[] args) {
        for(int j=2;j<=100;j++){
            boolean prime = isPrime(j);
            if(prime==true){
                System.out.println("Prime Number in between 1-100 :"+j);
            }
        }

        IntStream.range(1,100).filter(PrimeNumber::isPrime).forEach(System.out::println);
    }

   static boolean isPrime(Integer number){

       boolean isPrime = true;
       for(int i=2;i<=number/2;i++){
           if(number % i == 0){
            isPrime=false;
            break;
           }
       }
        return isPrime;
    }


}
