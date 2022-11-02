package string;

public class StringExampleConcatination {
    public static void main(String[] args) {
        String str="India";
        System.out.println(str.hashCode());
        System.out.println(str.concat("Great").hashCode());
        System.out.println(str+"Great".hashCode());

    }
}
