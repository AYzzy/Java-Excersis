package Chapter2;

import java.util.Scanner;

public class question28 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);

        System.out.println("Enter radius of the circle: ");
        int radius = scanner.nextInt();

        double pi = 3.142;

        int diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * radius;

        System.out.printf("The diameter of the circle = %d%n",diameter );
        System.out.printf("The circumference of the circle = %.3f%n",circumference);
        System.out.printf("The are of the circle = %.2f%n",area);
    }
}
