import java.util.Scanner;

public class Task5 {
    /*
        @ findFibonacciNum - definition of fibonacci finder function
        @ num - n-th place of number on fibonacci sequence
        @ return - returning n-th number on fibonacci seq
    */
    public static int findFibonacciNum(int num){
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return findFibonacciNum(num-1) + findFibonacciNum(num-2); // formula to find the number in seq
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt(); // input number
        System.out.println(findFibonacciNum(num));
    }
}
