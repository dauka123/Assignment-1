import java.util.Scanner;

public class Task9 {
    /*
        @ findBinCoefficient - definition of binomial coefficient
        @ n - given number
        @ k - given number
        @ return - return binomial coefficient
    */
    public static int findBinCoefficient(int n, int k) {
        if(n == k || k == 0){
            return 1;
        }
        else{
            return findBinCoefficient(n-1, k-1) + findBinCoefficient(n-1, k); // formula
        }
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt(); // input numbers
        System.out.print(findBinCoefficient (n, k));
    }
}
