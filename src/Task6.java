import java.util.Scanner;

public class Task6 {
    /*
        @ findDegree - definition of function
        @ a - multiplied number
        @ n - times of multiply
        @ return - returning degree of number
    */
    public static int findDegree(int a, int n){
        int degree = a;
        if (n == 1){
            return degree;
        }
        degree *= findDegree(a, n-1); // find the degree and return
        return degree;
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int n = scanner.nextInt(); // input numbers a, n
        System.out.println(findDegree(a,n));
    }
}
