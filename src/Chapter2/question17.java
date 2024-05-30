package Chapter2;

import java.util.Scanner;

public class question17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter first number: ");
        int number3 = scanner.nextInt();

        int sumTotal= number1 + number2 + number3;
        int average = number1 + number2 + number3/3;
        int product = number1 * number2 * number3;
        System.out.printf("The total sum of %d,%d and %d = %d%n",number1,number2,number3,sumTotal);
        System.out.printf("The average of %d,%d and %d =%d%n",number1,number2,number3,average);
        System.out.printf("The product of %d,%d and %d =%d%n",number1,number2,number3,product);

        if(number1 > number2 && number1 >number3 ){
            System.out.printf("%d is greater than %d and %d%n",number1,number2,number3);
        } else if (number2 > number1 && number2 > number3) {
            System.out.printf("%d is greater than %d and %d%n",number2,number1,number3);
        }else {
            System.out.printf("%d is greater than %d and %d%n",number3,number1,number2);
        }




    }
}
