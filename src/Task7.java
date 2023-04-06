import java.util.Scanner;

public class Task7 {
    /*
        @ reverseOrder - definition of reverse array
        @ n - length of array
        @ arr - array
    */
    public static void reverseOrder(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseOrder(arr, start+1, end-1); // change numbers order
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){  // input numbers to reverse
            arr[i] = scanner.nextInt();
        }
        reverseOrder(arr, 0, arr.length-1);
        for (int i : arr) { // output reversed numbers
            System.out.print(i + " ");
        }
    }
}
