package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegXPreDefinedCharClasses {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("\\s");
        Matcher matcher = pattern.matcher("a7b k@9");
        while (matcher.find()){
            System.out.println(matcher.start()+"------"+matcher.group());
            // 3------
        }
    }
}
