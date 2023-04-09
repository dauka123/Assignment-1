import java.util.Scanner;

public class Main {
    public static void chooseTask() {
        Scanner sc = new Scanner(System.in);
        int task = sc.nextInt();
        switch (task) {
            case 1:
                Task1.main();
                break;
            case 2:
                Task2.main();
                break;
            case 3:
                Task3.main();
                break;
            case 4:
                Task4.main();
                break;
            case 5:
                Task5.main();
                break;
            case 6:
                Task6.main();
                break;
            case 7:
                Task7.main();
                break;
            case 8:
                Task8.main();
                break;
            case 9:
                Task9.main();
                break;
            case 10:
                Task10.main();
                break;
        }
    }
    public static void main(String[] args) {
        for(int i = 1; i<=10; i++) System.out.println(i + ") Task " + i);// printing tasks for selecting
        chooseTask();
    }
}