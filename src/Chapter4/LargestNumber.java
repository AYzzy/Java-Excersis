package Chapter4;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in) ;

        int count ;
        int largest =0;
        int number=0;

        for(count=1 ; count < 10 ; ){
            System.out.println("Enter number: ");
            number = input.nextInt();
            count += 1;
            if(number > largest){
                largest = number;
            }

        }

        System.out.println("The largest number is: "+ largest);
        System.out.printf("The most recent input is: %d%n", number);

    }
}
