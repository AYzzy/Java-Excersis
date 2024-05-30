package Chapter2;

import java.util.Scanner;

public class question15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number2 = scanner.nextInt();

        int square1 =  number1 * number1;
        int square2 = number2 * number2;

        int sumTotal= square1+square2;

        int difference =  square1 - square2;

        System.out.printf("The square of %d is %d%n",number1, square1);
        System.out.printf("The square of %d is %d%n",number2, square2);
        System.out.printf("The sum of both square is %d%n", sumTotal);
        System.out.printf("The difference of both square is %d%n", difference);
    }
}
