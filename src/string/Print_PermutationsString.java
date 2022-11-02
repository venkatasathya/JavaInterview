package string;

public class Print_PermutationsString {
    public static void main(String[] args) {
        printPermutn("ABC", "");
        String strer="INDIA";
        System.out.println(strer.substring(0,1));

    }

    static void printPermutn(String str, String temp) {

        if (str.length() == 0) {
            System.out.println(temp + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            char chs = str.charAt(i);
            final String perString = str.substring(0, i) + str.substring(i + 1);
            printPermutn(perString, temp + chs);

        }
    }
}
