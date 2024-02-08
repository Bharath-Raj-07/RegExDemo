import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation{
    Person p = new Person();
    Scanner sc = new Scanner(System.in);

    public void fname(){
        System.out.println("Enter your First Name :");
        for(int i=0;;i++) {
            String tempfirst = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(tempfirst);
            if (match.matches()) {
                p.setFirstname(tempfirst);
                System.out.println("First Name = "+p.getFirstname());break;
            } else{
                System.out.println("Enter Valid First Name :");
            }
        }
    }
    public void lname(){
        System.out.println("Enter your Last Name :");
        for(int i=0;;i++) {
            String templast = sc.next();
            Pattern regex = Pattern.compile("^[A-Z]{1}[a-z]{1}[a-z]+$");
            Matcher match = regex.matcher(templast);
            if (match.matches()) {
                p.setLastname(templast);
                System.out.println("Last Name = "+p.getLastname());break;
            } else{
                System.out.println("Enter Valid Last Name :");
            }
        }
    }
    public void e_mail(){
        System.out.println("Enter your Mail ID :");
        for(int i=0;;i++) {
            String tempemail = sc.next();
            Pattern regex = Pattern.compile("^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,4}$");
            Matcher match = regex.matcher(tempemail);
            if (match.matches()) {
                p.setEmail(tempemail);
                System.out.println("Email ID = "+p.getEmail());break;
            } else{
                System.out.println("Enter Valid Email ID :");
            }
        }
    }
    public void display(){
        System.out.println("\n"+p+"\n");
    }
}
