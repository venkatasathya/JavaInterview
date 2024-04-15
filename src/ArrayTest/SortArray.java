package ArrayTest;

import java.util.Arrays;

public class SortArray {

    public static void main(String[] args) {
        int arr[]={67,-1,33,56,7,6,3,33,67,5};
        for(int i=0;i<arr.length;i++){
            for (int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        Arrays.stream(arr).forEach(System.out::println);
    }
}
