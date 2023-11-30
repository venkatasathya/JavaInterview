package ArrayTest;

public class SecondHighestArray {

    public static void main(String[] args) {
        int[] arr={22,34,45,1,4,23};
        int highest=Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>highest){
                second=highest;
                highest=arr[i];
            }
            /*else if(arr[i]>second && second!=highest){
                second=highest;
            }*/
        }
        System.out.println(second);
    }

    public static int findSecondLargestNumberInTheArray(int array[])
    {
        // Initialize these to the smallest value possible
        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        // Loop over the array
        for (int i = 0; i < array.length; i++) {
            // If current element is greater than highest
            if (array[i] > highest) {

                // assign second highest element to highest element
                secondHighest = highest;

                // highest element to current element
                highest = array[i];
            } else if (array[i] > secondHighest && array[i]!=highest)
                // Just replace the second highest
                secondHighest = array[i];
        }

        // After exiting the loop, secondHighest now represents the second
        // largest value in the array
        return secondHighest;
    }
}

