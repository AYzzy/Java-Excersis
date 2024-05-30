package Chapter4;

import java.util.Scanner;
import java.text.NumberFormat;

public class SaleCommissionCalculator2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double totalSales = 0.0;
        double itemValue;
        double soldValue;
        double totalProfit = 0;


        System.out.println("Enter the salesperson's items sold for last week.");
        System.out.println("Enter -1 to finish.");

        System.out.print("Enter item value(Enter -1 to exit): ");
        itemValue = input.nextDouble();


        while (itemValue != -1) {
            totalSales +=itemValue;

            System.out.print("Enter the value of item sold: ");
            soldValue = input.nextDouble();

            double earnings = 200 + (0.09 * soldValue);
            totalProfit += earnings;

            System.out.print("Enter item value(Enter -1 to exit): ");
            itemValue = input.nextDouble();

        }



        System.out.println("The total item sold last week:" + totalSales);
        System.out.println("The salesperson's earnings for last week: " + totalProfit);

    }
}

