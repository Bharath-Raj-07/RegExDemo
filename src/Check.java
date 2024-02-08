import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Check {
    public void firstname(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first name");
        for(int i=0;;i++) {
            String fname = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(fname);
            if (match.matches()) {
                System.out.println("First Name = "+fname);break;
            } else{
                System.out.println("Enter Valid First Name");
            }
        }
    }
}
