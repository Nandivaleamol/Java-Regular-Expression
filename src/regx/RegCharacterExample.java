package regx;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegCharacterExample {
    public static void main(String[] args) {

        Pattern pattern = Pattern.compile("[^a-zA-Z0-9]");
        Matcher matcher = pattern.matcher("a1m@l#Z8");
        while (matcher.find()){
            System.out.println(matcher.start()+"-------"+matcher.group());
            /*
              3-------@
              5-------#
              */
        }
    }
}
