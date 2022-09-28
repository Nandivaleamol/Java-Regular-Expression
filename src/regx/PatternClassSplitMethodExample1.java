package regx;

import java.util.regex.Pattern;

public class PatternClassSplitMethodExample1 {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("\\s");
        String [] str = pattern.split("I am Java Coder i love java");

        for (String s : str){
            System.out.println(s);
        }

        // reverse the string followed by word
//        for (int i=str.length-1; i>=0; i--){
//            System.out.println(str[i]);
//        }
    }
}
