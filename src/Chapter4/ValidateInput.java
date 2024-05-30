package Chapter4;

import java.util.Scanner;

public class ValidateInput {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in) ;
        int value;
        do{
            System.out.println("ENTER 1 OR 2:");
            value = input.nextInt();
        }while (value != 1 && value != 2);
            System.out.println("You have entered:" + value);

    }
}
