package Chapter2;

import java.util.Scanner;

public class question30 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter five numbers: ");
        int number = scanner.nextInt();

        int digit1 = number /10000;
        int digit2 = (number % 10000) / 1000;
        int digit3 = (number % 1000) / 100;
        int digit4 = (number % 100) /10;
        int digit5 = number % 10;

        System.out.printf("%d  %d  %d  %d  %d%n  ", digit1,digit2,digit3,digit4,digit5);

    }
}
