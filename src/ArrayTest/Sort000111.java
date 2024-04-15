package ArrayTest;

import java.util.Arrays;

public class Sort000111 {

    public static void main(String[] args) {
        int[] arr ={0,1,0,1,0,0};
        int starting=0;
        int ending=arr.length-1;
        while(starting<ending){
            if(arr[starting]==1) {
                arr[ending] = arr[ending] + arr[starting];
                arr[starting] = arr[ending] - arr[starting];
                arr[ending] = arr[ending] - arr[starting];
                ending--;
            }
            else {
                starting++;
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
