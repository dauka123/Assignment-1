import java.util.Scanner;

public class Task4 {
    /*
        @ findFactorial - definition of factorial function
        @ num - number that need to be factorized
        @ return - returning factorized number
    */
    public static int findFactorial(int num){
        if (num == 1){
            return num;
        }
        num *= findFactorial(num-1);
        return num;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(findFactorial(num));
    }
}