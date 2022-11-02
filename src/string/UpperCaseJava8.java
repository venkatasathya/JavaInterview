package string;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCaseJava8 {

    static {
        int value;
    }
    public static void main(String[] args) {

        String input = "INDIA";
        input = input.toLowerCase();
        char[] ch = input.toCharArray();
        for(int i=0; i<ch.length; i=i+2){
            ch[i] = Character.toUpperCase(ch[i]);
        }
        System.out.println(new String(ch));
    }


}
