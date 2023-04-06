import java.util.Scanner;

public class Task10 {
    /*
        @ findGCD - definition of function
        @ a - given number
        @ b - given number
        @ return - returning gcd of 2 numbers
    */
    public static int findGCD(int a, int b) {
        if (b == 0){
            return a;
        }
        return findGCD(b, a % b); // Euclidean Algorithm
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(findGCD(a, b));
    }
}
