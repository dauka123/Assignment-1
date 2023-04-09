import java.util.Scanner;

public class Task2 {
    /*
        @ findAverage - definition of average function
        @ n - length of array
        @ arr - array of numbers
        @ return - returning average of array
    */
    public static float findAverage(int n, int[] arr){
        float average = findSum(n, arr) / n; // find the average of array
        return average;
    }
    /*
       @ findSum - definition of sum function
       @ n - length of array
       @ arr - array of numbers
       @ return - returning sum of array
   */
    public static float findSum(int n, int[] arr){
        int sum = arr[n-1];
        if (n == 1){
            return sum;
        }
        sum += findSum(n-1,arr); // find the sum of array
        return sum;
    }
    public static void main() {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i  = 0; i < n; i++ ){ // input array
            arr[i] = scanner.nextInt();
        }
        System.out.println(findAverage(n,arr));
    }
}
