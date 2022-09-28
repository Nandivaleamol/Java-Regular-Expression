package regx.validations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidEmailId {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][a-zA-Z0-9_.]*@gmail[.]com");
        boolean flag = true;
        while (flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Email Id : ");
            String email = sc.nextLine();
            Matcher matcher = pattern.matcher(email);

            if (matcher.find() && matcher.group().equals(email)){
                System.out.println("Valid Email ID.");
            }else{
                System.out.println("Invalid Email ID.");
            }
            System.out.println("Enter 1 for continue: \nEnter 2 for Exit:");
            int n = sc.nextInt();
            if (n==1){
                flag= true;
            }else{
                flag = false;
            }
        }


    }
}
