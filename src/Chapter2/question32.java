package Chapter2;

import java.util.Scanner;

public class question32 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        System.out.println("Enter the third number:");
        int num3 = scanner.nextInt();

        System.out.println("Enter the fourth number:");
        int num4 = scanner.nextInt();

        System.out.println("Enter the fifth number:");
        int num5 = scanner.nextInt();

        int negativeCount = 0;
        int positiveCount = 0;
        int zeroCount = 0;


        if (num1 < 0) {
            negativeCount++;
        } else if (num1 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }
        if (num2 < 0) {
            negativeCount++;
        } else if (num2 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        if (num3 < 0) {
            negativeCount++;
        } else if (num3 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        if (num4 < 0) {
            negativeCount++;
        } else if (num4 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        if (num5 < 0) {
            negativeCount++;
        } else if (num5 > 0) {
            positiveCount++;
        } else {
            zeroCount++;
        }

        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of zeros: " + zeroCount);


    }
}
