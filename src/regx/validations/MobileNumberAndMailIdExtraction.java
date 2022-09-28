package regx.validations;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.PrintWriter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MobileNumberAndMailIdExtraction {
    public static void main(String[] args) throws Exception {
        PrintWriter out = new PrintWriter("D://Java Regx//src//regx//validations//mixoutput.txt");
        Pattern p = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        Pattern p2 = Pattern.compile("[a-zA-Z-0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

        BufferedReader reader = new BufferedReader(new FileReader("D://Java Regx//src//regx//validations//input.txt"));
        String line = reader.readLine();

        while (line!=null){
            Matcher m = p.matcher(line);
            Matcher m2 = p2.matcher(line);
            while (m.find() || m2.find()){
                out.println(line);
            }
            line = reader.readLine();
        }
    }
}
