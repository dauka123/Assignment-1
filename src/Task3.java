import java.util.Scanner;

public class Task3 {
    /*
        @ checkPrime - definition of checking prime function
        @ num - number that need to check for prime
        @ return - returning result of checking
    */
    public static String checkPrime(int num){
        int x = 1;
        for (int i = 2; i < num-1; i++){
            if (num % i == 0) {
                x += 1; // if number have any other dividers we will know
            }
        }
        if (x == 1){
            return "Prime";
        }
        else{
            return "Composite";
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // input num
        System.out.println(checkPrime(num));
    }
}