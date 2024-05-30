package Chapter2;

import java.util.Scanner;

public class question33 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter your weight in pounds:");
        int weightInPounds = scanner.nextInt();

        System.out.println("Enter your height in inches:");
        int heightInInches = scanner.nextInt();

        double bmi = (weightInPounds * 703.0) / (heightInInches * heightInInches);

        System.out.println("Your BMI is: " + bmi);
        System.out.println("BMI Categories:");
        System.out.println("Underweight: less than 18.5");
        System.out.println("Normal weight: 18.5–24.9");
        System.out.println("Overweight: 25–29.9");
        System.out.println("Obesity: 30 or greater");

    }
}
