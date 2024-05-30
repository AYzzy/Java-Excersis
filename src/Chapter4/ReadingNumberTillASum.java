package Chapter4;

import java.util.Scanner;

public class ReadingNumberTillASum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int total=0;
        int value;
        int count =0;
        System.out.println("Enter the main value: " );
        int main = input.nextInt();

        do {
            System.out.println("Enter a value: " );
            value = input.nextInt();
            total+=value;
            count++;
        }while(total<main);
        System.out.println("The total of the value inputted : "+count);
        System.out.println("The total sum of value : "+ total );

    }
}
