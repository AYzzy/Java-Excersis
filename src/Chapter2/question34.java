package Chapter2;

import java.util.Scanner;

public class question34 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter world population:");
        int currentPopulation = scanner.nextInt();

        System.out.println("Enter the annual world population growth rate:");
        double annualGrowthRate = scanner.nextDouble();

        double calculatePopulationForFirstYear  = currentPopulation * 1 * (1+annualGrowthRate/100);
        double calculatePopulationForSecondYear = currentPopulation * 2 * (1+annualGrowthRate/100);
        double calculatePopulationForThirdYear  = currentPopulation * 3 * (1+annualGrowthRate/100);
        double calculatePopulationForFourthYear = currentPopulation * 4 * (1+annualGrowthRate/100);
        double calculatePopulationForFifthYear  = currentPopulation * 5 * (1+annualGrowthRate/100);

        System.out.println("Estimated world population after one year: " + calculatePopulationForFirstYear);
        System.out.println("Estimated world population after one year: " + calculatePopulationForSecondYear);
        System.out.println("Estimated world population after one year: " + calculatePopulationForThirdYear);
        System.out.println("Estimated world population after one year: " + calculatePopulationForFourthYear);
        System.out.println("Estimated world population after one year: " + calculatePopulationForFifthYear);
    }
}
