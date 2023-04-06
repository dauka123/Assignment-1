import java.util.Scanner;

public class Task5 {
    /*
        @ findFibNum - definition of fibonacci finder function
        @ num - n-th place of number on fibonacci sequence
        @ return - returning n-th number on fibonacci seq
    */
    public static int findFibNum(int num){
        if (num == 0)
            return 0;
        else if (num == 1)
            return 1;
        else
            return findFibNum(num-1) + findFibNum(num-2);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        System.out.println(findFibNum(num));
    }
}
