import java.util.Scanner;

public class Task2 {
    /*
        @ getAverage - definition of average function
        @ n - length of array
        @ arr - array of numbers
        @ return - returning average of array
    */
    public static float getAverage(int n, int[] arr){
        float average = getSum(n, arr) / n;
        return average;
    }
    /*
       @ getSum - definition of sum function
       @ n - length of array
       @ arr - array of numbers
       @ return - returning sum of array
   */
    public static float getSum(int n, int[] arr){
        int sum = arr[n-1];
        if (n == 1){
            return sum;
        }
        sum += getSum(n-1,arr);
        return sum;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i  = 0; i < n; i++ ){
            arr[i] = scanner.nextInt();
        }
        System.out.println(getAverage(n,arr));
    }
}
