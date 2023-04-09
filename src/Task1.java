import java.util.Scanner;

public class Task1 {
    /*
        @ findMin - definition of min
        @ n - length of array
        @ arr - array
        @ return - returning minimum of array
    */
    public static int findMin(int n, int[] arr){
        int min1 = arr[n - 1];
        if (n == 1){
            return min1;
        }
        int min2 = findMin(n -1, arr);
        return Math.min(min1, min2); // find the minimum with Math library
                                     // and returning the minimum
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i  = 0; i < n; i++ ){ // input array
            arr[i] = scanner.nextInt();
        }
        System.out.println(findMin(n, arr));

    }
}
