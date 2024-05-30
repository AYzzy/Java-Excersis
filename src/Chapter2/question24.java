package Chapter2;

import java.util.Scanner;

public class question24 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number3 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number4 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number5 = scanner.nextInt();

        if(number1 > number2 && number1 >number3 && number1 >number4 && number1 >number5 ){
            System.out.printf("%d is greater than %d,%d,%d and %d%n",number1,number2,number3,number4,number5);
        } else if (number2 > number1 && number2 > number3 && number2 >number4 && number2 >number5) {
            System.out.printf("%d is greater than %d,%d,%d and %d%n", number2, number1, number3, number4, number5);
        } else if (number3 > number1 && number3 > number2 && number3 >number4 && number3 >number5) {
            System.out.printf("%d is greater than %d,%d,%d and %d%n", number3, number1, number2, number4, number5);
        }else if (number4 > number1 && number4 > number2 && number4 >number3 && number4 >number5) {
            System.out.printf("%d is greater than %d,%d,%d and %d%n", number4, number1, number2, number3, number5);
        }else{
            System.out.printf("%d is greater than %d,%d,%d and %d%n", number5, number1, number2, number3, number4);
        }
    }
}
