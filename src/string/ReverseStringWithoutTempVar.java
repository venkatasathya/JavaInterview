package string;

public class ReverseStringWithoutTempVar {

    public static void main(String[] args) {

        String stringExample  =  "FavTutor";

        System.out.println("Original string: "+stringExample);

        char[] chars = stringExample.toCharArray();
        int end = chars.length - 1;
        int starting=0;
        while(starting<=end){
            char temp=chars[starting];
            chars[starting]=chars[end];
            chars[end]=temp;
            starting++;
            end--;

        }
        String reversedString = String.valueOf(chars);
        System.out.println("Reversed string: "+reversedString);
    }
}
