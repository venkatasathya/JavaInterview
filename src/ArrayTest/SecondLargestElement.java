public class Test2 {
    public static void main(String[] args) {
        int arr[]= {1,3,2,5,4,3,1};
        int firstValue=0;
        int secondValue=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>firstValue){
                secondValue=firstValue;
                firstValue=arr[i];

            } else if (arr[i]>secondValue && arr[i]!=firstValue) {
                secondValue=arr[i];
            }

        }
        System.out.println(secondValue);
    }
}
