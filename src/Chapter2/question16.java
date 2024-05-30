package Chapter2;

import java.util.Scanner;

public class question16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();

        int square1 =  number1 * number1;

        if(square1 > 100){
            System.out.printf("%d is grater than 100", square1);
        } else if (square1 < 100) {
            System.out.printf("%d is less than 100",square1);
        }else{
            System.out.printf("%d is equals to 100",square1);
        }
    }
}
