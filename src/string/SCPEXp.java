package string;

import java.nio.charset.StandardCharsets;
import java.util.Base64;

public class SCPEXp {
    public static void main(String[] args) {
        String str="Venkata";
        String str1="Venkata";
        String str2=new String(str1);
        System.out.println(str.hashCode());
        System.out.println(str1.hashCode());
        System.out.println(str.equals(str1));
        System.out.println(str==str1);
        System.out.println(str.equals(str2));
        System.out.println(str == str2);
        System.out.println(str.getBytes(StandardCharsets.UTF_8));
        System.out.println(str2.getBytes(StandardCharsets.UTF_8));
        String s=new String(str.getBytes(StandardCharsets.UTF_8),StandardCharsets.UTF_8);
        String s1 = Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
        byte[] decode = Base64.getDecoder().decode(s1);
        System.out.println("decode"+decode);

        System.out.println(new String(decode,StandardCharsets.UTF_8));
        System.out.println(s);
    }
}
