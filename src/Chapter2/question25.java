package Chapter2;

import java.util.Scanner;

public class question25 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        int total = number1 % 3;

        if (total ==0){
            System.out.printf("%d is divisible by 3", number1);
        }else{
            System.out.printf("%d isn't divisible by 3 ", number1);
        }
    }
}
