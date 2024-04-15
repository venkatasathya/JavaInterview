package programs;

public class Fibonic {
    public static void main(String[] args) {
        int n1=0,n2=1,n3,i,count=9;

        System.out.println(" Number of fib "+count);
        for (i=2;i<count;i++){
            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
