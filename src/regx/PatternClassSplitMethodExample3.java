package regx;

import java.util.regex.Pattern;

public class PatternClassSplitMethodExample3 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a");
        String [] strArr = pattern.split("i like java programming language");

        for (String s : strArr){
            System.out.print(s);
        }
    }
}
