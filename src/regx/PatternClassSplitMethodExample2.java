package regx;

import java.util.regex.Pattern;

public class PatternClassSplitMethodExample2 {
    public static void main(String[] args) {
        Pattern pattern1 = Pattern.compile("[.]");
        Pattern pattern2 = Pattern.compile("\\.");
        String [] strArr1 = pattern1.split("www.google.com");
        String [] strArr2 = pattern2.split("www.google.com");

        System.out.println("---Using \\. character---");
        for (String s: strArr1){
            System.out.println(s);
        }
        System.out.println("---Using [.] character---");
        for (String s: strArr2){
            System.out.println(s);
        }
    }
}
