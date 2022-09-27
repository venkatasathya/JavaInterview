package programs;

public class PalindromeExample {
    public static void main(String[] args) {

        int r,sum=0,temp;
        int number=000;
        temp=number;
        while(number>0){
            r=number%10;
            sum=(sum * 10)+r;
            number=number/10;
        }
        if(temp==sum)
        {
            System.out.println("Palindrome");
        }
        else {
            System.out.println("Not a Palindrome...");
        }
    }

}
