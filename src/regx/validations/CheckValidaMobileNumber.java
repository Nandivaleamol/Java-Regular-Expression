package regx.validations;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckValidaMobileNumber {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("(0|91)?[7-9][0-9]{9}");
        boolean flag = true;
        while (flag){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter mobile number:");
            String str = sc.nextLine();
            Matcher matcher = pattern.matcher(str);

            if (matcher.find() && matcher.group().equals(str)){
                System.out.println("Valid Mobile Number");
            }else{
                System.out.println("Invalid Mobile Number");
            }
            System.out.println("Enter 1 for continue: \n Enter 2 for Exit:");
            int n = sc.nextInt();
            if (n==1){
                flag = true;
            }else{
                flag=false;
            }
        }

    }
}
