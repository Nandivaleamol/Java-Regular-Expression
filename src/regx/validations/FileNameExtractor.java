package regx.validations;

import java.io.File;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FileNameExtractor {
    public static void main(String[] args) {
        int count=0;
        //Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$]*[.]txt");
        Pattern p = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_$]*[.]java");
        File file = new File("D://Java Regx//src//regx");
        String [] s = file.list();
        for (String s1 : s){
            Matcher m = p.matcher(s1);
            if (m.find() && m.group().equals(s1)){
                count++;
                System.out.println(s1);
            }
        }
        System.out.println("The total numbers of files : "+count);
    }
}
