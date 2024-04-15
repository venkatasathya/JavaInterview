public class PrimeNumber {
    static int count =50;
    public static void main(String[] args) {

        for(int i=2;i<=50;i++){

            Boolean valiPrime =isPrime(i);
            if(valiPrime){
                System.out.println("Prime no :"+i);
            }
        }
    }

    public static boolean isPrime(int i){

        boolean validate=true;
        for(int n=2;n<i/2;n++){
            if(i%n==0){
                validate=false;
                break;
            }
        }
        return validate;
    }
}
