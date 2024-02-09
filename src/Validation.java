import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validation{
    Person p = new Person();
    Scanner sc = new Scanner(System.in);

    public void firstname(){
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
    public void lastname(){
        System.out.println("Enter your Last Name :");
        for(int i=0;;i++) {
            String templast = sc.nextLine();
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
    public void email(){
        System.out.println("Enter your Mail ID :");
        for(int i=0;;i++) {
            String tempemail = sc.nextLine();
            Pattern regex = Pattern.compile("^[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)@[a-zA-Z]+(\\.[a-zA-Z]{2,})(\\.[a-zA-Z]{2,})?$");
            Matcher match = regex.matcher(tempemail);
            if (match.matches()) {
                p.setEmail(tempemail);
                System.out.println("Email ID = "+p.getEmail());break;
            } else{
                System.out.println("Enter Valid Email ID :");
            }
        }
    }
    public void phonenumber(){
        System.out.println("Enter your Phone Number : ");
        for(int i=0;;i++) {
            String tempnum = sc.nextLine();
            Pattern regex = Pattern.compile("^[+]{1}\\d{2} \\d{10}$");
            Matcher match = regex.matcher(tempnum);
            if (match.matches()) {
                p.setPhonenumber(tempnum);
                System.out.println("Phone Number = "+p.getPhonenumber());break;
            } else{
                System.out.println("Enter Valid Phone Number : ");
            }
        }
    }
    public void password(){
        System.out.println("Enter your Password : ");
        for(int i=0;;i++) {
            String temppass = sc.nextLine();
            Pattern regex = Pattern.compile("^((?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])((?=.*[!@#$%^&*_+.']).{1}).{8,})$");
            Matcher match = regex.matcher(temppass);
            if (match.matches()) {
                p.setPassword(temppass);
                System.out.println("Password = "+p.getPassword());break;
            }
            else{
                System.out.println("Enter Valid Password : ");
            }
        }
    }
    public void display(){
        System.out.println("\n"+p+"\n");
    }
}
