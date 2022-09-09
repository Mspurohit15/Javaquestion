Very useful for  valid input formate 





import java.util.Scanner;
class UsernameValidator {
    /*
     * Write regular expression here.
     */
      static{
        regularExpression="^[a-zA-Z]{1}[\\w]{7,29}";
    }
    public static final String regularExpression ;
}


public class Solution {
    private static final Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        int n = Integer.parseInt(scan.nextLine());
        while (n-- != 0) {
            String userName = scan.nextLine();

            if (userName.matches(UsernameValidator.regularExpression)) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }           
        }
    }
}
