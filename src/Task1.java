import java.util.Scanner;

public class Task1 {
    /*
        @ getMin - definition of min
        @ n - lenght of array
        @ arr - array
        @ return - returning minimum of array
    */
    public static int getMin(int n, int[] arr){
        int min1 = arr[n - 1];
        if (n == 1){
            return min1;
        }
        int min2 = getMin(n -1, arr);
        if (min1 < min2){
            return min1;
        }
        else{
            return min2;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i  = 0; i < n; i++ ){
            arr[i] = scanner.nextInt();
        }
        System.out.println(getMin(n, arr));

    }
}
