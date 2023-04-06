import java.util.Scanner;

public class Task8 {
    /*
        @ CheckDigit - definition of function
        @ s - string that we will check
        @ return - returning true or false
     */
    public static boolean CheckDigit(String s) {
        if (s.length() == 0) {
            return true;
        }
        else {
            char a = s.charAt(0);
            if (Character.isDigit(a)) { // check zero's index character
                return CheckDigit(s.substring(1)); // start with the next character
            }
            else {
                return false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next(); // input string
        if(CheckDigit(s)){ // call function
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
    }
}
