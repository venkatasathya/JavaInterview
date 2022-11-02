package string;

public class ReverseString {
    public static void main(String[] args) {
        String ipString = "INDIA";
        String reverse="";
        for(int i=0;i<ipString.length();i++){
            Character ch=ipString.charAt(i);
            reverse = ch+reverse;
        }
        System.out.println(reverse);

    }
}
