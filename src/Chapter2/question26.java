package Chapter2;

import java.util.Scanner;

public class question26 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter second number: ");
        int number2 = scanner.nextInt();

        int triple = number1 + number1 + number1;
        int numberDouble = number2 + number2;

        if(numberDouble % triple == 0){
            System.out.println(number1 * 3 + " is a multiple of " + number2 * 2);
        }else{
            System.out.println(number1 * 3 + " is not a multiple of " + number2 * 2);
        }
    }
}
