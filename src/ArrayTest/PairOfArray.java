package ArrayTest;

import java.util.Stack;

public class PairOfArray {

    public static void main(String[] args) {
        Stack<Integer> stack=new Stack();
        stack.push(23);
        stack.push(24);
        stack.push(26);
        Integer pop = stack.pop();
        System.out.println(stack.pop());
        System.out.println(pop);
        System.out.println(stack.pop());
        System.out.println(stack.pop());

        int []arr={3,6,7,3,2,4,5};
        int sum=9;
        for(int i=0;i<arr.length;i++){
            int first=arr[i];
            for(int j=i+1;j<arr.length;j++){
                int second=arr[j];
                if((first+second)==sum){
                    System.out.println("pair values "+first+" "+second);
                }
            }
        }

    }
}
