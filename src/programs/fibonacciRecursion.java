package programs;

public class fibonacciRecursion {
    public static void main(String[] args) {
        printFibonacci(9);
    }

    static int feb(int value) {
        if (value <= 1) {
            return value;
        }
        else {
            System.out.println((value - 1) + (value - 2));
            return feb(value - 1) + (value - 2);
        }
    }

    static int n1=0,n2=1,n3=0;
    static void printFibonacci(int count) {
        if (count > 0) {
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
            System.out.print(" " + n3);
            printFibonacci(count - 1);
        }
    }
    }
