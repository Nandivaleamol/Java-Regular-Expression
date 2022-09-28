package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegXQuantifier {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a+");
        Matcher matcher = pattern.matcher("abaabaaab");
        while (matcher.find()){
            System.out.println(matcher.start()+"----"+matcher.group());

            /*
                0----a
                2----aa
                5----aaa
             */
        }
    }
}
