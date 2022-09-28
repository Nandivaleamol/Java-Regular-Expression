package regx.validations;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MailIdExtraction01{
    public static void main(String[] args) throws IOException {
        PrintWriter out = new PrintWriter("D://Java Regx//src//regx//validations//output.txt");
        Pattern p = Pattern.compile("[a-zA-Z-0-9][a-zA-Z0-9_.]*@[a-zA-Z0-9]+([.][a-zA-Z]+)+");

        BufferedReader reader = new BufferedReader(new FileReader("D://Java Regx//src//regx//validations//input.txt"));
        String line = reader.readLine();

        while (line!=null){

            Matcher m = p.matcher(line);
            while (m.find()){
                out.println(m.group());
            }
            line = reader.readLine();
        }
        reader.close();
        out.flush();

    }
}
